package Collection.ArrayList.Methods;

import java.util.ArrayList;
import java.util.Objects;
//Чтобы удалить объект с помощью remove, необходимо сперва проверить объекты на equals()
public class RemoveExample {
    public static void main(String[] args) {
        Student st1 = new Student("Никита", 37, 2);
        Student st2 = new Student("Сергей", 30, 3);
        Student st3 = new Student("Вася", 25, 4);

        ArrayList<Student> studentsList = new ArrayList<>();
        studentsList.add(st1);
        studentsList.add(st2);
        studentsList.add(st3);
        System.out.println(studentsList);
        Student st4 = new Student("Вася", 25, 4);
        studentsList.remove(st4);
        System.out.println(studentsList);
    }

}

class Student {
    String name;
    int age;
    int course;

    public Student(String name, int age, int course) {
        this.name = name;
        this.age = age;
        this.course = course;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age && course == student.course && Objects.equals(name, student.name);
    }

}
