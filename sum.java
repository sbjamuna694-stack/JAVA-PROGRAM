public class sum {
    public static void main(String[] args) {
        int number = 7584;
        int sum = 0;

        while (number > 0) {
            sum += number % 10; 
            number /=10;
        }
          
        System.out.println("Sum of digits: " + sum); 
    }
}

