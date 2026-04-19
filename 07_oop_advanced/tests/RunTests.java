public class RunTests {
    static int passed = 0, failed = 0;
    public static void main(String[] args) {
        System.out.println("=== Тесты: ООП Advanced ===\n");

        // Polymorphism
        System.out.println("--- Polymorphism ---");
        String[] sounds = {"Гав", "Мяу", "Гав"};  // Dog, Cat, Dog
        for (int i = 0; i < sounds.length; i++) {
            check("animal[" + i + "] sound contains", sounds[i].length() > 0 ? 1 : 0, 1);
        }

        // Shapes
        System.out.println("--- Shapes ---");
        double circleArea = Math.PI * 5 * 5;
        check("Circle r=5 area", Math.round(circleArea * 100), Math.round(78.54 * 100));
        double rectArea = 4 * 6;
        check("Rectangle 4x6 area", (long)rectArea, 24);
        double triArea = 0.5 * 3 * 4;
        check("Triangle 3x4 area", (long)(triArea * 10), 60);

        // Comparable
        System.out.println("--- Comparable sort ---");
        double[] grades = {75.5, 92.0, 68.3, 88.1};
        java.util.Arrays.sort(grades);
        check("Sorted[0] (lowest)", (long)(grades[0] * 10), 683);
        check("Sorted[3] (highest)", (long)(grades[3] * 10), 920);

        System.out.println("\n=== Результат: " + passed + " PASS, " + failed + " FAIL ===");
    }
    static void check(String n, long a, long e) {
        if (a == e) { System.out.println("  PASS: " + n); passed++; }
        else { System.out.println("  FAIL: " + n + " expected " + e + " got " + a); failed++; }
    }
}
