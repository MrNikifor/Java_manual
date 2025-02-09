package Multithreading.collections.concurrenHashMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class Ex1 {
    public static void main(String[] args) throws InterruptedException {
        ConcurrentHashMap<Integer, String> map = new ConcurrentHashMap<>();
        map.put(1, "one");
        map.put(2, "two");
        map.put(3, "three");
        map.put(4, "four");
        map.put(5, "five");

        System.out.println(map);

        Runnable runnable1 = () -> {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            Iterator<Integer> iterator = map.keySet().iterator();
            while (iterator.hasNext()) {
                Integer key = iterator.next();
                System.out.println(key + ": " + map.get(key));
            }
        };

        Runnable runnable2 = () -> {
            try {
                Thread.sleep(110);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            map.put(6, "six");
        };
        Thread thread1 = new Thread(runnable1);
        Thread thread2 = new Thread(runnable2);
        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();
        System.out.println(map);
    }
}
