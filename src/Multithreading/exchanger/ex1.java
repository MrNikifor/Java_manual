package Multithreading.exchanger;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Exchanger;

public class ex1 {
    public static void main(String[] args) {
        Exchanger<Action> ex = new Exchanger<>();
        List<Action> friend1 = new ArrayList<>();
        List<Action> friend2 = new ArrayList<>();
        friend1.add(Action.ROCK);
        friend1.add(Action.SCISSORS);
        friend1.add(Action.PAPER);
        friend2.add(Action.SCISSORS);
        friend2.add(Action.PAPER);
        friend2.add(Action.ROCK);

        new BestFriend("Ivan", friend1, ex);
        new BestFriend("Igor", friend2, ex);
    }
}

enum Action{
    ROCK, SCISSORS, PAPER
}

class BestFriend extends Thread{
    private String name;
    private List<Action> myAction;
    private Exchanger ex;

    public BestFriend(String name, List<Action> myAction, Exchanger ex) {
        this.name = name;
        this.myAction = myAction;
        this.ex = ex;
        this.start();
    }
    private void whoWins(Action myAction, Action friendAction){
                if((myAction == Action.PAPER && friendAction == Action.ROCK)
                || (myAction == Action.SCISSORS && friendAction == Action.PAPER)
                || myAction == Action.ROCK && friendAction == Action.SCISSORS){
                    System.out.println(name + " wins!");
                }
    }

    @Override
    public void run() {
        Action reply;
        for(Action action : myAction){
            try {
                reply = (Action) ex.exchange(action);
                whoWins(action, reply);
                sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
