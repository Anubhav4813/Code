public class Employee extends Person {
    // Person is parent class and Employee is child class
    private String name;
    public Employee(String name) {
        this.name = name;
    }
    public String getName() {
        return this.name;
    }

    public static void main(String[] args) {
        Employee employee = new Employee("Anubhav");
        System.out.println("Employee's Name " + employee.getName());

        Person person = new Employee("Robin");
        System.out.println("Employee-Person's Name " + person.getName());
    }
}
