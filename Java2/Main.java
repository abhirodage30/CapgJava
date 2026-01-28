import java.util.*;

class Employee {
    String name;
    int salary;
    int age;

    public Employee(String name, int salary, int age) {
        this.name = name;
        this.salary = salary;
        this.age = age;
    }
}

public class Main {
    public static void main(String[] args) {
        List<Employee> e = new ArrayList<Employee>();
        e.add(new Employee("Rishi", 30000, 29));
        e.add(new Employee("Hiresh", 47000, 31));
        e.add(new Employee("Vikas", 50000, 36));
        e.add(new Employee("Vikas", 50000, 36));

        System.out.println();
        e.sort(Comparator.comparing(e1 -> e1.name));
        for (Employee e1 : e) {
            System.out.println(e1.name + " " + e1.salary + " " + e1.age);
        }
        System.out.println();
        e.sort(Comparator.comparing(e1 -> e1.salary));
        for (Employee e1 : e) {
            System.out.println(e1.name + " " + e1.salary + " " + e1.age);
        }
        System.out.println();
        e.sort(Comparator.comparing(e1 -> e1.age));
        for (Employee e1 : e) {
            System.out.println(e1.name + " " + e1.salary + " " + e1.age);
        }
        

    }
}