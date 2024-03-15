import java.util.*;
public class february {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter temperature in degree=");
        double fahrenheit = sc.nextDouble();
        double celsius;

        if (fahrenheit < -459.67) 
        {
            System.out.println("Temperature below absolute zero is not possible.");
        } 
        else 
        {
            celsius = (fahrenheit - 32) * 5 / 9;
            System.out.println("Temperature in Celsius: " + celsius);
        }

    }
    }

