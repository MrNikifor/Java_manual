package Multithreading.semophore;

import java.util.concurrent.Semaphore;

public class Ex1 {
    public static void main(String[] args) {
        Semaphore callBox = new Semaphore(2);

        new Person("Oleg", callBox);
        new Person("Evgen", callBox);
        new Person("Misha", callBox);
        new Person("Masha", callBox);
        new Person("Davo", callBox);

    }
}

class Person extends Thread {
          String name;
          private Semaphore callBox;

          public Person(String name, Semaphore callBox) {
              this.name = name;
              this.callBox = callBox;
              this.start();
          }

          public void run() {
              try {
                  System.out.println(name + " ждет...");
                  callBox.acquire();
                  System.out.println(name + " пользуется телефоном");
                  sleep(2000);
                  System.out.println(name + " завершил(а) звонок");
              } catch (InterruptedException e) {
                  throw new RuntimeException(e);
              }
              finally {
                  callBox.release();
              }
          }
}