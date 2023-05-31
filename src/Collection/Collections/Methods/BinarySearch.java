package Collection.Collections.Methods;

import java.util.ArrayList;
import java.util.Collections;

// BinarySearch - метод поиска элемента построен на принципе делим попалам и уход в нужную нам половину, до тех пор пока
// не найдем искомый элемент. Но чтобы он корректно работал нам жуно отсортировать наши элементы,
// иначе метод выдаст отрицательный результат
public class BinarySearch {
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
        int index = Collections.binarySearch(myList,22);// в аргуметнах на второй позиции указываем элемент
        System.out.println(index);                          // который будем искать
    }
}
