package Interface;

class A {
    public void showTheDataWhichBelongsToThisClass() {
        System.out.println("Hey, I am in A");
    }
}

class B extends A {
    @Override // Let you know if you are doing mistake in overriding by compiler
    public void showTheDataWhichBelongsToThisClass() {
        System.out.println("Hey, I am in B");
    }
}

public class Annotation {
    public static void main(String[] args) {
        B obj = new B();
        obj.showTheDataWhichBelongsToThisClass();
    }
}
