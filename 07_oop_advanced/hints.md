# Подсказки: Наследование
## 1: extends Animal. @Override makeSound(). Animal[] a = {new Dog(), new Cat()}
## 2: abstract class Shape. Circle: Math.PI * r * r. Triangle: 0.5 * base * height
## 3: printAll(Printable[] items) { for (Printable p : items) p.print(); }
## 4: Character: int hp, int attackPower. attack() возвращает damage. Warrior: *1.5, Mage: random spell
## 5: implements Comparable<Student>. compareTo: return Double.compare(this.avg, other.avg)
## 6: class Circle implements Drawable, Resizable — два implements через запятую
## 7: Конфликт: если A.method() и B.method() оба есть → какой вызвать? Интерфейс решает: один контракт, разные реализации
## 8: abstract class Payment { abstract boolean process(); }. processPayment(payment) → payment.process()
## 9: Вместо if (x instanceof Dog) → добавить абстрактный метод в Animal, override в каждом подклассе
## 10: abstract double price(). Coffee: base + sizeMultiplier. Tea: flat. Smoothie: base + ingredient count
