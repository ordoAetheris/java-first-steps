# Коллекции: List, Set, Map

## Зачем — массив фиксированный, коллекция растёт
```java
import java.util.*;

List<String> names = new ArrayList<>();
names.add("Павел");
names.add("Анна");
names.get(0);       // "Павел"
names.size();       // 2
names.remove(0);    // удалить первый
```

## List (список) — упорядоченный, допускает дубликаты
ArrayList — быстрый доступ по индексу. LinkedList — быстрая вставка/удаление.

## Set (набор) — без дубликатов
```java
Set<String> unique = new HashSet<>();
unique.add("Java"); unique.add("Java"); // один элемент!
unique.size();  // 1
```

## Map (словарь) — ключ → значение
```java
Map<String, Integer> ages = new HashMap<>();
ages.put("Павел", 28);
ages.put("Анна", 25);
ages.get("Павел");     // 28
ages.containsKey("Анна"); // true
for (var entry : ages.entrySet()) {
    System.out.println(entry.getKey() + ": " + entry.getValue());
}
```

## Generics (обобщения) — тип в угловых скобках
`List<String>` — список строк. `Map<String, Integer>` — ключ-строка, значение-число. Компилятор проверяет типы.
