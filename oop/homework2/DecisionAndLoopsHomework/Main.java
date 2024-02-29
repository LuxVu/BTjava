import java.util.Scanner;
import java.io.File;

public class Main {

    // guessNumber part1 here. It's to generate a key number by random and call to ver2
    public static void guessNumber(){
          int keyNumber = (int) (Math.random()*100);
          Scanner reader = new Scanner(System.in);

          guessNumber(keyNumber, reader);
    }
    // guessNumber part2 here. It's to implement the guessness
    public static void guessNumber(int number, Scanner input) {
        System.out.println("Key on your guess: ");
        int inputGuess = -1;
        int trials = 1;

        while (inputGuess != number) {
            inputGuess = input.nextInt();

            // check the correctness of the inputGuess
            if (inputGuess < number) {
                System.out.println("Try higher");
                trials++;
            } else if (inputGuess > number) {
                System.out.println("Try lower");
                trials++;
            } else
                      System.out.println("You got it in " + trials + " trials!");
        }
    }


    // guessWord part1 here
    public static void guessWord(){
        Scanner reader = new Scanner(System.in);

        System.out.println("Enter a key word: ");
        String keyWord = reader.nextLine();

        guessWord(keyWord, reader);
    }
    // isFullyTrue - sub method for guessWord
    public static boolean isFullyTrue(boolean arr[]){
        for (int  i = 0; i < arr.length; i++)
            if (arr[i] == false)
                return false;

        return true;
    }
    // guessWord part2 here
    public static void guessWord(String guessedString, Scanner input){
        int trials = 1;
        boolean processArrBool[] = new boolean[guessedString.length()];

        char[] charProcess = new char[guessedString.length()];   // same as stringProcess function but
                                                                 // in form of sequence of char to easily handle

        for (int i = 0; i < guessedString.length(); i++)
            charProcess[i] = '_';

        boolean checkKey = false;
        while ((checkKey == false) && (isFullyTrue(processArrBool) == false))
        {
            System.out.println("Key in one character or your guess word: ");
            String strInput = input.nextLine();

            if (strInput.length() == 1)
            {
                for (int i = 0; i < guessedString.length(); i++)
                    if (guessedString.indexOf(strInput, i) == i)
                    {
                        int properIndex = guessedString.indexOf(strInput, i);
                        charProcess[i] = guessedString.charAt(properIndex);
                        processArrBool[properIndex] = true;
                    }

                // update the process after enter your guess
                String stringProcess = new String(charProcess);
                System.out.println("Trial " + trials + ": " + stringProcess);
                trials ++;
            }
            else
               if (strInput.equals(guessedString))
                   checkKey = true;

            }
        System.out.printf("Congratulation !\n"
                + "You got it in " + trials + " trials");
        }



    public static void main(String[] args) {
             guessNumber();   // method 01
             guessWord();;     // method 02
    }
}
