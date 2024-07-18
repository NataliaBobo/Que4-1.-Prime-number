
public class PrimeNumber{

    // Creating a Constructor
    public PrimeNumber() {
        System.out.println("PrimeAndFibonacci object created.");
    }

    //check if a number is prime using non-static method
    public boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int x = 2; x <= Math.sqrt(number); x++) {
            if (number % x == 0) {
                return false;
            }
        }
        return true;
    }

    // Static method to print all prime numbers up to a given number
    public static void printPrimes(int limit) {
        PrimeNumber pn = new PrimeNumber();
        for (int x = 1; x <= limit; x++) {
            if (pn.isPrime(x)) {
                System.out.println(x + " is a prime number.");
            }
        }
    }

    // Static method to find the sum of all even-valued terms in the Fibonacci sequence up to a given maximum value
    public static int sumEvenFibonacci(int maxValue) {
        int sum = 0;
        int a = 1;
        int b = 2;
        while (a <= maxValue) {
            if (a % 2 == 0) {
                sum += a;
            }
            int next = a + b;
            a = b;
            b = next;
        }
        return sum;
    }

    // Main method
    public static void main(String[] args) {
        // Print prime numbers between 1 and 500
        System.out.println("Prime numbers between 1 and 500:");
        printPrimes(500);

        // Sum of even Fibonacci numbers not exceeding four million
        int maxFibonacciValue = 4000000;
        int sumEvenFibonacci = sumEvenFibonacci(maxFibonacciValue);
        System.out.println("Sum of even Fibonacci numbers not exceeding " + maxFibonacciValue + " is " + sumEvenFibonacci);
    }



}
