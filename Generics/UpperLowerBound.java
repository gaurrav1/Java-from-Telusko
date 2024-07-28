import java.util.ArrayList;

class Human {
    public void sleep() {
        System.out.println("Human is sleeping");
    }
}

class Employee extends Human {
    public void sleep() {
        System.out.println("Employee is working");
    }
}



public class UpperLowerBound {

    public static void upper(ArrayList<? extends Human> humans) {
        for (Human human : humans) {
            human.sleep();
        }
    }

    public static void lower(ArrayList<? super Human> humans) {
        for (Object human : humans) {
            System.out.println(human.toString());
        }
    }
    
    public static void main(String[] args) {

        Human human = new Human();
        Human humanTwo = new Human();
        Employee employee = new Employee();
        Employee employeeTwo = new Employee();

        ArrayList<? extends Human> humans = new ArrayList<>(); // Upper bound - Either Human or its subclass
        // ArrayList<? super Human> humans = new ArrayList<>(); // Lower bound - Either Human or its super class
        // humans.add(human); // Not allowed because we don't know the type of the list

        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(employee);
        employees.add(employeeTwo);

        ArrayList<Human> humans1 = new ArrayList<>();
        humans1.add(human);
        humans1.add(humanTwo);

        ArrayList<String> strings = new ArrayList<>();

        humans = employees; //Allowed
        humans = humans1; //Allowed
        // humans = strings; //Not allowed because String is not a subclass of Human

        upper(employees);
        upper(humans1);

        lower(humans1);
        // lower(employees); // Not allowed because Employee is not a superclass of Human
    }
}
