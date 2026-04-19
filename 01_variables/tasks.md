# Задания: Переменные и типы данных

## Задание 1: Визитка ★☆☆

Создайте файл `Task01.java`. Объявите переменные для имени (String), возраста (int), города (String) и выведите:

```
Имя: Павел
Возраст: 28
Город: Новосибирск
```

```bash
javac Task01.java && java Task01
```

---

## Задание 2: Обменник валют ★☆☆

Файл `Task02.java`. Дан курс доллара (double), количество рублей (double). Посчитайте сколько долларов можно купить и какой остаток в рублях.

Вход: курс = 92.50, рубли = 10000.0
Вывод:
```
Долларов: 108
Остаток: 10.00 руб.
```

Подсказка: целая часть = `(int)(rubli / kurs)`. Остаток = `rubli - dollars * kurs`.

---

## Задание 3: Размер файла ★☆☆

Файл `Task03.java`. Дан размер файла в байтах (long). Переведите в KB, MB, GB с остатком.

Вход: `long bytes = 1_625_374_720L;`
Вывод:
```
1 GB, 526 MB, 80 KB, 0 bytes
```

Подсказка: `1 GB = 1024 MB = 1024*1024 KB = 1024*1024*1024 bytes`. Используйте `/` и `%`.

---

## Задание 4: Время в пути ★☆☆

Файл `Task04.java`. Дано расстояние (км) и скорость (км/ч). Вычислите время в часах, минутах, секундах.

Вход: расстояние = 347 км, скорость = 60 км/ч
Вывод:
```
Время в пути: 5 ч 47 мин 0 сек
```

---

## Задание 5: Целочисленная ловушка ★★☆

Файл `Task05.java`. Что выведет этот код? Сначала подумайте, потом запустите.

```java
public class Task05 {
    public static void main(String[] args) {
        int a = 10;
        int b = 3;
        System.out.println("10 / 3 = " + a / b);
        System.out.println("10.0 / 3 = " + 10.0 / 3);
        System.out.println("1 / 2 = " + 1 / 2);
        System.out.println("1.0 / 2 = " + 1.0 / 2);
    }
}
```

**Вопрос:** почему `10 / 3` не равно `3.333`? Почему `1 / 2` = `0`?

Допишите комментарий с объяснением в коде.

---

## Задание 6: Переполнение int ★★☆

Файл `Task06.java`. Что произойдёт?

```java
public class Task06 {
    public static void main(String[] args) {
        int max = Integer.MAX_VALUE; // 2_147_483_647
        System.out.println("MAX_VALUE = " + max);
        System.out.println("MAX_VALUE + 1 = " + (max + 1));
        System.out.println("MAX_VALUE + 2 = " + (max + 2));

        int min = Integer.MIN_VALUE; // -2_147_483_648
        System.out.println("MIN_VALUE = " + min);
        System.out.println("MIN_VALUE - 1 = " + (min - 1));
    }
}
```

Запустите. Результат вас удивит.

**Вопрос:** почему `2_147_483_647 + 1` = `-2_147_483_648`? Что такое переполнение? Допишите комментарий.

---

## Задание 7: Точность double ★★☆

Файл `Task07.java`.

```java
public class Task07 {
    public static void main(String[] args) {
        double a = 0.1;
        double b = 0.2;
        double sum = a + b;

        System.out.println("0.1 + 0.2 = " + sum);
        System.out.println("Равно 0.3? " + (sum == 0.3));
    }
}
```

**Вопрос:** почему `0.1 + 0.2 ≠ 0.3`? Это баг Java? (Нет — это IEEE 754, одинаково во всех языках.)

Допишите: как правильно сравнивать дробные числа (подсказка: `Math.abs(sum - 0.3) < 0.0001`).

---

## Задание 8: Приведение типов ★★☆

Файл `Task08.java`.

```java
public class Task08 {
    public static void main(String[] args) {
        long big = 3_000_000_000L;
        int small = (int) big;
        System.out.println("long: " + big);
        System.out.println("(int) long: " + small);

        double pi = 3.14159;
        int truncated = (int) pi;
        System.out.println("(int) 3.14159 = " + truncated);

        char letter = 'A';
        int code = letter;
        System.out.println("'A' as int = " + code);
        char fromCode = (char) 66;
        System.out.println("66 as char = " + fromCode);
    }
}
```

Запустите. Объясните каждый результат в комментариях.

---

## Задание 9: Аргументы командной строки ★★☆

Файл `Task09.java`. Программа принимает имя и возраст через аргументы командной строки:

```bash
java Task09 Павел 28
```

Вывод:
```
Привет, Павел! Через 10 лет тебе будет 38.
```

Подсказка: `args[0]` = первый аргумент (String), `Integer.parseInt(args[1])` = второй как число.

Что будет если запустить `java Task09` без аргументов? Обработайте этот случай:
```
Использование: java Task09 <имя> <возраст>
```

---

## Задание 10: Кофейня — чек ★★★

Файл `Task10.java`. Полноценная задача на всё из темы.

Переменные:
- `String customerName` — имя клиента (из args или hardcoded)
- `int espressoCount` — количество эспрессо (250 руб.)
- `int latteCount` — количество латте (350 руб.)
- `int croissantCount` — количество круассанов (180 руб.)
- `double discountPercent` — скидка (10%)
- `final double TAX_RATE = 0.05` — НДС 5%

Посчитайте и выведите чек:

```
=== КОФЕЙНЯ JAVABEANS ===
Клиент: Павел

Эспрессо x2        500.00
Латте x1            350.00
Круассан x3         540.00
--------------------------
Подитог:          1390.00
Скидка 10%:       -139.00
НДС 5%:             62.55
--------------------------
ИТОГО:            1313.55

Спасибо за визит!
```

Используйте `System.out.printf("%-20s%8.2f\n", name, price)` для форматирования.
