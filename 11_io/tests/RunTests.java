import java.io.*;
import java.nio.file.*;
public class RunTests {
    static int passed = 0, failed = 0;
    public static void main(String[] args) throws Exception {
        System.out.println("=== Тесты: Файлы ===\n");
        Path tmp = Files.createTempFile("test", ".txt");
        // Write + Read
        Files.writeString(tmp, "line1\nline2\nline3");
        String content = Files.readString(tmp);
        check("writeString+readString", content.contains("line2") ? 1 : 0, 1);
        check("line count", content.split("\n").length, 3);
        // BufferedReader
        int count = 0;
        try (BufferedReader r = Files.newBufferedReader(tmp)) { while (r.readLine() != null) count++; }
        check("BufferedReader lines", count, 3);
        // Copy
        Path copy = Files.createTempFile("copy", ".txt");
        Files.copy(tmp, copy, StandardCopyOption.REPLACE_EXISTING);
        check("Copy equals", Files.readString(copy).equals(Files.readString(tmp)) ? 1 : 0, 1);
        // Cleanup
        Files.delete(tmp); Files.delete(copy);
        check("Cleanup", !Files.exists(tmp) ? 1 : 0, 1);
        System.out.println("\n=== Результат: " + passed + " PASS, " + failed + " FAIL ===");
    }
    static void check(String n, long a, long e) {
        if (a == e) { System.out.println("  PASS: " + n); passed++; }
        else { System.out.println("  FAIL: " + n + " expected " + e + " got " + a); failed++; }
    }
}
