package Interface;
import java.util.*;

public class InputWays {
    public static void main(String[] args) throws Exception{

        // -----------------Method - 1
        // System.out.println("Enter a number: ");
        // int a = System.in.read(); // This will collect 1 element and return ASCII value of input
        // System.out.println(a);


        // -----------------Method - 2
        // InputStreamReader in = new InputStreamReader(System.in);
        // BufferedReader br = new BufferedReader(in);

        // int num = Integer.parseInt(br.readLine());
        // System.out.println(num);

        // br.close();
        // in.close();

        // -----------------Method - 3
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(num);
        sc.close();


    }
}
