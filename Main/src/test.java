import java.util.Scanner;

public class test {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the value:=");
        int a = sc.nextInt();
        int sum = 0;
        int rem;
        if  (a<1000||a>9999)
        {
            System.out.println(a+" is a Invalid Number");
                    }
                    else{
        while (a > 0) {
            rem = a % 10;
            sum = sum + rem;
            a = a / 10;
        }
    
        System.out.println(sum);
        
        if(sum%3==0 || sum%5==0 || sum%7==0)
        {
            System.out.println("Lucky Number");

        }
        else{
            System.out.println("Sorry it's not a lucky number");
        }
    }
    }
        



    }
