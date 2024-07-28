package Exceptions;

// Throws is used to declare an exception

class A {
    void show() throws ClassNotFoundException {
        Class.forName("Exceptions.Deemo");
    }
}

public class Demo {
    public static void main(String[] args) {
        A obj = new A();
        try {
            obj.show();
        }
        catch(ClassNotFoundException e ) {
            System.out.println("Class not found");
        }
    }
}
