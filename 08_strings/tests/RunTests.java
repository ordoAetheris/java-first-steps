public class RunTests {
    static int passed = 0, failed = 0;
    public static void main(String[] args) {
        System.out.println("=== Тесты: Строки ===\n");
        check("reverse 'hello'", reverse("hello"), "olleh");
        check("reverse 'a'", reverse("a"), "a");
        check("wordCount", wordCount("  hello   world  test  "), 3);
        check("isPalin 'racecar'", isPalindrome("racecar") ? 1 : 0, 1);
        check("isPalin 'hello'", isPalindrome("hello") ? 1 : 0, 0);
        check("camelToSnake", camelToSnake("myVariableName"), "my_variable_name");
        check("isAnagram", isAnagram("listen", "silent") ? 1 : 0, 1);
        check("isAnagram neg", isAnagram("hello", "world") ? 1 : 0, 0);
        System.out.println("\n=== Результат: " + passed + " PASS, " + failed + " FAIL ===");
    }
    static String reverse(String s) {
        char[] c = s.toCharArray(); for (int i = 0, j = c.length-1; i < j; i++, j--) { char t = c[i]; c[i] = c[j]; c[j] = t; } return new String(c);
    }
    static int wordCount(String s) { return s.trim().isEmpty() ? 0 : s.trim().split("\\s+").length; }
    static boolean isPalindrome(String s) { return s.equals(new StringBuilder(s).reverse().toString()); }
    static String camelToSnake(String s) {
        StringBuilder sb = new StringBuilder();
        for (char c : s.toCharArray()) { if (Character.isUpperCase(c)) sb.append('_'); sb.append(Character.toLowerCase(c)); } return sb.toString();
    }
    static boolean isAnagram(String a, String b) {
        char[] ca = a.toLowerCase().toCharArray(); char[] cb = b.toLowerCase().toCharArray();
        java.util.Arrays.sort(ca); java.util.Arrays.sort(cb); return java.util.Arrays.equals(ca, cb);
    }
    static void check(String n, String a, String e) {
        if (e.equals(a)) { System.out.println("  PASS: " + n); passed++; }
        else { System.out.println("  FAIL: " + n + " expected '" + e + "' got '" + a + "'"); failed++; }
    }
    static void check(String n, long a, long e) {
        if (a == e) { System.out.println("  PASS: " + n); passed++; }
        else { System.out.println("  FAIL: " + n + " expected " + e + " got " + a); failed++; }
    }
}
