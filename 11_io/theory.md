# Файловый ввод/вывод

## Чтение файла
```java
import java.nio.file.*;
import java.io.*;

// Способ 1: всё сразу (маленькие файлы)
String content = Files.readString(Path.of("file.txt"));

// Способ 2: построчно
try (BufferedReader reader = Files.newBufferedReader(Path.of("file.txt"))) {
    String line;
    while ((line = reader.readLine()) != null) {
        System.out.println(line);
    }
}  // автоматически закрывается (try-with-resources)
```

## Запись в файл
```java
Files.writeString(Path.of("output.txt"), "Привет!");

// Построчно
try (BufferedWriter writer = Files.newBufferedWriter(Path.of("output.txt"))) {
    writer.write("Строка 1");
    writer.newLine();
    writer.write("Строка 2");
}
```

## try-with-resources (автоматическое закрытие) — ВСЕГДА для файлов
```java
try (InputStream is = new FileInputStream("file.dat")) {
    // работаем с файлом
}  // файл ГАРАНТИРОВАННО закроется, даже при исключении
```
Без этого — утечка file descriptors → "Too many open files".
