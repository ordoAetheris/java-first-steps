public class RunTests {
    static int passed = 0, failed = 0;
    public static void main(String[] args) {
        System.out.println("=== Тесты: Массивы ===\n");

        // Sum
        int[] arr = {10, 25, 33, 14, 7, 88, 42};
        int sum = 0; for (int x : arr) sum += x;
        check("Sum", sum, 219);
        check("Avg", sum / arr.length, 31);

        // Min/Max
        int min = arr[0], max = arr[0];
        for (int x : arr) { if (x < min) min = x; if (x > max) max = x; }
        check("Min", min, 7);
        check("Max", max, 88);

        // Reverse
        int[] rev = {1,2,3,4,5};
        for (int i = 0, j = rev.length-1; i < j; i++, j--) { int t = rev[i]; rev[i] = rev[j]; rev[j] = t; }
        check("Reverse[0]", rev[0], 5);
        check("Reverse[4]", rev[4], 1);

        // Reference trap
        int[] a = {1,2,3};
        int[] b = a;
        b[0] = 999;
        check("Reference: a[0] after b[0]=999", a[0], 999);

        // Bubble sort
        int[] unsorted = {42, 7, 15, 3, 99, 1};
        for (int i = 0; i < unsorted.length; i++)
            for (int j = 0; j < unsorted.length-1-i; j++)
                if (unsorted[j] > unsorted[j+1]) { int t = unsorted[j]; unsorted[j] = unsorted[j+1]; unsorted[j+1] = t; }
        check("Sorted[0]", unsorted[0], 1);
        check("Sorted[5]", unsorted[5], 99);

        System.out.println("\n=== Результат: " + passed + " PASS, " + failed + " FAIL ===");
    }
    static void check(String n, long a, long e) {
        if (a == e) { System.out.println("  PASS: " + n); passed++; }
        else { System.out.println("  FAIL: " + n + " — expected " + e + ", got " + a); failed++; }
    }
}
