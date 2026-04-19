# Подсказки: Файлы
## 1: Files.writeString(Path.of("test.txt"), "content"); Files.readString(Path.of("test.txt"))
## 2: int lineNum = 1; while ((line = reader.readLine()) != null) { println(lineNum++ + ": " + line); }
## 3: try (var in = new FileInputStream(src); var out = new FileOutputStream(dst)) { in.transferTo(out); }
## 4: if (line.contains("ERROR")) writer.write(line + "\n")
## 5: line.split(",") для парсинга. String.join(",", fields) для записи
## 6: Properties props = new Properties(); props.load(new FileReader("config.properties")); props.getProperty("key")
## 7: try-with-resources = finally { close() } но короче и безопаснее
## 8: Сохранение: for each order → writer.write(order.toCSV()). Загрузка: reader.readLine() → Order.fromCSV()
## 9: args[0] = input, args[1] = output. Проверить args.length >= 2
## 10: File.listFiles() → для каждого: если файл → size, если директория → рекурсия
