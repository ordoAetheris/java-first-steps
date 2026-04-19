# Подсказки: ООП
## 1: javac Dog.java Task01.java && java Task01
## 2: withdraw: if (amount > balance) println("Недостаточно средств"). НЕ менять balance
## 3: isSquare: return width == height. Area: width * height
## 4: grades как ArrayList? Нет — ещё не знаем. int[] + int gradeCount (сколько добавлено)
## 5: static поле ОДНО на все объекты. Доступ: Counter.count (через класс, не объект)
## 6: Order содержит Coffee[]. addItem: если массив полный → ??? (пока: фиксированный размер)
## 7: Без this: `name = name` → параметр = параметр. Поле не тронуто. ВСЕГДА используйте this в конструкторе
## 8: Immutable: все поля final, нет setXxx(). add() → return new Money(this.amount + other.amount, this.currency)
## 9: Dog[] kennel = new Dog[5] → все null. kennel[0] = new Dog(...) → заполнить каждый.
## 10: Main — создать CoffeeShop, добавить в меню, создать Customer, сделать Order, распечатать чек
