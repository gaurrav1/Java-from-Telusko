package Exceptions;

//Exceptions are runtime errors.

//Exception hierarchy
// -> Object
//      -> Throwable
//          -> Error
//          -> Exception ...
//                 -> RuntimeException (Unchecked)
//                 -> SQLException, IOException (Checked)

public class Exceptions {
    @SuppressWarnings("null")
    public static void main(String[] args) {
        
        int i = 1;
        int j = 3;
        int[] arr = new int[5];
        String str = null;

        try{
            int k = i/j;
            System.out.println(k);
            arr[5] = 10;
            System.out.println(str.length());
        }
        catch(ArithmeticException e) {
            System.out.println("Cannot / by zero");
        }
        catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("Index out of bound");
        }
        catch(NullPointerException e) {
            System.out.println("Provided string is null");
        }
        catch(Exception e) {
            System.out.println("SOmething went wrong");
        }

    }
}
