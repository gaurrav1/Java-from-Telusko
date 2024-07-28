package Exceptions;

class MyException extends Exception {
    public MyException(String s) {
        super(s);
    }
}

public class CustomException {
    public static void main(String[] args) {
        int i = 20;
        int j = 0;

        try {
            j = 18 / i;
            if(j == 0)
                throw new MyException("I dont want to print zero"); // Throw arithmatic class to catch block
            System.out.println(j);
        } catch (MyException e) {
            j = 18/1;
            System.out.println("Thats the default output!! \n" + e);
        } catch (Exception e) {
            System.out.println("Something went wrong");
        }
    }
}
