import java.util.Scanner;

public class methodLab {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        // MAIN METHOD


        // TASK 1: Call greeting method
        greetUser();

        // TASK 2: Arithmetic operations
        System.out.println("\nTASK 2: ARITMAETIC OPERATIONS");
        System.out.println("Enter two numbers: ");

        int num1 = input.nextInt();
        int num2 = input.nextInt();

        System.out.println("Addition: " + add(num1, num2));
        System.out.println("Subtraction: " + subtract(num1, num2));
        System.out.println("Multiplication: " + multiply(num1, num2));
        System.out.println("Division: " + divide(num1, num2));

        // TASK 3: Factorial
        System.out.println("\nTASK 3: FACTORIAL");
        int factorialNum;

        while (true) {
            System.out.print("Enter a number for factorial (0-12): ");
            factorialNum = input.nextInt();

            if (factorialNum >= 0 && factorialNum <= 12) {
                System.out.println("Factorial: " + factorial(factorialNum));
                break; // Exit loop if input is valid
            } else {
                System.out.println("Invalid number! Please enter 0-12.");
            }
        }

        // TASK 4: Sum of array
        System.out.println("\nTASK 4: SUM OF ARRAY");
        int[] moew = {10, 15, 20, 12, 18};

        System.out.println("Sum of array elements: " + sumArray(moew));

        // TASK 5: Prime number
        System.out.println("\nTASK 5: PRIME NUMBER");
        System.out.print("Enter a number to check prime: ");
        int primeNum = input.nextInt();

        if (isPrime(primeNum)) {
            System.out.println(primeNum + " is prime.");
        } else {
            System.out.println(primeNum + " is not prime.");
        }

        // TASK 6: Maximum number in array
        System.out.println("\nTASK 6: MAXIMUM NUMBER IN ARRAY (Additional Task)");
        System.out.println("Largest array element: " + maxInArray(moew));

        // TASK 7: GCD and LCM
        System.out.println("\nTASK 7: GCD & LCM (Additional Task)");
        System.out.print("Enter two positive integers for GCD and LCM: ");
        int a = input.nextInt();
        int b = input.nextInt();

        if (a > 0 && b > 0) {
            System.out.println("GCD: " + gcd(a, b));
            System.out.println("LCM: " + lcm(a, b));
        } else {
            System.out.println("Please enter positive integers.");
        }

        // CHALLENGE 1: Recursive factorial
        System.out.println("\nCHALLENGE 1: RECURSIVE FACTORIAL");

        int recursiveNum;

        while (true) {
            System.out.print("Enter a number for recursive factorial (0-12): ");
            recursiveNum = input.nextInt();

            if (recursiveNum >= 0 && recursiveNum <= 12) {
                System.out.println("Recursive Factorial: "
                        + recursiveFactorial(recursiveNum));
                break;
            } else {
                System.out.println("Invalid number! Please enter 0-12.");
            }
        }

        // CHALLENGE 2: Fibonacci
        System.out.println("\nCHALLENGE 2: FIBONACCI");

        int fibNum;

        while (true) {
            System.out.print("Enter Fibonacci position (0-40): ");
            fibNum = input.nextInt();

            if (fibNum >= 0 && fibNum <= 40) {
                System.out.println("Fibonacci: " + fib(fibNum));
                break;
            } else {
                System.out.println("Invalid number! Please enter 0-40.");
            }
        }

        // CHALLENGE 3: Palindrome
        System.out.println("\nCHALLENGE 3: PALINDROME");

        System.out.print("Enter a word to check palindrome: ");
        String word = input.next();

        if (isPalindrome(word)) {
            System.out.println(word + " is a palindrome.");
        } else {
            System.out.println(word + " is not a palindrome.");
        }

        input.close();

        System.out.println("\nTHANKS FOR TESTING THIS CHAOSED CODE!! made with kodus. ");

    }
    // TASK 1: greeting in a void
    static void greetUser() {
        System.out.println("\n-- All coded by: Reyes, Cristina Marie B. ~");
        System.out.println("\nHello, welcome to the Math Program!");
        System.out.println();
    }

    // TASK 2: Arithmetic methods

    static int add(int a, int b) {
        return a + b;
    }

    static int subtract(int a, int b) {
        return a - b;
    }

    static int multiply(int a, int b) {
        return a * b;
    }

    static double divide(double a, double b) {
        if (b == 0) {
            System.out.println("Cannot divide by zero!");
            return 0;
        }

        return a / b;
    }

    // TASK 3: Factorial using a loop
    static int factorial(int n) {
        int result = 1;

        for (int i = 1; i <= n; i++) {
            result = result * i;
        }

        return result;
    }

    // TASK 4: Sum of array elements
    static int sumArray(int[] moew) {
        int sum = 0;

        for (int i = 0; i < moew.length; i++) {
            sum = sum + moew[i];
        }

        return sum;
    }

    // TASK 5: Check if a number is prime
    static boolean isPrime(int n) {

        if (n <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }

    // TASK 6: Find the largest number in an array
    static int maxInArray(int[] moew) {
        int max = moew[0];

        for (int i = 1; i < moew.length; i++) {
            if (moew[i] > max) {
                max = moew[i];
            }
        }

        return max;
    }

    // TASK 7: Find GCD
    static int gcd(int a, int b) {

        while (b != 0) {
            int t = b;
            b = a % b;
            a = t;
        }

        return a;
    }

    // TASK 7: Find LCM
    static int lcm(int a, int b) {
        return (a / gcd(a, b)) * b;
    }

    // CHALLENGE 1: Recursive factorial
    static int recursiveFactorial(int n) {

        if (n == 0 || n == 1) {
            return 1;
        }

        return n * recursiveFactorial(n - 1);
    }

    // CHALLENGE 2: Recursive Fibonacci
    static int fib(int n) {

        if (n == 0) {
            return 0;
        }

        if (n == 1) {
            return 1;
        }

        return fib(n - 1) + fib(n - 2);
    }

    // CHALLENGE 3: Check if a word is a palindrome
    static boolean isPalindrome(String word) {

        word = word.toLowerCase();

        int left = 0;
        int right = word.length() - 1;

        while (left < right) {

            if (word.charAt(left) != word.charAt(right)) {
                return false;
            }

            left++;
            right--;
        }

        return true;
    }





}


