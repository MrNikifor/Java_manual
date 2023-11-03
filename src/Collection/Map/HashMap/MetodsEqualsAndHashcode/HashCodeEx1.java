package Collection.Map.HashMap.MetodsEqualsAndHashcode;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class HashCodeEx1 {
    public static void main(String[] args) {
        Map<Student,Double> map = new HashMap<>();
        Student st1 = new Student("Nikita","Osia",3);
        Student st2 = new Student("Serg","Mark",4);
        Student st3 = new Student("Nikolya","Lagut",1);
        map.put(st1,7.5);
        map.put(st2,9.2);
        map.put(st3,8.1);

        System.out.println(map);

        Student st4 = new Student("Serg","Mark",4);
        Student st5 = new Student("Dmitriy","Zacep",5);

        boolean result = map.containsKey(st4); // проверка на наличие студента в map по ключу
        System.out.println("result = " + result);// без переопределения hashCoda результат будет false, иначе true

        System.out.println(st2.equals(st4)); // equals вернет нам true, так как студенты по полям абсолютно идеентичны
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
