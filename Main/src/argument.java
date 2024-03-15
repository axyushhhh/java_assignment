import java.util.*;

public class argument {
    Scanner sc = new Scanner(System.in);

    void minus() {
        System.out.print("Enter the value of a: ");
        int a = sc.nextInt();
        System.out.print("Enter the value of b: ");
        int b = sc.nextInt();
        int c = a - b;
        System.out.println("Result of subtraction: " + c);
    }

    void add() {
        System.out.print("Enter the value of x: ");
        int x = sc.nextInt();
        System.out.print("Enter the value of y: ");
        int y = sc.nextInt();
        int z = x + y;
        System.out.println("Result of addition: " + z);
    }

    void div() {
        System.out.print("Enter the value of a: ");
        int a = sc.nextInt();
        System.out.print("Enter the value of b: ");
        int b = sc.nextInt();
        if (b != 0) {
            int c = a / b;
            System.out.println("Result of division: " + c);
        } else {
            System.out.println("Cannot divide by zero.");
        }
    }

    void multi() {
        System.out.print("Enter the value of a: ");
        int a = sc.nextInt();
        System.out.print("Enter the value of b: ");
        int b = sc.nextInt();
        int c = a * b;
        System.out.println("Result of multiplication: " + c);
    }

    public static void main(String[] args) {
        argument k = new argument();
        k.minus();
        k.add();
        k.div();
        k.multi();
    }
}
