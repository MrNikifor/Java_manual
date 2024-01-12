package Multitreading.number_of_messages;

import java.util.Scanner;

public class StatsHelper {
    public static int count = 0;
    public static void main(String[] args) throws InterruptedException {
        Thread readThread = new Thread(() -> {
            Scanner in = new Scanner(System.in);
            while (in.hasNextLine()){
                String line =in.nextLine();
                count++;
            }
        });
        readThread.setDaemon(true);
        readThread.start();
           while (true){
               System.out.println(count + " messages inputted by user");
               Thread.sleep(1000);
           }
    }
}
