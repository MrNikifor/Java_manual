package Collection.Map.TreeMap;

import java.util.Comparator;
import java.util.Objects;
import java.util.TreeMap;
/*Все элементы в TreeMap хронятся в отсортированом виде по ключю(но он не может сортировать объекты по полям,
так как интерфейс Comparable не имплементирован, для необходимости нужно имплементировать данный интерфейс к
необходимому классу и отредактировать метод CompereTo по каким полям будет идти сортиртировка, либо при созданнии
объекта(new TreeMap<>(new Comparator<Student>())реализовать Comparator)).
* В основе TreeMap лежит красно-черное дерево, это позволяет методам работать быстро но не быстрее чем в HashMap. */
public class TreeMapMethods {
    public static void main(String[] args) {
        TreeMap <Double,Student> treeMap = new TreeMap<>();
        Student st1 = new Student("Nikita","Osia",3);
        Student st2 = new Student("Serg","Mark",4);
        Student st3 = new Student("Nikolya","Lagut",1);
        Student st4 = new Student("Genya","Hlopotov",2);
        Student st5 = new Student("Mariy","Veselova",5);
        Student st6 = new Student("Nikifor","Osia",4);
        Student st7 = new Student("Dima","Zacepin",3);

        treeMap.put(5.5, st7);
        treeMap.put(7.9, st5);
        treeMap.put(8.2, st3);
        treeMap.put(7.8, st4);
        treeMap.put(9.1, st2);
        treeMap.put(8.8, st6);
        treeMap.put(9.9, st1);

        //коллекция TreeMap выводит отсортировав список по ключу
        System.out.println(treeMap);

        //get() - выведет значение по ключу
        System.out.println(treeMap.get(5.5));

        //remove() - удалит занчанеи по ключу
        treeMap.remove(9.9);

        //descendingMap() - выведит список в обратной сортировке
        System.out.println(treeMap.descendingMap());

        //tailMap() - выводит отсортированный список по ключу отсортировав после данного ключа выше
        System.out.println(treeMap.tailMap(7.9));

        //headMap() - выводит отсортированный список по ключу отсортировав после данного ключа ниже
        System.out.println(treeMap.headMap(7.9));

        //lastEntry() - выводит самый последний элемент
        System.out.println(treeMap.lastEntry());

        //firstEntry() - выводит первый элемент
        System.out.println(treeMap.firstEntry());

    }
}
class Student{
    String name;
    String surname;
    int course;

    public Student(String name, String surname, int course) {
        this.name = name;
        this.surname = surname;
        this.course = course;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return course == student.course && Objects.equals(name, student.name) && Objects.equals(surname, student.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, course);
    }
}
