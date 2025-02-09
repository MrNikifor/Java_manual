package patterns.generating.builder;
/*
1)Создайте статический вложенный класс (static nested class) как класс Builder, а затем скопируйте все поля из внешнего класса в класс Builder.
Мы должны следовать соглашению об именах, поэтому если имя класса Person, то класс Builder должен называться как PersonBuilder.
2)Класс Builder должен иметь общедоступный конструктор со всеми необходимыми полями в качестве параметров.
3)Класс Builder должен иметь методы для установки необязательных параметров, и он должен возвращать тот же объект Builder после установки необязательного поля.
4)Последним шагом является предоставление метода build() в классе Builder, который будет возвращать объект, необходимый клиентской программе.
Для этого нам нужно иметь частный конструктор в основном классе с классом Builder в качестве аргумента.*/
public class Person {
    private String name;
    private String company;
    private boolean hasCar;
    private boolean hasBike;
    private int age;

    private Person(PersonBuilder builder) {
        this.name = builder.name;
        this.company = builder.company;
        this.hasCar = builder.hasCar;
        this.hasBike = builder.hasBike;
        this.age = builder.age;
    }

    public static class PersonBuilder {
        private String name;
        private String company;
        private boolean hasCar;
        private boolean hasBike;
        private int age;

        public PersonBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public PersonBuilder setCompany(String company) {
            this.company = company;
            return this;
        }

        public PersonBuilder setHasCar(boolean hasCar) {
            this.hasCar = hasCar;
            return this;
        }

        public PersonBuilder setHasBike(boolean hasBike) {
            this.hasBike = hasBike;
            return this;
        }
        public PersonBuilder setAge(int age) {
            this.age = age;
            return this;
        }

        public Person build() {
            return new Person(this);
        }
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", company='" + company + '\'' +
                ", hasCar=" + hasCar +
                ", hasBike=" + hasBike +
                '}';
    }

    public static void main(String[] args) {
        Person person = new Person.PersonBuilder()
                .setName("Niki")
                .setCompany("Best")
                .setHasCar(false)
                .setHasBike(false).build();
        System.out.println(person);

        Person person1 = new PersonBuilder()
                .setName("Vetik")
                .setCompany("Best2")
                .setHasCar(false)
                .setHasBike(true)
                .setAge(9)
                .build();
        System.out.println(person1);
    }
}
