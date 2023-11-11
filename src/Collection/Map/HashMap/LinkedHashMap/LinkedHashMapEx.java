package Collection.Map.HashMap.LinkedHashMap;

import java.util.LinkedHashMap;
import java.util.Objects;

/*LinkedHashMap является наследником HashMap и сортирует элементы в порядке их добавления или порядке их использования. */
public class LinkedHashMapEx {
    public static void main(String[] args) {
        /*В параметрах new LinkedHashMap<>(** ** **) мы можем указать три параметра:
        * 1 - длину листа(дефолтно - 16)
        * 2 - границу после которой размер листа будет удваиваться(дефолтно - 0.75)
        * 3 - будет указывать как храть элементы в листе по добавлению(false) или по использованию(true) */


        LinkedHashMap<Double, Student> linkHaMp = new LinkedHashMap<>(16,0.75f,true);
        Student st1 = new Student("Nikita","Osia",3);
        Student st2 = new Student("Serg","Mark",4);
        Student st3 = new Student("Nikolya","Lagut",1);
        Student st4 = new Student("Genya","Hlopotov",2);
        Student st5 = new Student("Mariy","Veselova",5);
        Student st6 = new Student("Nikifor","Osia",4);
        Student st7 = new Student("Dima","Zacepin",3);

        linkHaMp.put(5.5, st7);
        linkHaMp.put(7.9, st5);
        linkHaMp.put(8.2, st3);
        linkHaMp.put(7.8, st4);
        linkHaMp.put(9.1, st2);
        linkHaMp.put(8.8, st6);
        linkHaMp.put(9.9, st1);

        System.out.println(linkHaMp);

        /*При использовании логического выражения(true) в параметрах LinkedHashMap и после использования метода get()
        данные элемнты переместяться в конец списка.*/
        System.out.println(linkHaMp.get(5.5));
        System.out.println(linkHaMp.get(8.2));

        System.out.println(linkHaMp);
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
