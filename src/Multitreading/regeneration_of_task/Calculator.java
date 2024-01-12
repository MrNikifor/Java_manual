package Multitreading.regeneration_of_task;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Calculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Queue<Task> queue = new ArrayDeque<>();
        while (in.hasNextLine()) {
            //1+2
            String[] tokens = in.nextLine().split("\\+");
            int left = Integer.parseInt(tokens[0]);
            int rught = Integer.parseInt(tokens[1]);
            Task task = new Task(left, rught);
            queue.add(task);
        }
        ExecutorService executor = Executors.newFixedThreadPool(2);
        Thread taskService = new Thread(() -> {
            try {
                Thread.sleep(2000);
                Task task = queue.poll();
                if(task != null){
                    executor.submit(task);
                }
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });
    }
}
