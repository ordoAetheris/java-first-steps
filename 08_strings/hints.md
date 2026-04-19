# Подсказки: Строки
## 1: charAt(i) в цикле от конца к началу. Или new StringBuilder(s).reverse()
## 2: s.trim().split("\\s+") — по одному или нескольким пробелам
## 3: for каждого плохого слова: s.replace(bad, "***")
## 4: camelToSnake: если заглавная → подчёркивание + lowercase. snakeToCamel: после _ → uppercase
## 5: line.split(",") → String[]. printf("%-20s", field) для выравнивания
## 6: Сортировка букв: toCharArray → Arrays.sort → new String(chars)
## 7: "ABCDEFGabcdef0123456!@#" — выбирать Random.nextInt(charset.length())
## 8: long start = System.nanoTime(); ... long elapsed = System.nanoTime() - start;
## 9: for каждого ключа: template.replace("{" + key + "}", value)
## 10: printf: %s строка, %d целое, %.2f дробное, %n перенос. %-20s выравнивание влево
