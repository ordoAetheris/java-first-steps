/**
 * Тесты для заданий по переменным.
 *
 * Запуск:
 *   cd 01_variables/tests
 *   javac RunTests.java
 *   java RunTests
 *
 * Ваши файлы Task01.java - Task10.java должны лежать в 01_variables/
 */
public class RunTests {

    static int passed = 0;
    static int failed = 0;

    public static void main(String[] args) {
        System.out.println("=== Тесты: Переменные и типы данных ===\n");

        // Task 03: Size converter
        testTask03();

        // Task 05: Integer division
        testTask05();

        // Task 06: Overflow
        testTask06();

        // Task 07: Double precision
        testTask07();

        System.out.println("\n=== Результат: " + passed + " PASS, " + failed + " FAIL ===");
        if (failed > 0) System.exit(1);
    }

    static void testTask03() {
        System.out.println("--- Task 03: Размер файла ---");
        long bytes = 1_625_374_720L;
        long gb = bytes / (1024L * 1024 * 1024);
        long remainder = bytes % (1024L * 1024 * 1024);
        long mb = remainder / (1024 * 1024);
        remainder = remainder % (1024 * 1024);
        long kb = remainder / 1024;
        long b = remainder % 1024;

        check("GB", gb, 1);
        check("MB", mb, 526);
        check("KB", kb, 80);
        check("bytes", b, 0);
    }

    static void testTask05() {
        System.out.println("--- Task 05: Целочисленное деление ---");
        check("10 / 3", 10 / 3, 3);
        check("1 / 2", 1 / 2, 0);
        checkDouble("10.0 / 3", 10.0 / 3, 3.3333, 0.001);
        checkDouble("1.0 / 2", 1.0 / 2, 0.5, 0.001);
    }

    static void testTask06() {
        System.out.println("--- Task 06: Переполнение ---");
        check("MAX_VALUE + 1", Integer.MAX_VALUE + 1, Integer.MIN_VALUE);
        check("MIN_VALUE - 1", Integer.MIN_VALUE - 1, Integer.MAX_VALUE);
    }

    static void testTask07() {
        System.out.println("--- Task 07: Точность double ---");
        double sum = 0.1 + 0.2;
        checkBool("0.1 + 0.2 == 0.3", sum == 0.3, false);
        checkBool("Math.abs(sum - 0.3) < 0.0001", Math.abs(sum - 0.3) < 0.0001, true);
    }

    // === Утилиты ===

    static void check(String name, long actual, long expected) {
        if (actual == expected) {
            System.out.println("  PASS: " + name + " = " + actual);
            passed++;
        } else {
            System.out.println("  FAIL: " + name + " — expected " + expected + ", got " + actual);
            failed++;
        }
    }

    static void checkDouble(String name, double actual, double expected, double epsilon) {
        if (Math.abs(actual - expected) < epsilon) {
            System.out.println("  PASS: " + name + " ≈ " + actual);
            passed++;
        } else {
            System.out.println("  FAIL: " + name + " — expected ~" + expected + ", got " + actual);
            failed++;
        }
    }

    static void checkBool(String name, boolean actual, boolean expected) {
        if (actual == expected) {
            System.out.println("  PASS: " + name + " = " + actual);
            passed++;
        } else {
            System.out.println("  FAIL: " + name + " — expected " + expected + ", got " + actual);
            failed++;
        }
    }
}
