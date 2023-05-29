package Collection.ArrayList.Methods;

import java.util.ArrayList;
import java.util.List;

public class Methods2 {
    public static void main(String[] args) {
        ArrayList<String> arrayStr = new ArrayList<>();
        arrayStr.add("Иван");
        arrayStr.add("Вася");
        arrayStr.add("Инна");
        arrayStr.add("Томара");
        System.out.println(arrayStr);
        ArrayList<String> arrayStr1 = new ArrayList<>();
        arrayStr1.add("Иван");
        arrayStr1.add("Инна");
        arrayStr1.add("Игорь");

        // removeAll() - удаляет элементы листа у другого листа если они совпадает, в примере Игорь не будет удален,
        // так как его нет
        // arrayStr.removeAll(arrayStr1);
        // System.out.println(arrayStr);

        // retainAll() - противоположность методу removeAll(), оставлляет элементы
        arrayStr.retainAll(arrayStr1);
        System.out.println(arrayStr);

        // containsAll() - определяет содержит ли лист элементы сравнимые с другим листом. если не содержит = false
        arrayStr.containsAll(arrayStr1);// - false

        // toArray() - преобразует лист в массив элементов.
        Object[] array = arrayStr.toArray();
        // если в параметрах toArray() указатьт создание нового объекта и количество элементов,
        // все сработает и лишние елементы будут знаполнены null, если указать меньше то все равно все объекты буду
        // перенесены в массив, и по классике пишут [0]. Object[] array = arrayStr.toArray(new String[0])
        String[] array2 = arrayStr.toArray(new String[5]);
        System.out.println(arrayStr);

        // List.of() - метод который позволяет быстро создать и заполнить лист, но не может быть модифицирован
        // и содержать объекты null
        List<Number> list = List.of(3,6,32,3.2);
        System.out.println(list);

        // List.copyOf() - копирывает один лист в другой
        List<String> listCopy = List.copyOf(arrayStr);
    }
}
