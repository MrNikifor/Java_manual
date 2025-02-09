package patterns.structural.adapter;

public class DataBaseRunner {
    public static void main(String[] args) {
        DateBase dateBase = new AdapterAppToDateBase();

        dateBase.insert();
        dateBase.update();
        dateBase.select();
        dateBase.delete();
    }
}
