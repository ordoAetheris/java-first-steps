# Задания: Методы

## Задание 1: Математический тулкит ★☆☆
`max(a,b)`, `min(a,b)`, `abs(x)`, `pow(base, exp)` — всё через int. Без Math.

## Задание 2: isEven, isPositive, isLeapYear ★☆☆
Три метода, возвращающих boolean. Високосный год: делится на 4 НО не на 100 ИЛИ делится на 400.

## Задание 3: Массивный тулкит ★★☆
`sum(int[])`, `average(int[])`, `contains(int[], int)`, `indexOf(int[], int)`, `max(int[])`.

## Задание 4: Строковые утилиты ★★☆
`countChar(String, char)`, `reverse(String)`, `isPalindrome(String)`.

## Задание 5: Перегрузка — format ★★☆
```java
static String format(int x)      // "42"
static String format(double x)   // "3.14"
static String format(String x)   // "'hello'"
static String format(int[] x)    // "[1, 2, 3]"
```

## Задание 6: Рекурсия — факториал ★★☆
`factorial(n)` рекурсивно. factorial(5) = 120. Что будет с factorial(100000)? (StackOverflow!)

## Задание 7: Массив по ссылке — ловушка ★★★
```java
static void doubleAll(int[] arr) {
    for (int i = 0; i < arr.length; i++) arr[i] *= 2;
}
// Вызов:
int[] data = {1, 2, 3};
doubleAll(data);
// Что в data? {2, 4, 6} — массив изменился!
```
Почему? Потому что массив передаётся по ссылке, не по значению.

## Задание 8: Декомпозиция — калькулятор ★★★
Перепишите калькулятор из темы 02 через методы:
`parseArgs(args)`, `calculate(a, op, b)`, `formatResult(a, op, b, result)`.

## Задание 9: Метод как "чёрный ящик" ★★☆
Написать `int[] generateRandom(int size, int min, int max)` — возвращает массив случайных чисел. Вызвать, отсортировать (метод из темы 03), вывести.

## Задание 10: Кофейня — декомпозиция ★★★
Перепишите кофейню из 01/Task10 через методы: `calculateSubtotal(...)`, `applyDiscount(...)`, `applyTax(...)`, `printReceipt(...)`. Каждый метод — одна ответственность.
