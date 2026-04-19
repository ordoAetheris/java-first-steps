public class RunTests {
    static int passed = 0, failed = 0;
    public static void main(String[] args) {
        System.out.println("=== Тесты: Методы ===\n");
        check("max(3,7)", max(3,7), 7);
        check("max(-1,-5)", max(-1,-5), -1);
        check("abs(-42)", abs(-42), 42);
        check("pow(2,10)", pow(2,10), 1024);
        check("isLeapYear(2000)", isLeapYear(2000) ? 1 : 0, 1);
        check("isLeapYear(1900)", isLeapYear(1900) ? 1 : 0, 0);
        check("isLeapYear(2024)", isLeapYear(2024) ? 1 : 0, 1);
        check("factorial(5)", factorial(5), 120);
        check("factorial(0)", factorial(0), 1);
        check("isPalindrome('racecar')", isPalindrome("racecar") ? 1 : 0, 1);
        check("isPalindrome('hello')", isPalindrome("hello") ? 1 : 0, 0);

        int[] arr = {1,2,3};
        doubleAll(arr);
        check("doubleAll: arr[0]", arr[0], 2);
        check("doubleAll: arr[2]", arr[2], 6);

        System.out.println("\n=== Результат: " + passed + " PASS, " + failed + " FAIL ===");
    }
    static int max(int a, int b) { return a > b ? a : b; }
    static int abs(int x) { return x < 0 ? -x : x; }
    static int pow(int base, int exp) { int r = 1; for (int i = 0; i < exp; i++) r *= base; return r; }
    static boolean isLeapYear(int y) { return (y % 4 == 0 && y % 100 != 0) || y % 400 == 0; }
    static long factorial(int n) { if (n <= 1) return 1; return n * factorial(n-1); }
    static boolean isPalindrome(String s) { return s.equals(new StringBuilder(s).reverse().toString()); }
    static void doubleAll(int[] a) { for (int i = 0; i < a.length; i++) a[i] *= 2; }
    static void check(String n, long a, long e) {
        if (a == e) { System.out.println("  PASS: " + n); passed++; }
        else { System.out.println("  FAIL: " + n + " expected " + e + " got " + a); failed++; }
    }
}
