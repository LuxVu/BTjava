
import java.util.Scanner;

public class Main {


    // squarePattern here
    public static void squarePattern(int n){
        for (int row = 0; row < n; row++)
        {
            for (int column = 0; column < n; column++)
                System.out.print("# ");
            System.out.println();
        }
    }
    // testSquareTest here
    public static void testSquarePattern(Scanner input){
        System.out.print("Enter the size: ");
        int n = input.nextInt();
        squarePattern(n);
    }


    // checkerPattern here
    public static void checkerPattern (int n){
        for (int row = 0; row < n; row++)
        {
            if (row % 2 == 1)
                System.out.print(" ");
            for (int col = 0; col < n; col++)
                    System.out.print("# ");

            System.out.println();
        }
    }
    // testCheckerPattern here
    public static void testCheckerPattern(Scanner input){
        System.out.print("Enter the size: ");
        int n = input.nextInt();
        checkerPattern(n);
    }



    public static void main(String[] args) {
        Scanner reader = new Scanner (System.in);
         testSquarePattern(reader);     // method 01
          testCheckerPattern(reader);    // method 02

    }
}
