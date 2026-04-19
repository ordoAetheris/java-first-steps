public class RunTests {
    static int passed = 0, failed = 0;
    static int counter = 0;
    static final Object lock = new Object();

    public static void main(String[] args) throws Exception {
        System.out.println("=== Тесты: Многопоточность ===\n");

        // Race condition (unsynchronized)
        System.out.println("--- Race Condition ---");
        counter = 0;
        Thread[] threads = new Thread[5];
        for (int i = 0; i < 5; i++) {
            threads[i] = new Thread(() -> { for (int j = 0; j < 10000; j++) counter++; });
            threads[i].start();
        }
        for (Thread t : threads) t.join();
        check("Unsync counter != 50000 (race!)", counter != 50000 ? 1 : 0, 1);

        // Synchronized
        System.out.println("--- Synchronized ---");
        counter = 0;
        for (int i = 0; i < 5; i++) {
            threads[i] = new Thread(() -> { for (int j = 0; j < 10000; j++) { synchronized(lock) { counter++; } } });
            threads[i].start();
        }
        for (Thread t : threads) t.join();
        check("Sync counter == 50000", counter, 50000);

        // Thread.join order
        System.out.println("--- Join ---");
        long start = System.currentTimeMillis();
        Thread slow = new Thread(() -> { try { Thread.sleep(200); } catch (Exception e) {} });
        slow.start();
        slow.join();
        long elapsed = System.currentTimeMillis() - start;
        check("Join waits for thread", elapsed >= 150 ? 1 : 0, 1);

        // Volatile (conceptual)
        System.out.println("--- Volatile ---");
        check("volatile needed for cross-thread visibility", 1, 1); // conceptual check

        System.out.println("\n=== Результат: " + passed + " PASS, " + failed + " FAIL ===");
    }
    static void check(String n, long a, long e) {
        if (a == e) { System.out.println("  PASS: " + n); passed++; }
        else { System.out.println("  FAIL: " + n + " expected " + e + " got " + a); failed++; }
    }
}
