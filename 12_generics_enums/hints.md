# Подсказки
## 1: class Box<T> { T value; }. Box<String> b = new Box<>("hello"); b.get()
## 2: class Pair<K,V> { K key; V value; }
## 3: Внутри: ArrayList<T>. Снаружи: Storage<String> s = new Storage<>(); s.add("x");
## 4: enum Season { WINTER(-20,0), ... }. Конструктор + поля
## 5: CoffeeSize.values() — массив всех значений. CoffeeSize.valueOf("LARGE")
## 6: <T extends Comparable<T>>: T обязан иметь compareTo(). Можно сравнивать.
## 7: enum OrderStatus { CREATED, PAID, SHIPPED, DELIVERED }. switch + transition validation
## 8: ? extends = можно читать. ? super = можно писать. PECS: Producer Extends, Consumer Super
## 9: static <T extends Comparable<T>> T max(T a, T b) { return a.compareTo(b) > 0 ? a : b; }
## 10: abstract class Beverage. Coffee extends Beverage. Order<T extends Beverage>
