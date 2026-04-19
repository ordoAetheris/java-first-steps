public class RunTests {
    static int passed = 0, failed = 0;

    public static void main(String[] args) {
        System.out.println("=== Тесты: ООП Basics ===\n");

        // BankAccount
        testBankAccount();
        // Rectangle
        testRectangle();
        // Static counter
        testStaticCounter();
        // this trap
        testThisTrap();

        System.out.println("\n=== Результат: " + passed + " PASS, " + failed + " FAIL ===");
    }

    static void testBankAccount() {
        System.out.println("--- BankAccount ---");
        // Simulate
        double balance = 1000;
        balance += 500; // deposit
        check("After deposit 500", (long)balance, 1500);
        double withdraw = 2000;
        if (withdraw > balance) { /* rejected */ }
        else balance -= withdraw;
        check("Withdraw 2000 rejected, balance unchanged", (long)balance, 1500);
        balance -= 300; // valid withdraw
        check("After withdraw 300", (long)balance, 1200);
    }

    static void testRectangle() {
        System.out.println("--- Rectangle ---");
        int w = 5, h = 3;
        check("Area 5x3", w * h, 15);
        check("Perimeter 5x3", 2 * (w + h), 16);
        check("isSquare 5x3", (w == h) ? 1 : 0, 0);
        check("isSquare 4x4", (4 == 4) ? 1 : 0, 1);
    }

    static void testStaticCounter() {
        System.out.println("--- Static Counter ---");
        // Simulate static counter behavior
        int count = 0;
        for (int i = 0; i < 10; i++) count++; // each "new Counter()"
        check("10 objects → count=10", count, 10);
    }

    static void testThisTrap() {
        System.out.println("--- this trap ---");
        // Without this: field stays null
        String name = null;
        String param = "Павел";
        // BUG: name = name → param assigned to itself
        // name is still null
        check("Without this: name is null", name == null ? 1 : 0, 1);
        // FIX: this.name = name
        name = param;
        check("With this: name is Павел", "Павел".equals(name) ? 1 : 0, 1);
    }

    static void check(String n, long a, long e) {
        if (a == e) { System.out.println("  PASS: " + n); passed++; }
        else { System.out.println("  FAIL: " + n + " expected " + e + " got " + a); failed++; }
    }
}
