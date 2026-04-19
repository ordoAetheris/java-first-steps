public class RunTests {
    static int passed = 0, failed = 0;
    public static void main(String[] args) {
        System.out.println("=== Тесты: Циклы ===\n");

        // Digit sum
        check("digitSum(12345)", digitSum(12345), 15);
        check("digitSum(9999)", digitSum(9999), 36);
        check("digitSum(0)", digitSum(0), 0);

        // Fibonacci
        int[] fib = fibonacci(10);
        check("fib[0]", fib[0], 0);
        check("fib[1]", fib[1], 1);
        check("fib[9]", fib[9], 34);

        // isPrime
        check("isPrime(2)", isPrime(2) ? 1 : 0, 1);
        check("isPrime(17)", isPrime(17) ? 1 : 0, 1);
        check("isPrime(15)", isPrime(15) ? 1 : 0, 0);
        check("isPrime(1)", isPrime(1) ? 1 : 0, 0);

        System.out.println("\n=== Результат: " + passed + " PASS, " + failed + " FAIL ===");
    }
    static int digitSum(int n) { int s = 0; while (n > 0) { s += n % 10; n /= 10; } return s; }
    static int[] fibonacci(int n) {
        int[] f = new int[n]; f[0] = 0; if (n > 1) f[1] = 1;
        for (int i = 2; i < n; i++) f[i] = f[i-1] + f[i-2]; return f;
    }
    static boolean isPrime(int n) {
        if (n < 2) return false;
        for (int i = 2; i * i <= n; i++) if (n % i == 0) return false;
        return true;
    }
    static void check(String name, long a, long e) {
        if (a == e) { System.out.println("  PASS: " + name); passed++; }
        else { System.out.println("  FAIL: " + name + " expected " + e + " got " + a); failed++; }
    }
}
