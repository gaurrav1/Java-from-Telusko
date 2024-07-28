package Interface;

@FunctionalInterface // Ensure there is exctly one abstract method
interface A {
    void show();
}

// 1 way implement the interface
// class B implements A {
//     @Override
//     public void show() {
//         System.out.println("Hey, I am in B");
//     }
// }

public class FunctionalInterfac {
    public static void main(String[] args) {
        // 2 way implement through anonymous inner class
        A obj = new A() {
            @Override
            public void show() {
                System.out.println("Im in show");
            }
        };
        obj.show();
    }
}
