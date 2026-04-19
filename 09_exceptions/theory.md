# Исключения (Exceptions)

## Что это
Ошибка в runtime. Не компиляция — а при выполнении. Деление на ноль, файл не найден, null-ссылка.

## try / catch / finally
```java
try {
    int result = 10 / 0;  // ArithmeticException
} catch (ArithmeticException e) {
    System.out.println("Ошибка: " + e.getMessage());
} finally {
    System.out.println("Выполнится ВСЕГДА (даже при ошибке)");
}
```

## Checked (проверяемые) vs Unchecked (непроверяемые)
- **Unchecked** (RuntimeException): NullPointerException, ArrayIndexOutOfBounds. Не обязаны ловить.
- **Checked**: IOException, FileNotFoundException. ОБЯЗАНЫ ловить или пробросить (throws).

## Свои исключения
```java
class InsufficientFundsException extends RuntimeException {
    public InsufficientFundsException(String msg) { super(msg); }
}
```

## throws — "я не обрабатываю, пусть вызывающий"
```java
void readFile(String path) throws IOException {
    // если ошибка — пробрасывается вызывающему
}
```
