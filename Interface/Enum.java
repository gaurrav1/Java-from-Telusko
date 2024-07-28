package Interface;
enum Status {
    PENDING, ACTIVE, INACTIVE, DELETED;
    // All are constants and type of Status
}

public class Enum {

    public static void main(String[] args) {
        System.out.println("Hello World");
        // Status s = Status.ACTIVE;
        // System.out.println(s);
        // System.out.println(s.ordinal());

        //  Status.values() returns an array of Status
        // Status[] ss = Status.values();
        // for (Status s : ss) {
        //     System.out.println(s + " " + s.ordinal());
        // }

        //  Enum If and Switch
        // Status s = Status.ACTIVE;
        // if (s == Status.ACTIVE) {
        //     System.out.println("All good");
        // }
        // else if (s == Status.PENDING) {
        //     System.out.println("Wait for a while!");
        // }
        // else if (s == Status.INACTIVE) {
        //     System.out.println("YOu are inactive");
        // }
        // else
        //     System.out.println("You are deleted");

        // switch (s) {
        //     case PENDING:
        //         System.out.println("Ohh, hold on status shows pending! ");
        //         break;
        //     case ACTIVE:
        //         System.out.println("All good");
        //         break;
        //     case INACTIVE:
        //         System.out.println("You are inactive");
        //         break;
        //     case DELETED:
        //         System.out.println("You are deleted");
        //         break;
        //     default:
        //         System.out.println("Invalid status");
        //         break;
        // }

        
    }
}
