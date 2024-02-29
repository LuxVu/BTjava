import java.util.Scanner;

public class Main {


    // exchangeCipher here
    public static String exchangeCipher (String inStr){
           String result ="";
           for (int i = 0; i < inStr.length(); i++)
               result += String.valueOf((char) ('A' + 'Z' - inStr.charAt(i)));

           return result;
    }
    // testExchangeCipher here
    public static void testExchangeCipher(Scanner input){
        System.out.print("Enter a plaintext string: ");
        String str = input.nextLine().toUpperCase();

        System.out.println("The ciphertext string is: " + exchangeCipher(str));
    }


    // isPalindromicWord here
    public static boolean isPalindromicWord(String inStr){
        // standardize the string and standardized string is newStr
        inStr = inStr.trim().toLowerCase();
        String newStr = "";
        for (int i = 0; i < inStr.length(); i++)
            if (inStr.charAt(i) > 'a' && inStr.charAt(i) < 'z')
                newStr += String.valueOf(inStr.charAt(i));

        // check palindromic
        for (int i = 0; i < newStr.length(); i++)
            if (newStr.charAt(i) != newStr.charAt(newStr.length() - 1 - i))
                return false;

        return true;
    }
    // testPalindromicWord here
    public static void testPalindromicWord(Scanner input){
        System.out.print("Enter a string: ");
        String str = input.nextLine();

        if (isPalindromicWord(str))
            System.out.println("\"" + str + "\"" + " is a palindromic");
        else
            System.out.println("\"" + str + "\"" + " is NOT a palindromic");
    }



    public static void main(String[] args) {
         Scanner reader = new Scanner(System.in);
          testExchangeCipher(reader);     // method 01
           testPalindromicWord(reader);    // method 02
    }
}
