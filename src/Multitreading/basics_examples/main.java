package Multitreading.basics_examples;

public class main {
    public static void main(String[] args) {
    /*    //System.out.println(Thread.currentThread().getName());
        for (int i = 0; i < 3; i++) {
            new MyThread().start();
        }
        for (int i = 0; i < 5; i++) {
        }*/
        Thread tic = new Thread(new TicTac("["));
        Thread tac = new Thread(new TicTac("]"));
        tic.setDaemon(true);
        tac.setDaemon(true);
        tic.start();
        tac.start();
    }
}
