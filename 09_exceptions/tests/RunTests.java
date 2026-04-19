public class RunTests {
    static int passed = 0, failed = 0;
    public static void main(String[] args) {
        System.out.println("=== Тесты: Исключения ===\n");
        testDivisionByZero();
        testNumberFormat();
        testCustomException();
        testNPE();
        System.out.println("\n=== Результат: " + passed + " PASS, " + failed + " FAIL ===");
    }
    static void testDivisionByZero() {
        System.out.println("--- Division by zero ---");
        try { int x = 10 / 0; check("Should not reach", 0, 1); }
        catch (ArithmeticException e) { check("Caught ArithmeticException", 1, 1); }
    }
    static void testNumberFormat() {
        System.out.println("--- NumberFormat ---");
        try { Integer.parseInt("abc"); check("Should not reach", 0, 1); }
        catch (NumberFormatException e) { check("Caught NumberFormatException", 1, 1); }
        try { int x = Integer.parseInt("42"); check("Valid parse", x, 42); }
        catch (NumberFormatException e) { check("Should not throw", 0, 1); }
    }
    static void testCustomException() {
        System.out.println("--- Custom Exception ---");
        try { throw new RuntimeException("Insufficient funds: balance=100, amount=200");
        } catch (RuntimeException e) { check("Custom msg contains 'funds'", e.getMessage().contains("funds") ? 1 : 0, 1); }
    }
    static void testNPE() {
        System.out.println("--- NullPointerException ---");
        String s = null;
        try { s.length(); check("Should not reach", 0, 1); }
        catch (NullPointerException e) { check("Caught NPE on null.length()", 1, 1); }
    }
    static void check(String n, long a, long e) {
        if (a == e) { System.out.println("  PASS: " + n); passed++; }
        else { System.out.println("  FAIL: " + n + " expected " + e + " got " + a); failed++; }
    }
}
