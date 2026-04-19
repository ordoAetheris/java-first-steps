public class RunTests {
    static int passed = 0, failed = 0;
    public static void main(String[] args) {
        System.out.println("=== Тесты: Generics & Enum ===\n");
        // Generic max
        check("max(3,7)", max(3, 7), 7);
        check("max('a','z')", max('a', 'z'), 'z');
        // Enum
        check("Season count", Season.values().length, 4);
        check("Season valueOf", Season.valueOf("SUMMER").ordinal(), 2);
        // CoffeeSize
        check("LARGE ml", CoffeeSize.LARGE.ml, 500);
        check("SMALL price", CoffeeSize.SMALL.price, 150);
        System.out.println("\n=== Результат: " + passed + " PASS, " + failed + " FAIL ===");
    }
    static <T extends Comparable<T>> T max(T a, T b) { return a.compareTo(b) > 0 ? a : b; }
    enum Season { WINTER, SPRING, SUMMER, AUTUMN }
    enum CoffeeSize {
        SMALL(200,150), MEDIUM(350,250), LARGE(500,350);
        final int ml, price;
        CoffeeSize(int ml, int price) { this.ml = ml; this.price = price; }
    }
    static void check(String n, long a, long e) {
        if (a == e) { System.out.println("  PASS: " + n); passed++; }
        else { System.out.println("  FAIL: " + n + " expected " + e + " got " + a); failed++; }
    }
}
