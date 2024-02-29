
import java.util.Scanner;

public class Main {


    // factorial recursive here
    public static int factorial (int n){
        if (n == 0)
            return 1;
        else
            return factorial(n-1) * n;
    }
    // testFactorialRecursive here
    public static void testFactorialRecursion(Scanner input){
        System.out.print("Enter a number to compute the factorial of it: ");
        int number = input.nextInt();

        System.out.println("Factorial of " + number + " is " + factorial(number));
    }


    // fibonacci recursive here
    public static int fibonacci(int n){
        if (n == 0)
            return 0;
        if (n == 1)
                return 1;
            else
                return fibonacci(n-1) + fibonacci(n-2);
    }
    // testFibonacciRecursive here
    public static void testFibonacciRecursive(Scanner input){
        System.out.print("Enter a number to compute fibonacci number at that position: ");
        int number = input.nextInt();

        System.out.println("Fibonacci number at " + number + " position is: " + fibonacci(number));
    }


    // number sequence by recursive here
    public static String numberSequence(int n){
        if (n == 1)
            return "1";
        else
            return numberSequence(n-1) + String.valueOf(n);
    }
    // testNumberSequence here
    public static void testNumberSequence(Scanner input){
        System.out.print("Enter a number: ");
        int num = input.nextInt();

        System.out.println("Length is: " + numberSequence(num).length());
    }


     // gcd here
    public static int gcd(int a, int b){
        if (b == 0)
            return a;
        else
            return gcd(b, a % b);
    }
    // testGCD here
    public static void testGDC(Scanner input){
          System.out.print("Enter the value of a: ");
          int a = input.nextInt();

          System.out.print("Enter the value of b: ");
          int b = input.nextInt();

          System.out.println("gdc(" + a + ", " + b +  ") = " + gcd(a, b));
    }



     public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
         testFactorialRecursion(reader);    // method 01
          testFibonacciRecursive(reader);    // method 02
           testNumberSequence(reader);     // method 03
           testGDC(reader);    // method 04

         reader.close();
    }
}
