# Задания: Generics (обобщения) и Enum (перечисления)

## Задание 1: Box<T> — коробка любого типа ★☆☆
Файлы: `Box.java`, `Task01.java`. Класс Box хранит один элемент типа T. `put(T value)`, `T get()`, `boolean isEmpty()`.
```bash
javac *.java && java Task01
# Box<String>: содержит 'hello'
# Box<Integer>: содержит 42
# Box<Double>: пуст
```

## Задание 2: Pair<K,V> — пара значений ★★☆
Файлы: `Pair.java`, `Task02.java`. Два значения разных типов. `Pair<String, Integer>` = (имя, возраст).

## Задание 3: Storage<T> — обобщённое хранилище ★★☆
Файл `Storage.java`. Внутри — `ArrayList<T>`. Методы: `add(T)`, `T get(int index)`, `int size()`, `boolean contains(T)`.

## Задание 4: Season enum с температурой ★☆☆
Файл `Season.java`. WINTER(-20,0), SPRING(0,15), SUMMER(15,35), AUTUMN(0,15). Поля: minTemp, maxTemp.
```bash
java Task04
# WINTER: от -20°C до 0°C
# SUMMER: от 15°C до 35°C
```

## Задание 5: CoffeeSize enum с ценой ★★☆
Файл `CoffeeSize.java`. SMALL(200мл, 150р), MEDIUM(350мл, 250р), LARGE(500мл, 350р). Поля: ml, price.

## Задание 6: Bounded generic (ограниченный тип) ★★★
Метод `static <T extends Comparable<T>> T max(T a, T b)`. T обязан реализовать Comparable (быть сравнимым). Работает для Integer, String, любого Comparable.

## Задание 7: OrderStatus enum + валидация переходов ★★☆
CREATED → PAID → SHIPPED → DELIVERED. Метод `canTransitionTo(OrderStatus next)`. Нельзя: SHIPPED → CREATED, DELIVERED → PAID.

## Задание 8: Wildcard (подстановочный тип) ★★★
`List<?>` — список чего угодно (только чтение). `List<? extends Number>` — список любых чисел. `List<? super Integer>` — список куда можно положить Integer.

## Задание 9: Generic метод — firstNonNull ★★☆
`static <T> T firstNonNull(T a, T b)` — вернуть первый не-null аргумент. Если оба null → бросить exception.

## Задание 10: Кофейня — enum + generic Order ★★★
`CoffeeSize` enum + `Order<T extends Beverage>` generic класс. Типобезопасный заказ: `Order<Coffee>` не примет `Tea`.
