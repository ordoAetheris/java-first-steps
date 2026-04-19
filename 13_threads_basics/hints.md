# Подсказки: Многопоточность
## 1: Thread t1 = new Thread(() -> { for... }); t1.start(); НЕ t1.run()!
## 2: Thread.sleep(2000) имитирует скачивание 2 секунды
## 3: counter++ не атомарная операция: read → increment → write. Два потока могут read одно значение
## 4: synchronized(lock) { counter++; } — только один поток за раз
## 5: BlockingQueue<String> queue = new LinkedBlockingQueue<>(); queue.put("item"); queue.take();
## 6: t1.start(); t2.start(); t1.join(); t2.join(); // ждём оба
## 7: volatile boolean running = true; Без volatile: поток может закешировать значение
## 8: Thread1: lock(A) → lock(B). Thread2: lock(B) → lock(A). Оба ждут друг друга вечно
## 9: ExecutorService pool = Executors.newFixedThreadPool(4); Future<String> f = pool.submit(() -> "result"); f.get()
## 10: BlockingQueue<Order> orders. 3 потока: while(true) { Order o = orders.take(); process(o); }
