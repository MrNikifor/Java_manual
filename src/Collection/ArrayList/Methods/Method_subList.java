package Collection.ArrayList.Methods;

import java.util.ArrayList;
import java.util.List;

// Этот метод дает представление части этого списка между указанным fromIndex, включительно, и toIndex, исключая.
// Эта функция имеет два параметра fromIndex и toIndex , которые являются начальным и конечным диапазонами
// соответственно для создания подсписка из данного списка.
public class Method_subList {
    public static void main(String[] args) {
        ArrayList<String> arrayStr = new ArrayList<>();
        arrayStr.add("Иван");
        arrayStr.add("Вася");
        arrayStr.add("Инна");
        arrayStr.add("Томара");
        arrayStr.add("Инокентий");
        System.out.println(arrayStr);

        List<String> myList = arrayStr.subList(1,4); // по 4й элемент не включительно!
        System.out.println(myList);

    }
}
