public class aayush {
    public static void main(String[] args) {
        int limit = 100; 
        int sum = 0;

      
        for (int i = 1; i <= limit; i++) {
            if (i%2==0) { 
                sum +=i;
            }
        }

        System.out.println("The sum of even numbers from 1 to " + limit + " is: " + sum);
    }
}
