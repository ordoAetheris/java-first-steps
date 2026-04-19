# Управление выполнением: if, else, switch

## Что это

Программа без условий — как рецепт без "если". Всегда одно и то же. Условия позволяют коду принимать решения.

## if / else

```java
int age = 17;

if (age >= 18) {
    System.out.println("Добро пожаловать");
} else {
    System.out.println("Доступ запрещён");
}
```

Цепочка условий:

```java
int score = 75;

if (score >= 90) {
    System.out.println("Отлично");
} else if (score >= 70) {
    System.out.println("Хорошо");
} else if (score >= 50) {
    System.out.println("Удовлетворительно");
} else {
    System.out.println("Неудовлетворительно");
}
```

**Важно:** проверки идут СВЕРХУ ВНИЗ. Первая true → выполняется, остальные пропускаются.

## Операторы сравнения

```java
a == b    // равно (ДВА знака равно! одно = это присвоение)
a != b    // не равно
a > b     // больше
a < b     // меньше
a >= b    // больше или равно
a <= b    // меньше или равно
```

## Логические операторы

```java
a && b    // И (оба true)
a || b    // ИЛИ (хотя бы один true)
!a        // НЕ (инвертировать)
```

```java
if (age >= 18 && hasTicket) {
    System.out.println("Проходите");
}
```

## switch

Когда сравниваете одну переменную с несколькими конкретными значениями:

```java
String day = "Monday";

switch (day) {
    case "Monday":
    case "Tuesday":
    case "Wednesday":
    case "Thursday":
    case "Friday":
        System.out.println("Рабочий день");
        break;
    case "Saturday":
    case "Sunday":
        System.out.println("Выходной");
        break;
    default:
        System.out.println("Неизвестный день");
}
```

**Не забывайте `break`!** Без него выполнение "проваливается" в следующий case (fall-through). Это ловит всех.

Java 21 — новый switch (без break):

```java
String result = switch (day) {
    case "Monday", "Tuesday", "Wednesday", "Thursday", "Friday" -> "Рабочий день";
    case "Saturday", "Sunday" -> "Выходной";
    default -> "Неизвестный день";
};
```

## Тернарный оператор

Короткая запись if/else для одного значения:

```java
String status = (age >= 18) ? "взрослый" : "несовершеннолетний";
// То же что:
// if (age >= 18) status = "взрослый"; else status = "несовершеннолетний";
```

## Напоминалка

```bash
javac Task01.java && java Task01
```
