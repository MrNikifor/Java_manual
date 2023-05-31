package Collection.Collections.Methods;

import java.util.ArrayList;
import java.util.Collections;

public class Methods {
    public static void main(String[] args) {
        ArrayList<Integer> myList = new ArrayList<>();
        myList.add(-5);
        myList.add(9);
        myList.add(2);
        myList.add(22);
        myList.add(-18);
        myList.add(3);
        myList.add(98);
        myList.add(-71);
        myList.add(12);
        Collections.sort(myList); // сортируем
        System.out.println(myList);

        // reverse() - разворачивает элементы в листе
        Collections.reverse(myList);
        System.out.println(myList);

        // shuffle() - перемешивает элементы в листе
        Collections.shuffle(myList);
        System.out.println(myList);
    }
}
