public class Main {

    public static void main(String[] args) {
        Employee employee1 = new Employee("Danila F", 23, 1000, "Gomel, Belarus");
        Employee employee2 = new Employee("Dima G", 18);
        employee1.raiseSalary(50);
        employee2.salary += 100;
        employee2.raiseSalary(1000);
        System.out.printf("Salary of %s: %.2f\n" +
                          "Salary of %s: %.2f\n", employee1.name, employee1.salary, employee2.name, employee2.salary);
    }
}
