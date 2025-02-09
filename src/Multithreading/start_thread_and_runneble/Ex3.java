package Multithreading.start_thread_and_runneble;
//быстрые способы создания потоков
public class Ex3 {
    public static void main(String[] args) {
        new Thread(new Runnable() {
            public void run() {
                System.out.println("Hello World");
            }
        }).start();

        new Thread(() -> System.out.println("Hello World 2")).start();
    }
}
