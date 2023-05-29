package Collection.ArrayList.Methods;

import java.util.ArrayList;

public class Methods1 {
    public static void main(String[] args) {
        // add() - добавляет елемент в лист, если в параметре добавлении метода указать индекс, то объект добавиться
        // именно на ту позицию, на примере с Томарой.
        ArrayList<String> arrayStr = new ArrayList<>();
        arrayStr.add("Иван");
        arrayStr.add("Вася");
        arrayStr.add("Инна");
        arrayStr.add(0,"Томара");
        System.out.println(arrayStr);

        // get() - возвращает значение елемента с определенным индексом, вернем Томару
        ArrayList<String> arrayStr2 = new ArrayList<>(arrayStr);
        System.out.println(arrayStr2.get(0));
        // выведем все значения с помощью метода get() через цыкл.
        for (int i = 0; i < arrayStr2.size(); i++) {
            System.out.println(arrayStr2.get((i)));
        }
        // set() - метод заменяет существующий елемент на новый, пример Инокентий -> Томара
        arrayStr2.set(0,"Инокентий");
        System.out.println(arrayStr2);

        //remove() - удаляет элементы по индексу и тогда все элементы смещаются влево. удалим Ивана
        arrayStr2.remove(1);
        System.out.println(arrayStr2);

        // remove() также удаляет объекты для этого примера создадим класс RemoveExample

        // addALL() - этот метод добавляет другой ArrayList в конец листа(после последнего индекса элемента.
        // также можно другой лист добавить в  соответсвующий индекс, просто указав его.
        arrayStr.addAll(arrayStr2);
        System.out.println(arrayStr);
        arrayStr.addAll(2,arrayStr2);
        System.out.println(arrayStr);

        // clear() - удаляет все элементы с листа
        arrayStr.clear();
        System.out.println(arrayStr);
        System.out.println(arrayStr2);

        // indexOf() - вовращает индекс элемента в листе. Если мы работаем с объектами то с помощью метода equals()
        // сравнивает объекты и возвращает индекс, если же такого элемента(объекта нет) то возвращает -1.
        System.out.println(arrayStr2.indexOf("Инна"));

        // size() - возвращает количество элеменот в листе
        System.out.println(arrayStr2.size());

        // isEmpty() - возвращает false если лист не пуст и true если лист пуст
        System.out.println(arrayStr2.isEmpty());// не пуст
        System.out.println(arrayStr.isEmpty());// пуст

        // contains() - проверяет содержет ли лист указанный объект, false - не содержит, true - содержит
        System.out.println(arrayStr2.contains("Вася"));// содержит
        System.out.println(arrayStr2.contains("Кирилл"));// не сожержит

        // toString() - коректный вывод объектов на экран
    }
}
