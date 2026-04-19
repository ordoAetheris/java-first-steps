# Методы

## Зачем
Код повторяется? Вынеси в метод. Код длинный? Разбей на методы. Метод — именованный кусок логики, который можно вызвать сколько угодно раз.

## Анатомия метода
```java
//  возвращаемый_тип  имя(параметры)
    static int        add(int a, int b) {
        return a + b;  // вернуть результат
    }
```

- `static` — пока везде, объясним позже (в ООП)
- `int` — тип того что метод возвращает
- `void` — если ничего не возвращает
- `return` — вернуть значение и выйти из метода

## Вызов
```java
int result = add(10, 20);  // result = 30
int other = add(5, 3);     // other = 8
```

## void — ничего не возвращает
```java
static void greet(String name) {
    System.out.println("Привет, " + name + "!");
    // нет return (или return; без значения)
}
```

## Перегрузка (overloading) — одно имя, разные параметры
```java
static int abs(int x) { return x < 0 ? -x : x; }
static double abs(double x) { return x < 0 ? -x : x; }
// Java выберет правильный по типу аргумента
```

## Массив как параметр
```java
static int sum(int[] arr) {
    int total = 0;
    for (int x : arr) total += x;
    return total;
}
```
Массив передаётся **по ссылке** — если измените внутри метода, изменится и снаружи.
