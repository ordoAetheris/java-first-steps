# Generics и Enum

## Generics — типобезопасные контейнеры
```java
class Box<T> {       // T — параметр типа
    private T value;
    public Box(T value) { this.value = value; }
    public T get() { return value; }
}
Box<String> strBox = new Box<>("hello"); // T = String
Box<Integer> intBox = new Box<>(42);     // T = Integer
```
Без generics: Box хранит Object, нужно кастить. С generics: компилятор проверяет тип.

## Enum — фиксированный набор констант
```java
enum Season { WINTER, SPRING, SUMMER, AUTUMN }
Season s = Season.SUMMER;
switch (s) { case SUMMER -> System.out.println("Лето!"); }
```

## Enum с полями
```java
enum CoffeeSize {
    SMALL(200, 150), MEDIUM(350, 250), LARGE(500, 350);
    final int ml;
    final int price;
    CoffeeSize(int ml, int price) { this.ml = ml; this.price = price; }
}
CoffeeSize.LARGE.price  // 350
```
