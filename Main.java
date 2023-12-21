public class Main {
    public static void main (String [] args) {
        Employee employee = new Employee("Anastasiia", "Buchak", 25, "QA");
        System.out.println(employee.getAge());
        employee.setAge(35);
        System.out.println(employee.getAge());

    }
}
