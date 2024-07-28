import java.util.ArrayList;

class Human {
    public void sleep() {
        System.out.println("Human is sleeping");
    }
}

class Employee extends Human {
    public void work() {
        System.out.println("Employee is working");
    }
}

public class WildCard {
    public static void main(String[] args) {
        Human human = new Human();
        Employee employee = new Employee();
        human = employee; //Allowed

        // ArrayList<Human> humans = new ArrayList<>();
        // ArrayList<Employee> employees = new ArrayList<>();
        // humans = employees; //Not allowed

        ArrayList<?> humans = new ArrayList<>();
        ArrayList<Employee> employees = new ArrayList<>();
        humans = employees; //Allowed
    }
}
