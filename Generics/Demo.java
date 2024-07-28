//  Generics introduced in Java 1.5

import java.util.ArrayList;

class Student {
    int rollno;
    String name;

    public Student(int rollno, String name) {
        this.rollno = rollno;
        this.name = name;
    }

}

public class Demo {
    public static void main(String[] args) {

        // // Type safety
        // String arr[] = new String[5];

        // arr[0] = "Rohan";
        // arr[1] = "ROhit";
        // arr[2] = "Rahul";
        // arr[3] = "Ramesh";
        // arr[4] = "Ramniy";

        // String name1 = arr[0];
        // // I am sure that it will have to have string type data.

        // NO type safety
        // ArrayList list = new ArrayList<>();
        // list.add("Rohan");
        // list.add("ROhit");
        // list.add("Rahul");
        // list.add(10);

        // User of data:
        // It is object type, we need to downcast it...
        // String s = (String) list.get(0);
        // System.out.println(s.toUpperCase());

        // Leads you to runtime exception
        // String s2 = (String) list.get(3);
        // System.out.println(s2.toUpperCase());

        // So we need generics <>

        ArrayList<String> list2 = new ArrayList<>();
        list2.add("Rohan");
        list2.add("Rohit");
        list2.add("Rahul");
        // list2.add(10); // Compile time error

        // Here thing to notice is Generics only accepts reference type, not primitive
        // type.
        // So we can't use int, char, float, double, boolean etc. Instead we uses
        // wrapper classes or own build classes.

        ArrayList<Student> list3 = new ArrayList<>();
        list3.add(new Student(1, "Rohan"));
        list3.add(new Student(2, "Rohit"));
        list3.add(new Student(3, "Rahul"));

    }
}