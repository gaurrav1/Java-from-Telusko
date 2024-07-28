import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class CSet{
    public static void main(String[] args) {
        Set<Integer> list = new HashSet<Integer>(); // You can use TreeSet for getting sorted Set
        list.add(4);
        list.add(7);
        list.add(4);
        list.add(6);
        
        // System.out.println(list);
        
        // for(int n: list){
        //     System.out.print(n + " ");
        // }
        
        Iterator<Integer> values = list.iterator();
        while (values.hasNext()) {
            System.out.print(values.next() + " ");
        }

        System.out.println();
    }
}
