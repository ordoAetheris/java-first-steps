# Основы многопоточности

## Зачем
Одно ядро CPU выполняет одну вещь за раз. Многопоточность — делать несколько вещей "одновременно" (переключаясь между ними или на разных ядрах).

## Создание потока
```java
// Способ 1: Runnable (предпочтительный)
Thread t = new Thread(() -> {
    System.out.println("Я в другом потоке: " + Thread.currentThread().getName());
});
t.start();   // запустить (НЕ run()! run() — в текущем потоке)

// Способ 2: extends Thread
class MyThread extends Thread {
    @Override public void run() { System.out.println("Working..."); }
}
new MyThread().start();
```

## Проблема: shared state (общие данные между потоками)
```java
int counter = 0;
// Два потока делают counter++ одновременно
// Результат: НЕ 2000, а случайное число < 2000 (race condition!)
```

## synchronized (синхронизация) — защита от одновременного доступа
```java
synchronized (lockObject) {
    counter++;  // только один поток за раз
}
```

## Предупреждение
Многопоточность — самая сложная тема в программировании. Здесь — только основы. Глубоко — в задачнике Concurrency Java (130 задач).
