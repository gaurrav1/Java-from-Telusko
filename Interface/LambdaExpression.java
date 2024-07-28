package Interface;
// Lambda Expression required functional interface

@FunctionalInterface
interface Sum {
    int add(int i, int j);

}

public class LambdaExpression {
    public static void main(String[] args) {
        Sum obj = (i,j) -> i+j;
        int result = obj.add(5, 7);
        System.out.println(result);
    }
}


//Types of Interfaces
// 1. Normal Interface
// 2. Single Abstract Method Interface (Functional Interface)
// 3. Marker Interface

// 1. Normal Interface: Interface with multiple methods
// 2. Single Abstract Method Interface (Functional Interface): Interface with only one abstract method
// 3. Marker Interface: Interface with no method
//    Example: Serializable, Clonable, Remote, EventListener, RandomAccess
