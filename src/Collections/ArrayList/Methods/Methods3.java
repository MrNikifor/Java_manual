package Collections.ArrayList.Methods;

import java.util.ArrayList;

public class Methods3 {
    public static void main(String[] args) {
        ArrayList<String> arrayStr = new ArrayList<>();
        arrayStr.add("Иван");
        arrayStr.add("Вася");
        arrayStr.add("Инна");
        arrayStr.add("Томара");
        System.out.println(arrayStr);
        ArrayList<String> arrayStr1 = new ArrayList<>();
        arrayStr1.add("Иван");
        arrayStr1.add("Вася");
        arrayStr1.add("Инна");
        arrayStr1.add("Игорь");

        // removeAll() - удаляет элементы листа у другого листа если они совпадает, в примере Игорь не будет удален,
        // так как его нет
        arrayStr.removeAll(arrayStr1);
        System.out.println(arrayStr);

    }
}
