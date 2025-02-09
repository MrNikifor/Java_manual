package Stream_api.oop.average_level.qwen.employee2;

class Employee {
    String name;
    String department;
    String gender;

    public Employee(String name, String department, String gender) {
        this.name = name;
        this.department = department;
        this.gender = gender;
    }

    public String getDepartment() {
        return department;
    }

    public String getGender() {
        return gender;
    }
}