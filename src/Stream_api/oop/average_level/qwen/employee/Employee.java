package Stream_api.oop.average_level.qwen.employee;

class Employee {
    String name;
    double salary;
    String department;

    public Employee(String name, double salary, String department) {
        this.name = name;
        this.salary = salary;
        this.department = department;
    }

    @Override
    public String toString() {
        return name + " (" + salary + ")";
    }

    public String getDepartment() {
        return department;
    }

    public double getSalary() {
        return salary;
    }
}