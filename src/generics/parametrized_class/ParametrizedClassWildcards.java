package generics.parametrized_class;

import java.util.ArrayList;
import java.util.List;

public class ParametrizedClassWildcards {
    public static void main(String[] args) {
        // при создании колеекций нельзя в новом объекте указывать собкласс, так как в классах ниже другие требования
        //  к объектам.
        //List<Number> list = new ArrayList<Integer>(); - так делать нельзя!
        //List<Object> list = new ArrayList<String>(); - так делать нельзя!

        // но имеется знак вопрос <?>(wildcards) которым можно воспользоваться так как он учитывает все возможные классы.
        List<?> list = new ArrayList<String>(); // так можно делать, но дабовлять объкты не получится
        // list.add("dog"); - нельзя так делать

        List<? extends Number> listNum = new ArrayList<>(); // так тоже можно, тем самым мы будем использовать
        // наследование ниже класса Number.

        List<? super Number> listSup = new ArrayList<Object>(); // здесть же наоборот используем супер классы которые
        // стоят по иерархии выше


        // Примеры использования ?
        List<Double> list1 = new ArrayList<>();
        list1.add(6.44);
        list1.add(9.44);
        list1.add(1.44);
        showListInfo(list1);
        List<String> list2 = new ArrayList<>();
        list2.add("Cat");
        list2.add("Dog");
        list2.add("Fox");
        showListInfo(list2);

        // пример метода summ
        List<Double> list10 = new ArrayList<>();
        list10.add(1.5);
        list10.add(2.5);
        list10.add(3.5);
        List<Integer> list20 = new ArrayList<>();
        list20.add(3);
        list20.add(4);
        list20.add(7);
        System.out.println(summ((ArrayList<? extends Number>) list20) + summ((ArrayList<? extends Number>) list10));
    }

    static void showListInfo(List<?> list) {
        System.out.println("Мой лист содержит следующие элементы: " + list);
    }

    // создадим метод который может складывать сумму double и int(тоесть все переменные которые наследуются от Number)
    public static double summ(ArrayList<? extends Number> arr) {
        double summ = 0;
        for (Number number : arr) {
            summ += number.doubleValue();
        }
        return summ;
    }
}
