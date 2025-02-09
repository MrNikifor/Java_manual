package Collection.Collections.Methods;
// что бы найти нужный нам объкт, необходимо отсортировать наш лист с помощью интерфейса Comparable
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BinarySearchObject {
    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();
        Student emp1 = new Student(3, "Nikita", "Osinskiy", 200_000);
        Student emp2 = new Student(1, "Sergey", "Markushew", 150_000);
        Student emp3 = new Student(1, "Nikolay", "Lagutin", 100_000);
        Student emp4 = new Student(10, "Irina", "Mashkova", 70_000);
        Student emp5 = new Student(5, "Igor", "Malinov", 120_000);
        Student emp6 = new Student(8, "Masha", "Litovka", 170_000);
        studentList.add(emp1);
        studentList.add(emp2);
        studentList.add(emp3);
        studentList.add(emp4);
        studentList.add(emp5);
        studentList.add(emp6);
        System.out.println("Before sorting: \n" + studentList);
        Collections.sort(studentList);
        System.out.println("After sorting: \n" + studentList);
        // поиск объекта черех BinarySearch()
        int index = Collections.binarySearch(studentList,new Student(5, "Igor", "Malinov", 120_000));
        System.out.println(index);
    }
}
 class Student implements Comparable<Student> {
    int id;
    String name;
    String surname;
    int salary;

    public Student(int id, String name, String surname, int salary) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Person{" +
                " id = " + id +
                ", name = '" + name + '\'' +
                ", surname = '" + surname + '\'' +
                ", salary = " + salary +
                '}';
    }
     // в методе Comparable определим что если при сортировке по id они совпадут, то будем сортировать по имени
     @Override
     public int compareTo(Student anoterSt) {
         int result = this.id - anoterSt.id;
         if (result==0)
             result=this.name.compareTo(anoterSt.name);
         return result;
     }
 }