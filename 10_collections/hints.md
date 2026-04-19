# Подсказки: Коллекции
## 1: ArrayList<String>. add("молоко"), remove("молоко"), contains("хлеб")
## 2: new HashSet<>(Arrays.asList(text.split(" "))) или цикл + add
## 3: map.merge(word, 1, Integer::sum) или map.put(word, map.getOrDefault(word, 0) + 1)
## 4: map.computeIfAbsent(name, k -> new ArrayList<>()).add(phone)
## 5: Queue<String> q = new LinkedList<>(). offer=добавить, poll=извлечь, peek=посмотреть
## 6: list.sort(Comparator.comparing(Student::getName)) или lambda
## 7: new ArrayList<>(new LinkedHashSet<>(list)) — сохраняет порядок первого вхождения
## 8: orders.stream().collect(Collectors.groupingBy(Order::getCategory)) или ручной цикл
## 9: for-each + remove → ConcurrentModificationException. Используй iterator.remove()
## 10: Map<LocalDate, List<Order>> — ключ = дата, значение = список заказов
