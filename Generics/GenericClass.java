

class Student<T>{
    T obj;

    public Student(T obj) {
        this.obj = obj; 
    }

    
    public void disply() {
        System.out.println(obj.getClass().getName());
    }
    
    public T getObj() {
        return obj;
    }
}

public class GenericClass {
    public static void main(String[] args) {
        Student<Integer> s1 = new Student<>(10);
        s1.disply();
        System.out.println(s1.getObj());

        Student<String> s2 = new Student<>("Ram");
        s2.disply();
        System.out.println(s2.getObj());
    }
}
