# Задания: ООП основы

## Задание 1: Класс Dog ★☆☆
Файлы: `Dog.java`, `Task01.java`. Класс Dog: name, age, конструктор, bark(), toString(). В main: создать 3 собаки, вызвать bark().

## Задание 2: BankAccount ★★☆
`BankAccount.java`: private balance, deposit(amount), withdraw(amount), getBalance(). Withdraw не должен давать уйти в минус. deposit не принимает отрицательные.

## Задание 3: Rectangle ★☆☆
`Rectangle.java`: width, height, area(), perimeter(), isSquare(). Конструктор с валидацией (>0).

## Задание 4: Student + Grade ★★☆
`Student.java`: name, grades (int[]). `addGrade(int)`, `averageGrade()`, `bestGrade()`, `isPassing()` (avg >= 60).

## Задание 5: Counter — static ★★☆
`Counter.java`: static int count. Конструктор увеличивает count. Метод `static int getCount()`. Создать 10 объектов, проверить count == 10.

## Задание 6: Coffee + Order ★★★
`Coffee.java`: name, size (SMALL/MEDIUM/LARGE как String), price. `Order.java`: Coffee[] items, addItem(), total(), printOrder(). Объект содержит другие объекты.

## Задание 7: this — конфликт имён ★★☆
```java
class Person {
    String name;
    Person(String name) {
        name = name;  // БАГ! Это присвоение параметра самому себе
    }
}
```
Почему name остаётся null? Исправьте через `this.name = name`.

## Задание 8: Иммутабельный класс ★★★
`Money.java`: final int amount, final String currency. Нет сеттеров. `add(Money other)` → возвращает НОВЫЙ Money (не меняет текущий). Почему это полезно?

## Задание 9: Массив объектов ★★☆
Создать `Dog[] kennel = new Dog[5]`. Заполнить, вывести, найти самую старую собаку. Отличие от `int[]`: элементы = ссылки (могут быть null).

## Задание 10: Кофейня — полная модель ★★★
`Coffee.java`, `Customer.java`, `Order.java`, `CoffeeShop.java`. CoffeeShop: menu (Coffee[]), createOrder(Customer), printReceipt(Order). Всё из предыдущих тем (массивы, циклы, методы) + ООП.
