package Collections.ArrayList.Methods;

import java.util.ArrayList;

public class Methods1 {
    public static void main(String[] args) {
        // метод add добавляет елемент в лист, если в параметре добавлении метода указать индекс, то объект добавиться
        // именно на ту позицию, на примере с Томарой.
        ArrayList<String> arrayStr = new ArrayList<>();
        arrayStr.add("Иван");
        arrayStr.add("Вася");
        arrayStr.add("Инна");
        arrayStr.add(0,"Томара");
        System.out.println(arrayStr);

        // метод get возвращает значение елемента с определенным индексом, вернем Томару
        ArrayList<String> arrayStr2 = new ArrayList<>(arrayStr);
        System.out.println(arrayStr2.get(0));
        // выведем все значения с помощью метода get через цыкл.
        for (int i = 0; i < arrayStr2.size(); i++) {
            System.out.println(arrayStr2.get((i)));
        }
        // set метод заменяет существующий елемент на новый, пример Инокентий -> Томара
        arrayStr2.set(0,"Инокентий");
        System.out.println(arrayStr2);

        //remove удаляет элементы по индексу и тогда все элементы смещаются влево. удалим Ивана

        arrayStr2.remove(1);
        System.out.println(arrayStr2);

        // remove также удаляет объекты для этого примера создадим класс RemoveExample

    }
}
