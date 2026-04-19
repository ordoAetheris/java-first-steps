# Подсказки: Исключения
## 1: catch(ArithmeticException e) { ... }. e.getMessage() — текст ошибки
## 2: try { Integer.parseInt("abc"); } catch (NumberFormatException e) { ... }
## 3: class InsufficientFundsException extends RuntimeException. throw new InsufficientFundsException("...")
## 4: catch (ArrayIndexOutOfBoundsException | NumberFormatException e) — multi-catch
## 5: finally { scanner.close(); } или try-with-resources: try (Scanner s = new Scanner(...))
## 6: e.printStackTrace() — полный стек. Или e.getStackTrace() для программного доступа
## 7: List<String> errors = new ArrayList<>(); if (name.isEmpty()) errors.add("Name required");
## 8: throws — когда метод не знает как обработать. try/catch — когда знает
## 9: NPE: null.method(), null[0], unboxing null Integer. Защита: проверка != null, Optional
## 10: InvalidOrderException: name, List<String> violations. throw с деталями
