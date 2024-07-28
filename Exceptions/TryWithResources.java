package Exceptions;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TryWithResources {
    public static void main(String[] args) throws NumberFormatException, IOException {
        
        try (BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));){
            
            int num = Integer.parseInt(bf.readLine());
            System.out.println(num);

        }
        // finally {
        //     bf.close();
        // }
    }
}
