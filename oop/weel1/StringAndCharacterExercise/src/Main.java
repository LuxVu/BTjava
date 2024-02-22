//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.


import java.util.Scanner;

public class Main {

    //reverseString here
    public static String reverseString(String inStr) {
        String result = "";
        for (int i = 0; i < inStr.length(); i++)
            result = inStr.charAt(i) + result;

        return result;
    }
    // testReverseString here
    public static void testReverseString(Scanner input) {
        System.out.print("Enter a String: ");
        String str = input.nextLine();

        System.out.println("The reverse of the String " + str
                + " is " + reverseString(str));
    }


    // countVowels here
    public static int countVowels(String inStr) {
        int result = 0;
        inStr = inStr.toLowerCase();

        for (int i = 0; i < inStr.length(); i++)
            switch (inStr.charAt(i)) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    result++;
                    break;
            }

        return result;
    }
    //countDigits here
    public static int countDigits(String inStr) {
        int result = 0;
        for (int i = 0; i < inStr.length(); i++)
            if (inStr.charAt(i) > '0'
                    && inStr.charAt(i) < '9')
                result++;

        return result;
    }
    // testCountVowelsDigits here
    public static void testCountVowelsDigits(Scanner input) {
        System.out.print("Enter a String: ");
        String str = input.nextLine();

        int numOfVowels = countVowels(str);
        int numOfDigits = countDigits(str);

        double vowelPercentage = ((double) numOfVowels) / ((double) str.length());
        double digitPercentage = ((double) numOfDigits) / ((double) str.length());
        // print num of vowels
        System.out.print("Number of Vowels: " + numOfVowels + " (");
        System.out.printf("%.2f%%", vowelPercentage * 100);
        System.out.println(")");

        //print num of digits
        System.out.print("Number of Digits: " + numOfDigits + " (");
        System.out.printf("%.2f%%", digitPercentage * 100);
        System.out.println(")");
    }


    // phoneKey-Pad here
     public static String phoneKeyPad (String inStr){
        String result = "";
        for (int i = 0; i < inStr.length(); i++)
            switch (inStr.charAt(i)){
                case 'a':
                case 'b':
                case 'c':
                    result += "2";
                    break;
                case 'd':
                case 'e':
                case 'f':
                    result += "3";
                    break;
                case 'g':
                case 'h':
                case 'i':
                    result += "4";
                    break;
                case 'j':
                case 'k':
                case 'l':
                    result += "5";
                    break;
                case 'm':
                case 'n':
                case 'o':
                    result += "6";
                    break;
                case 'p':
                case 'q':
                case 'r':
                case 's':
                    result += "7";
                    break;
                case 't':
                case 'u':
                case 'v':
                    result += "8";
                    break;
                case 'w':
                case 'x':
                case 'y':
                case 'z':
                    result += "9";
                    break;

            }
        return result;
     }
     // testPhoneKeyPad here
    public static void testPhoneKeyPad(Scanner input){
         System.out.print("Enter a String: " );
         String str = input.nextLine().toLowerCase();

         System.out.println("Convert to a sequence of keypad digits: " + phoneKeyPad(str));
    }


    // cipherCaesarCode here
    public static String cipherCaesarCode(String inStr){
         String result = "";
         for (int i = 0; i < inStr.length(); i++)
             switch (inStr.charAt(i)){
                 case 'X':
                     result += String.valueOf('A');
                     break;
                 case 'Y':
                     result += String.valueOf('B');
                     break;
                 case 'Z':
                     result += String.valueOf('C');
                     break;
                 default: result += String.valueOf( (char) (inStr.charAt(i) + 3) );
             }

         return result;
    }
    //testCipherCaeSarCode here
    public static void testCipherCaesarCode(Scanner input){
        System.out.print("Enter a plaintext string: ");
        String str = input.nextLine().toUpperCase();

        System.out.println("The ciphertext string is: " + cipherCaesarCode(str));
    }

    // isHexString here
    public static boolean isHexString(String inStr){
          for (int i = 0; i < inStr.length(); i++)
              if ( !( (inStr.charAt(i) >= '0' &&  inStr.charAt(i) <= '9')
                  ||
                 (inStr.charAt(i) >= 'a' && inStr.charAt(i) <= 'f') ) )
              return false;

          return true;
    }
    // testHexString here
    public static void testHexString(Scanner input){
        System.out.print("Enter a hex string: ");
        String str = input.nextLine().toLowerCase();

        if (isHexString(str))
            System.out.println(str + " is a hex string");
        else
            System.out.println(str + " is NOT a hex string");
    }


    // binaryToDecimal here
    public static int binaryToDecimal(String inStr){
        int result = 0;
        for (int i = 0; i < inStr.length(); i++)
             switch (inStr.charAt(i)) {
                 case '0':
                     result = result * 2;
                     break;
                 case '1':
                     result = result * 2 + 1;
                     break;
                 default: return -1;
             }

        return result;
    }
    // testBinaryToDecimal here
    public static void testBinaryToDecimal(Scanner input){
          System.out.print("Enter a Binary string: ");
          String str = input.nextLine();

          if (binaryToDecimal(str) == -1)
              System.out.println("Error: invalid binary string \"" + str + "\"");
          else
              System.out.println("The equivalent decimal number for binary \""
                      + str + "\" is: " + binaryToDecimal(str));
   }

    // hexadecimalToDecimal here
    public static int hexadecimalToDecimal (String hexStr){
           int arrChar[] = new int[hexStr.length()];

        // convert input to an arrCharacter and return if input is errored
           for (int i = 0; i < hexStr.length(); i++)
           {
              if (Character.isDigit(hexStr.charAt(i)))
              {
                  int tempoDigit = Integer.valueOf(String.valueOf(hexStr.charAt(i)));
                  arrChar[i] = tempoDigit;
              }
               else
                   if (hexStr.charAt(i) >= 'a' && hexStr.charAt(i) <= 'f')
                          arrChar[i] = (int) (hexStr.charAt(i)) - 87 ;
                  else
                       return -1;
          }

           int result = 0;
           for (int j = 0; j < hexStr.length(); j++)
               result += arrChar[j] * Math.pow(16, hexStr.length() - 1 - j);

           return result;
    }
    //  testHexadecimalToDecimal here
    public static void  testHexadecimalToDecimal(Scanner input){
        System.out.print("Enter a Hexadecimal String: ");
        String str = input.nextLine();

        if (hexadecimalToDecimal(str) == -1)
            System.out.println("Error: invalid hexadecimal string \"" + str + "\"");
        else
            System.out.println("The equivalent decimal number for hexadecimal \""
                    + str + "\" is: " + hexadecimalToDecimal(str));
    }


    // octalToDecimal here
    public static int octalToDecimal(String ocStr){
          int result = 0;

          for (int i = 0; i < ocStr.length(); i++)
          {
              int tempo = Integer.valueOf(String.valueOf(ocStr.charAt(i)));
              result += tempo * Math.pow(8, ocStr.length() - i - 1);
          }

          return result;
    }
    // testOctalToDecimal here
    public static void testOctalToDecimal(Scanner input){
        System.out.print("Enter an Octal string: ");
        String str = input.nextLine();

        System.out.println("The equivalent decimal number \""
                      + str + "\" is: " + octalToDecimal(str));
    }


    // RadixNToDecimal here
    public static int radixNToDecimal(String radStr, int radix){
        int arrChar[] = new int [radStr.length()];

        for (int i = 0; i < radStr.length(); i++)
        {
            if (Character.isDigit(radStr.charAt(i)))
            {
                int tempoDigit = Integer.valueOf(String.valueOf(radStr.charAt(i)));
                arrChar[i] = tempoDigit;
            }
            else
                arrChar[i] = (int) (radStr.charAt(i)) - 87 ;

        }

        int result = 0;
        for (int j = 0; j < radStr.length(); j++)
            result += arrChar[j] * Math.pow(radix, radStr.length() - 1 - j);

        return result;
    }

    // testRadixNToDecimal here
    public static void testRadixNToDecimal(Scanner input){
         System.out.print("Enter the string: ");
         String str = input.nextLine();

         System.out.print("Enter the radix: ");
         int nRadix = Integer.valueOf(input.nextLine());

         System.out.println("The equivalent decimal number \""
                   + str + "\" is: " + radixNToDecimal(str, nRadix));

    }



    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        testReverseString(reader);    // method 01
          testCountVowelsDigits(reader);   // method 02
            testPhoneKeyPad(reader);      // method 03
        testCipherCaesarCode(reader);     // method 04
           testHexString(reader);     // method 05
              testBinaryToDecimal(reader);     // method 06
        testHexadecimalToDecimal(reader);     // method 07
           testOctalToDecimal(reader);         // method 08
              testRadixNToDecimal(reader);    // method 09

        reader.close();
    }
}