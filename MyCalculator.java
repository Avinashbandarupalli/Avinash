import java.util.Scanner;

interface AdvancedArithmetic {
    int divisor_sum(int n);
}

class MyCalculator implements AdvancedArithmetic {
    @Override
    public int divisor_sum(int n) {
        int sum = 0;
       
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                sum += i; 
            }
        }
        return sum; 
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(); 
        MyCalculator myCalculator = new MyCalculator();
        
        int sumOfDivisors = myCalculator.divisor_sum(n);
        
        System.out.println("I implemented: AdvancedArithmetic");
        System.out.println(sumOfDivisors);
        
        scanner.close();
    }
}
