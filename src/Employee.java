public class Employee {
    String name;
    int age;
    double salary;
    String location;

    Employee(String name, int age, double salary, String location) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.location = location;
    }

    Employee(String name, int age) {
        this(name, age, (double) 0, "Minsk, Belarus");
    }

    public void raiseSalary(double percentageOfRaise) {
        this.salary *= 1 + percentageOfRaise / 100;
    }
}
