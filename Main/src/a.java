import java.util.*;

public class a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number=");
        int a = sc.nextInt();
        switch (a) {
            case 1: {
                int b;
                Scanner sn = new Scanner(System.in);
                System.out.println("enter the number");
                b = sn.nextInt(); // You need to read an integer for b
                if (b % 2 == 0) {
                    System.out.println("even");
                }
                break; // Added to terminate the case
            }
        }
    }
}
