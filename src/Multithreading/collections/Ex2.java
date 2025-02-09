package Multithreading.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Ex2 {
    public static void main(String[] args) throws InterruptedException {
        ArrayList<Integer> list = new ArrayList();
        List<Integer> synchList = Collections.synchronizedList(list);
        for (int i = 0; i < 1000; i++) {
            synchList.add(i);
        }
        Runnable runnable1 = () -> {
            synchronized (synchList) {
                Iterator<Integer> iterator = synchList.iterator();
                while (iterator.hasNext()) {
                    System.out.println(iterator.next());
                }
            }
        };

        Runnable runnable2 = () -> {
            synchList.remove(10);
        };
        Thread thread1 = new Thread(runnable1);
        Thread thread2 = new Thread(runnable2);
        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();
        System.out.println(synchList);
    }
}
