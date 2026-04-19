# Задания: Наследование (inheritance) и полиморфизм (polymorphism — "много форм")

## Задание 1: Animal → Dog, Cat ★☆☆

Файлы: `Animal.java`, `Dog.java`, `Cat.java`, `Task01.java`.

`Animal`: поле `name`, метод `makeSound()` (выводит "...").
`Dog extends Animal`: переопределяет (override) `makeSound()` → "Гав!".
`Cat extends Animal`: переопределяет `makeSound()` → "Мяу!".

В `Task01.java`: массив `Animal[]` из 3 элементов (Dog, Cat, Dog). В цикле вызвать `makeSound()`.

```bash
javac *.java && java Task01
# Рекс: Гав!
# Мурка: Мяу!
# Бобик: Гав!
```

---

## Задание 2: Shape (фигура) → Circle, Rectangle, Triangle ★★☆

`Shape.java`: абстрактный (abstract — нельзя создать напрямую) класс. Методы `abstract double area()` (площадь) и `abstract double perimeter()` (периметр).

`Circle.java`: поле `radius` (радиус). Площадь: π×r². Периметр: 2×π×r.
`Rectangle.java`: поля `width` (ширина), `height` (высота).
`Triangle.java`: три стороны `a`, `b`, `c`. Площадь: формула Герона.

```bash
javac *.java && java Task02
# Круг (r=5): площадь=78.54, периметр=31.42
# Прямоугольник (4x6): площадь=24.00, периметр=20.00
# Треугольник (3,4,5): площадь=6.00, периметр=12.00
```

---

## Задание 3: Интерфейс (interface — контракт) Printable ★★☆

`Printable.java`: interface с методом `void print()`.

Три класса реализуют (implements — "реализует контракт") Printable: `Invoice` (счёт), `Report` (отчёт), `Label` (этикетка).

Метод `printAll(Printable[] items)` — принимает массив и вызывает `print()` у каждого.

```bash
javac *.java && java Task03
# [Счёт] №1234, сумма: 5000 руб.
# [Отчёт] Продажи за январь: 150 единиц
# [Этикетка] Товар: Кофе, цена: 350 руб.
```

---

## Задание 4: RPG — Character → Warrior, Mage, Archer ★★★

`Character.java`: `name`, `hp` (health points — очки здоровья), `attackPower` (сила атаки). Метод `int attack()`.

`Warrior` (воин): attackPower × 1.5 (сильный ближний бой).
`Mage` (маг): случайное от 0 до attackPower × 2 (нестабильная магия).
`Archer` (лучник): attackPower × 1.2 (стабильный дальний бой).

`Task04.java`: массив героев атакует монстра (hp=100) по очереди, пока hp > 0.

```bash
javac *.java && java Task04
# Раунд 1: Воин → 15, Маг → 22, Лучник → 12. HP монстра: 51
# Раунд 2: Воин → 15, Маг → 8, Лучник → 12. HP монстра: 16
# Раунд 3: Воин → 15. Монстр побеждён за 3 раунда!
```

---

## Задание 5: Comparable (сравнимый) — сортировка объектов ★★★

`Student.java` реализует `Comparable<Student>`. Метод `compareTo(Student other)`: сравнивает по среднему баллу.

В `Task05.java`: массив студентов → `Arrays.sort(students)` → вывод от худшего к лучшему.

```bash
javac *.java && java Task05
# Сидоров: 62.5
# Иванов: 75.0
# Петрова: 88.3
# Козлова: 95.1
```

---

## Задание 6: Множественные интерфейсы ★★☆

`Drawable.java`: интерфейс, метод `void draw()`.
`Resizable.java`: интерфейс, метод `void resize(double factor)`.

`Circle implements Drawable, Resizable` — реализует ОБА. Java разрешает несколько интерфейсов (но только один extends).

```bash
javac *.java && java Task06
# Рисую круг радиусом 5.0
# Увеличиваю в 2 раза
# Рисую круг радиусом 10.0
```

---

## Задание 7: Зачем полиморфизм — рефакторинг (улучшение кода) ★★★

Плохой код: 5 проверок `instanceof` (проверка типа) в if/else. Каждый новый тип = новая ветка.

Хороший код: `animal.makeSound()` — Java сама вызывает правильный метод. Добавить тип = 0 изменений.

Задание: перепишите плохой код из 5 `instanceof` в полиморфный вариант.

---

## Задание 8: Абстрактный Payment (платёж) ★★★

`Payment.java`: abstract. `abstract boolean process()`, `abstract String getType()`.

`CardPayment` (карта), `CashPayment` (наличные), `CryptoPayment` (криптовалюта).

Метод `processPayment(Payment p)` НЕ знает конкретный тип — вызывает `p.process()`.

```bash
javac *.java && java Task08
# Обработка: Карта → Успешно
# Обработка: Наличные → Успешно
# Обработка: Крипто → Отклонено
```

---

## Задание 9: super — вызов родительского конструктора ★★☆

`Person.java`: name, age. `Employee extends Person`: + company, salary. `Manager extends Employee`: + teamSize.

Каждый конструктор вызывает `super(...)` — конструктор родителя. Это обязательно.

```bash
javac *.java && java Task09
# Менеджер: Павел, 28 лет, Bringo, 200000 руб., команда: 5 чел.
```

---

## Задание 10: Кофейня — Beverage (напиток) → Coffee, Tea, Smoothie ★★★

`Beverage.java`: abstract. Поля: `name`, `size`. Метод `abstract double price()`.

`Coffee`: цена по размеру (150/250/350).
`Tea`: 120 + добавки (мёд +30, лимон +20).
`Smoothie`: 200 + 50 за каждый фрукт.

```bash
javac *.java && java Task10
# === МЕНЮ ===
# Латте (LARGE)       350.00
# Зелёный чай + мёд   150.00
# Смузи (3 фрукта)    350.00
# Самый дорогой: Латте — 350.00
```
