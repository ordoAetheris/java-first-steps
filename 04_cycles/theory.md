# Циклы: for, while, do-while

## Зачем
Повторить действие N раз. Обработать каждый элемент. Ждать условие.

## for — когда знаете сколько раз
```java
for (int i = 0; i < 10; i++) {
    System.out.println(i);  // 0, 1, 2, ..., 9
}
```
Три части: `инициализация; условие; шаг`. Пока условие true — тело выполняется.

## while — когда НЕ знаете сколько раз
```java
int attempts = 0;
while (attempts < 3) {
    System.out.println("Попытка " + (attempts + 1));
    attempts++;
}
```

## do-while — хотя бы один раз
```java
do {
    String input = scanner.nextLine();
} while (!input.equals("exit"));  // проверка ПОСЛЕ первого выполнения
```

## break (прерывание) и continue (пропуск итерации)
```java
for (int i = 0; i < 100; i++) {
    if (i == 5) break;     // выход из цикла
    if (i % 2 == 0) continue; // пропустить итерацию
    System.out.println(i);  // 1, 3
}
```

## Бесконечный цикл (осторожно!)
```java
while (true) {
    // выход только через break
    if (условие) break;
}
```
