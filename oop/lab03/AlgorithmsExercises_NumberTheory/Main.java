import java.util.Scanner;

public class Main {


    // isPerfect here
    public static boolean isPerfect(int aPosInt){
        int sum = 1;
        if (aPosInt == 1) return false;

        for (int i = 2; i <= (int) Math.sqrt(aPosInt); i++)
        {
            if (aPosInt % i ==0)
                sum += i + aPosInt/i;
            if ((double) i == (double) aPosInt/i)
                sum -= i;
        }
        if (sum == aPosInt) return true;
        else
            return false;
    }
    // isDeficient here
    public static boolean isDeficient(int aPosInt){
        int sum = 1;
        if (aPosInt == 1) return false;

        for (int i = 2; i <= (int) Math.sqrt(aPosInt); i++)
        {
            if (aPosInt % i ==0)
                sum += i + aPosInt/i;
            if ((double) i == (double) aPosInt/i)
                sum -= i;
        }
        if (sum < aPosInt) return true;
        else
            return false;
    }
    // PerfectNumberList
    public static void PerfectNumberList(Scanner input){
        System.out.print("Enter the upper bound: ");
        int posInt = input.nextInt();
        int countPerfect = 0;
        int countDeficient = 0;

        // handle the part of perfect number
        System.out.println("These numbers are perfect:");
        for (int i = 2; i < posInt; i++)
            if (isPerfect(i)) {
                System.out.print(i + " ");
                countPerfect ++;
            }
                 // print perfectNum
        String perfectPercentage = String.format("%.2f" , (double) countPerfect/posInt*100);
        System.out.println();
        System.out.println("[" + countPerfect
                + " perfect numbers found (" + perfectPercentage + "%)]");

        // handle the other apart
        System.out.println("These numbers are neither deficient nor perfect:");
        for (int i = 2; i < posInt; i++)
            if (!(isPerfect(i) || isDeficient(i)))
            {
                System.out.print(i + " ");
                countDeficient++;
            }
                 // print the rest
        String deficientPercentage = String.format("%.2f" , (double) countDeficient/posInt*100);
        System.out.println();
        System.out.println("[" + countDeficient +
                " numbers found (" + deficientPercentage + "%)]");
    }


    // isPrime here
    public static boolean isPrime(int aPosInt){
          if (aPosInt < 2) return false;
          else
              for (int i = 2; i <= (int) Math.sqrt(aPosInt); i++)
                  if  (aPosInt % i == 0)
                      return false;

          return true;
    }
    // PrimeList here
    public static void PrimeList(Scanner input){
        System.out.print("Please enter the upper bound: ");
        int posInt = input.nextInt();
        int countPrime = 0;

        for (int i = 0; i < posInt; i++)
            if (isPrime(i))
            {
                System.out.println(i);
                countPrime++;
            }
        String percentPrime = String.format("%.2f" , (double) countPrime/posInt*100);
        System.out.println("[" + countPrime + " primes found ( " +
                percentPrime + "%)]");
    }


    // isProductOfPrimeFactors here
    public static boolean isProductOfPrimeFactors(int aPosInt){
        int sum = 1;
        for (int j = 2; j <= aPosInt/2 ; j++)
                if ((aPosInt % j ==0) && (isPrime(j)))
                   sum *= j;

        if (sum == aPosInt) return true;
        else
            return false;
    }
    // PerfectPrimeFactorList here
    public static void PerfectPrimeFactorList(Scanner input){
        System.out.print("Enter the upper bound: ");
        int posInt = input.nextInt();
        int countResult = 0;

        System.out.println("These numbers are equal to the product of prime factors: ");

        for (int potentialResult = 2; potentialResult < posInt; potentialResult++)
            if (isProductOfPrimeFactors(potentialResult))
            {
                System.out.print(potentialResult + " ");
                countResult ++;
            }

        String percentageResult = String.format("%.2f" , (double) countResult/posInt*100);
        System.out.println();
        System.out.println("[" + countResult + "] number found (" +
                percentageResult + ")%]");
    }


    // gcd here
    public static int gcd(int a, int b){
        while (b != 0){
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
    // testGCD here
    public static void testGCD(Scanner input){
        System.out.print("Enter the value of a and b respectively: ");
        boolean validity = false;
        int a = 0, b = 0;

        while (!validity)
        {
            a = input.nextInt();
            b = input.nextInt();

            if (a < 0 || b < 0)
                System.out.println("a and b need to be positive numbers");
            else
                validity = true;
        }

        System.out.println("GCD(" + a + ", " + b + ") = " + gcd(a, b));
    }



    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
         PerfectNumberList(reader);    // method 01
        PrimeList(reader);   // method 02
          PerfectPrimeFactorList(reader);    // method 03
          testGCD(reader);    // method 04
    }
}
