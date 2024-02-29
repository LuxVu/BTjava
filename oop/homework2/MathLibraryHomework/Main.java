
import java.util.Scanner;

public class Main {

    // compute sin here
    public static double sin(double x, int numTerms){
          double result = 0.00d;
          int countTerms;

          for (countTerms = 1; countTerms <= numTerms; countTerms++)
          {
              double termsAtI = 1;
              for (int i = 1; i <= countTerms * 2 - 1; i++)
                  termsAtI *= (double) (x/i);

              if (countTerms % 2 ==1)
                  result += termsAtI;
                else
                    result -= termsAtI;

          }

          return result;
    }
    // compute cos here
    public static double cos(double x, int numTerms){
        double result = 1;
        int countTerms;
        double termsAtI;

        for (countTerms = 1; countTerms <= numTerms; countTerms++)
        {
            if (countTerms == 1) termsAtI = 0;
                  else termsAtI = 1;

             for (int i = 1; i <= countTerms * 2 - 2; i++)
                termsAtI *= (double) x/i;

            if (countTerms % 2 ==1)
                result += termsAtI;
            else
                result -= termsAtI;

        }

        return result;
    }
    // testTrigonometric here
    public static void testTrigonometric(Scanner input){
        System.out.print("Enter the value of x: ");
        double x = input.nextDouble();

        System.out.print("Enter the number of terms: ");
        int numTerms = input.nextInt();

        System.out.println("The value of sin(" + x + ") is: " + sin(x, numTerms));
        System.out.println("The value of cos(" + x + ") is: " + cos(x, numTerms));
    }



    public static void main(String[] args) {
           Scanner reader = new Scanner(System.in);
           testTrigonometric(reader);    // method 01
    }
}
