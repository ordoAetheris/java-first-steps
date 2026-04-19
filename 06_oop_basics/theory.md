# ООП: Классы и объекты

## Зачем
До сих пор: данные (переменные) и логика (методы) отдельно. В реальности они связаны. Банковский счёт — это баланс (данные) + операции deposit/withdraw (логика). Класс объединяет данные и методы в одно целое.

## Класс = чертёж. Объект = вещь по чертежу.
```java
// Чертёж (класс)
class Dog {
    String name;    // поле (данные)
    int age;

    void bark() {   // метод (поведение)
        System.out.println(name + " говорит: Гав!");
    }
}

// Создать объект (вещь по чертежу)
Dog rex = new Dog();
rex.name = "Рекс";
rex.age = 3;
rex.bark();  // Рекс говорит: Гав!
```

## Конструктор — инициализация при создании
```java
class Dog {
    String name;
    int age;

    Dog(String name, int age) {   // конструктор
        this.name = name;         // this = "этот объект"
        this.age = age;
    }
}

Dog rex = new Dog("Рекс", 3);  // сразу с данными
```

## Инкапсуляция — скрытие внутренностей
```java
class BankAccount {
    private double balance;  // private = доступ только внутри класса

    public BankAccount(double initial) {
        this.balance = initial;
    }

    public void deposit(double amount) {
        if (amount > 0) balance += amount;  // проверка!
    }

    public double getBalance() {
        return balance;
    }
}
```
Снаружи нельзя написать `account.balance = -1000`. Только через методы, которые проверяют корректность.

## Несколько объектов одного класса
```java
Dog rex = new Dog("Рекс", 3);
Dog bobik = new Dog("Бобик", 5);
rex.bark();    // Рекс говорит: Гав!
bobik.bark();  // Бобик говорит: Гав!
// Два РАЗНЫХ объекта, один чертёж
```

## static — принадлежит классу, не объекту
```java
class Counter {
    static int count = 0;  // ОДИН на все объекты

    Counter() {
        count++;  // каждый new Counter() увеличивает
    }
}

new Counter(); new Counter(); new Counter();
System.out.println(Counter.count);  // 3
```

## toString — текстовое представление
```java
class Dog {
    String name;
    int age;

    @Override
    public String toString() {
        return "Dog{name='" + name + "', age=" + age + "}";
    }
}

Dog rex = new Dog("Рекс", 3);
System.out.println(rex);  // Dog{name='Рекс', age=3}
```

## Компиляция нескольких файлов
```bash
# Каждый класс — отдельный файл (имя файла = имя класса)
javac Dog.java Main.java
java Main
```
Или: все .java в одной директории → `javac *.java && java Main`
