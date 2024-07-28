
// Map: Collection instead of index and element, Map is of Key and Value pair
//      Keys are unique. In other word Keys are Set.
//      Values can be changed. In other word Values are List.

import java.util.HashMap;
import java.util.Map;

public class CMap {
    public static void main(String[] args) {
       Map<String, Integer> studentsMap = new HashMap<>(); // We can also use Hashtable. Hash table is synchronized.
       
       studentsMap.put("Gaurav", 34);
       studentsMap.put("Navin", 100);
       studentsMap.put("Abc", 68);
       studentsMap.put("Abc", 98);

       System.out.println(studentsMap);
       System.out.println(studentsMap.get("Navin"));
       System.out.println(studentsMap.keySet());

       for(String key : studentsMap.keySet()){
            System.out.println(key + " : " + studentsMap.get(key));
       }
    }
}
