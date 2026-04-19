# ООП: Наследование, полиморфизм, интерфейсы

## Наследование — "является" (is-a)
```java
class Animal {
    String name;
    void makeSound() { System.out.println("..."); }
}

class Dog extends Animal {
    @Override
    void makeSound() { System.out.println(name + ": Гав!"); }
}

class Cat extends Animal {
    @Override
    void makeSound() { System.out.println(name + ": Мяу!"); }
}
```
Dog **наследует** поля и методы Animal. `@Override` — переопределяет поведение.

## Полиморфизм — один интерфейс, разное поведение
```java
Animal[] animals = { new Dog(), new Cat(), new Dog() };
for (Animal a : animals) {
    a.makeSound();  // Java вызывает ПРАВИЛЬНЫЙ метод для каждого типа
}
```

## Абстрактный класс — нельзя создать, только наследовать
```java
abstract class Shape {
    abstract double area();  // нет реализации — ОБЯЗАНЫ реализовать в наследнике
}
class Circle extends Shape {
    double radius;
    @Override double area() { return Math.PI * radius * radius; }
}
```

## Интерфейс — контракт "что умеет"
```java
interface Printable {
    void print();  // только сигнатура, без тела
}
class Report implements Printable {
    @Override
    public void print() { System.out.println("Печать отчёта"); }
}
```
Класс может реализовать МНОГО интерфейсов (в отличие от extends — только один).

## super — вызов родителя
```java
class Dog extends Animal {
    Dog(String name) {
        super();  // вызов конструктора Animal
        this.name = name;
    }
}
```

## instanceof — проверка типа
```java
if (animal instanceof Dog) {
    Dog dog = (Dog) animal;  // безопасное приведение
}
```
