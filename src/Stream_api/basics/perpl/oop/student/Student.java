package Stream_api.basics.perpl.oop.student;

public class Student {
    private String name;
    private int grade;
    private int age;

    public Student(String name, int grade, int age) {
        this.name = name;
        this.grade = grade;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getGrade() {
        return grade;
    }

    public int getAge() {
        return age;
    }
    @Override
    public String toString() {
        return name + " (" + grade + ", " + age + ")";
    }
}
