public class RunTests {
    static int passed = 0, failed = 0;

    public static void main(String[] args) {
        System.out.println("=== Тесты: Управление выполнением ===\n");

        testStringEquals();
        testFallThrough();
        testTaxCalc();

        System.out.println("\n=== Результат: " + passed + " PASS, " + failed + " FAIL ===");
        if (failed > 0) System.exit(1);
    }

    static void testStringEquals() {
        System.out.println("--- Task 08: String == vs equals ---");
        String a = "hello";
        String b = "hello";
        String c = new String("hello");
        check("a == b (string pool)", a == b, true);
        check("a == c (new String)", a == c, false);
        check("a.equals(c)", a.equals(c), true);
    }

    static void testFallThrough() {
        System.out.println("--- Task 09: switch fall-through ---");
        // Without break, day=3 prints Wednesday, Thursday, Friday, Weekend
        int count = 0;
        int day = 3;
        switch (day) {
            case 1: count++;
            case 2: count++;
            case 3: count++;
            case 4: count++;
            case 5: count++;
            default: count++;
        }
        check("fall-through from case 3: executes 4 cases", count, 4);
    }

    static void testTaxCalc() {
        System.out.println("--- Task 07: Progressive tax ---");
        long income = 6_000_000;
        long tax = (long)(Math.min(income, 2_400_000) * 0.13
                + Math.min(Math.max(income - 2_400_000, 0), 2_600_000) * 0.15
                + Math.max(income - 5_000_000, 0) * 0.22);
        check("Tax on 6M", tax, 922_000);

        income = 1_000_000;
        tax = (long)(income * 0.13);
        check("Tax on 1M (13%)", tax, 130_000);
    }

    static void check(String name, long actual, long expected) {
        if (actual == expected) { System.out.println("  PASS: " + name); passed++; }
        else { System.out.println("  FAIL: " + name + " — expected " + expected + ", got " + actual); failed++; }
    }
    static void check(String name, boolean actual, boolean expected) {
        if (actual == expected) { System.out.println("  PASS: " + name + " = " + actual); passed++; }
        else { System.out.println("  FAIL: " + name + " — expected " + expected + ", got " + actual); failed++; }
    }
}
