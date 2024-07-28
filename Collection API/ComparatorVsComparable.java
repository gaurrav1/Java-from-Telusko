import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

// class Student {
//     int age;
//     String name;

//     public Student(int age, String name) {
//         this.age = age;
//         this.name = name;
//     }

//     @Override
//     public String toString() {
//         return "Student [age=" + age + ", name=" + name + "]";
//     }
    
// }

class Student implements Comparable<Student>{
    int age;
    String name;

    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student [age=" + age + ", name=" + name + "]";
    }

    public int compareTo(Student that) {
        return (this.age > that.age) ? 1 : -1;
    }
    
}

public class ComparatorVsComparable {
    public static void main(String[] args) {

        // Part - 1
        // ComparatorVsComparable c = new ComparatorVsComparable();
        // System.out.println(c.toString());

        Comparator<Integer> com = new Comparator<Integer>() {
            //In interface, we need to define data type both the side.
            public int compare(Integer i, Integer j){
                if (i%10 > j%10) {
                    return 1;
                }
                else {
                    return -1;
                }
            }
        };

        List<Integer> nums = new ArrayList<>();
        // You dont need to specify both side that It is Integer.
        nums.add(41);
        nums.add(79);
        nums.add(42);
        nums.add(47);

        Collections.sort(nums, com);
            //Now if we want to change sort logic like sort using last digit of number, We can use Comparator interface.
        
        System.out.println(nums);


        // Part - 2
        // Comparator is Functional interface, having only compare().
        // Comparator<Student> com = (Student i, Student j) -> (i.age > j.age) ? 1 : -1;

        List<Student> stud = new ArrayList<>();
        // You dont need to specify both side that It is Integer.
        stud.add(new Student(34, "Rohan"));
        stud.add(new Student(19, "Rick"));
        stud.add(new Student(45, "Doe"));
        stud.add(new Student(56, "Anderson"));

        // Collections.sort(stud, com); 
        // Students will not get sorted without com because we have not defined Comparable
        // We can use Collections.sort(stud); if we define our natural logic through implementing Comparable<> in Student class.

        Collections.sort(stud);
        for(Student s : stud) {
            System.out.println(s);
        }

        // Comparator lets you define your own logic of sorting.
        // Comparable gives power to the class itself or compare itself to sort.
    }
}
