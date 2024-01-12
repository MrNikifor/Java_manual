package Multitreading.basics_examples;

public class TicTac implements Runnable{
    private final String bracket;

    public TicTac(String bracket) {
        this.bracket = bracket;
    }

    @Override
    public void run() {
       while (true){
           System.out.print(bracket);
           try {
               Thread.sleep(900);
           } catch (InterruptedException e) {
               throw new RuntimeException(e);
           }
       }
    }
}
