import java.util.*;
public class App {
    public static void main(String[] args) {

       Scanner sc= new Scanner(System.in);
        System.out.print("enter the number=");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int d=sc.nextInt();
        if(a>b && a>c && a>d) 
        {
            System.out.println("a is maximum");
        }
        if(b>a && b>c && b>d)
        {
            System.out.println("b is maximum");
        }
        if(c>a && c>b && c>d)
        {
            System.out.println("c is maximum");
        }
        if(d>a && d>b && d>c)
        {
            System.out.println("d is maximum");
        }
    }
    
}
