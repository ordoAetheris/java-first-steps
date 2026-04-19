import java.util.*;
public class RunTests {
    static int passed = 0, failed = 0;
    public static void main(String[] args) {
        System.out.println("=== Тесты: Коллекции ===\n");
        List<String> list = new ArrayList<>(Arrays.asList("a","b","c"));
        check("List size", list.size(), 3);
        list.add("d"); check("After add", list.size(), 4);
        list.remove("b"); check("After remove", list.size(), 3);

        Set<String> set = new HashSet<>();
        set.add("java"); set.add("java"); set.add("go");
        check("Set no dupes", set.size(), 2);

        Map<String, Integer> map = new HashMap<>();
        map.put("a", 1); map.put("b", 2);
        check("Map get", map.get("a"), 1);
        check("Map size", map.size(), 2);

        Map<String, Integer> freq = new HashMap<>();
        for (String w : "the cat sat on the mat the cat".split(" ")) freq.merge(w, 1, Integer::sum);
        check("freq 'the'", freq.get("the"), 3);
        check("freq 'cat'", freq.get("cat"), 2);

        // Dedup with order preserved
        List<String> dupes = Arrays.asList("c","a","b","a","c","d");
        List<String> deduped = new ArrayList<>(new LinkedHashSet<>(dupes));
        check("Dedup size", deduped.size(), 4);
        check("Dedup order[0]", deduped.get(0).equals("c") ? 1 : 0, 1);

        System.out.println("\n=== Результат: " + passed + " PASS, " + failed + " FAIL ===");
    }
    static void check(String n, long a, long e) {
        if (a == e) { System.out.println("  PASS: " + n); passed++; }
        else { System.out.println("  FAIL: " + n + " expected " + e + " got " + a); failed++; }
    }
}
