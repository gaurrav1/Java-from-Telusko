import java.util.ArrayList;
import java.util.List;

class CArrayList{
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("A");
        list.add("B");

        
        System.out.println(list);
        System.out.println("At index 1: " + list.get(1));

        // for(Object o: list) {
        //     String s = (String) o;
        //     System.out.println(s);
        // }
    }
}