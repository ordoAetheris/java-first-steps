# Строки

## String — неизменяемый (immutable — нельзя изменить после создания)
```java
String s = "hello";
s.toUpperCase();          // "HELLO", но s по-прежнему "hello"!
String upper = s.toUpperCase(); // нужно сохранить результат
```

## Основные методы
```java
s.length()              // длина
s.charAt(0)             // символ по индексу: 'h'
s.substring(1, 3)       // "el" (от, до-не-включая)
s.indexOf("ll")         // 2 (позиция первого вхождения)
s.contains("ell")       // true
s.equals("hello")       // true (ВСЕГДА equals, не ==!)
s.equalsIgnoreCase("HELLO") // true
s.startsWith("he")      // true
s.trim()                // убрать пробелы по краям
s.replace("l", "r")     // "herro"
s.split(",")            // разбить по разделителю → String[]
s.toCharArray()         // → char[]
String.valueOf(42)      // int → String
Integer.parseInt("42")  // String → int
```

## StringBuilder (строитель строк) — для конкатенации (склеивания) в цикле
```java
// ПЛОХО: создаёт новый String на каждой итерации
String result = "";
for (int i = 0; i < 1000; i++) result += i;  // O(n²)!

// ХОРОШО: один буфер
StringBuilder sb = new StringBuilder();
for (int i = 0; i < 1000; i++) sb.append(i);  // O(n)
String result = sb.toString();
```

## Не запоминай все методы — знай где искать
`String` имеет 60+ методов. Гуглите `java string methods` → Oracle JavaDoc.
