//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

import java.security.cert.CertPathBuilderResult;
import java.util.Scanner;

public class Main {

    // createArray here
    public static int[] createArray(Scanner in){
        System.out.print("Enter the number of items: ");
        int numItems = Integer.valueOf(in.nextLine());

        System.out.print("Enter the value of all items (separate by space): ");
        int arr[] = new int[numItems];

        for (int i = 0; i < numItems; i++)
            arr[i] = Integer.valueOf(in.next());

        return arr;
    }
    // printArray here
    public static void printArray(int arr[]){
        System.out.print("The values are: [");
         for (int i = 0; i < arr.length; i++) {
             if (i == arr.length - 1)
                 System.out.println(arr[i] + "]");
             else
                 System.out.print(arr[i] + ", ");
         }
    }


    // generateStudentGrades here
    public static int[] generateStudentGrades(Scanner in){
        in.nextLine(); // why there's have this line?
         // Because when we run all methods in this src, we will press "enter" to input the next data
         // particularly/specifically, after runtime "printArray(createArray(reader))",
        // we press "enter" to continue to import input of this method kit "simpleGradesStatistics"
        // If there's no have this line, system will receive " " - space as input
        // which means that "int numStu" above equals to " " - space

        System.out.print("Enter the number of students: ");
         int numStu = Integer.valueOf(in.nextLine());

         int arr[] = new int[numStu];
         for (int i = 0; i < numStu; i++){
             System.out.print("Enter the grade of student " + (i + 1) + ": ");
             arr[i] = Integer.valueOf(in.nextLine());
         }

         return arr;
    }
    // simpleGradesStatistics here
    public static void simpleGradesStatistics(int arr[]){
         System.out.print("The average is: ");

         // handle the average of arr
         double avg = 0.00d;
        for (int i = 0; i < arr.length; i++)
             avg += (double) arr[i];
        System.out.printf("%.2f\n", avg / arr.length);

        // find max and min value of arr
        int max = arr[0];
          int min = arr[0];
        for (int i = 1; i < arr.length; i++)
        {
            if (arr[i] > max) max = arr[i];
            if (arr[i] < min) min = arr[i];
        }

        System.out.println("The minimum is: " + min);
        System.out.println("The maximum is: " + max);
    }


    // hexadecimalToBinary here
    public static String hexadecimalToBinary(String hexStr){
        int arrHex[] = new int[hexStr.length()];

        for (int i = 0; i < hexStr.length(); i++)
            if (Character.isDigit(hexStr.charAt(i)))
                arrHex[i] = Integer.valueOf(String.valueOf(hexStr.charAt(i)));
            else
            {
                int tempoDigit = (int)  hexStr.charAt(i) - 87;
                arrHex[i] = tempoDigit;
            }
        
            String hexBitArray[] = {"0000" , "0001" , "0010" , "0011",
         "0100" , "0101" , "0110" , "0111" ,
         "1000" , "1001" , "1010" , "1011" ,
         "1100" , "1101" , "1110" , "1111"} ;

        String result = "";
        for (int j = 0; j < hexStr.length(); j++)
            result += hexBitArray[j] + " ";

        return result;

    }
    // testHexadecimalToBinary here
    public static void testHexadecimalToBinary(Scanner input){
        System.out.print("Enter a Hexadecimal string: ");
        String str = input.nextLine();

        System.out.println("The equivalent binary for hexadecimal \""
                   + str + "\" is: " + hexadecimalToBinary(str));
    }


    // decimalToHexadecimal here
    public static String decimalToHexadecimal(int positiveInt){
        String hexaBitArr[] = new String[17];
        // initialize an array of hexaBit which includes 10 digits and ABCDEF
               // connected respectively to elements i
        for (int i = 0; i < 17; i++)
           if (i >= 10)
               hexaBitArr[i] = String.valueOf((char)(i + 55));
           else
               hexaBitArr[i] = String.valueOf(i);

        String result = "" ;
        int remainder = 0;

        while (positiveInt > 15){
            remainder = positiveInt % 16;
            result = hexaBitArr[remainder] + result;
            positiveInt = positiveInt / 16;
        }

        return hexaBitArr[positiveInt] + result;
    }
    // testDecimalToHexadecimal here
    public static void testDecimalToHexadecimal(Scanner input){
        System.out.print("Enter a decimal number: ");
        int inputInt = Integer.valueOf(input.nextLine());

        System.out.print("The equivalent hexadecimal number is "
                + decimalToHexadecimal(inputInt));
    }


    public static void main(String[] args) {
            Scanner reader = new Scanner (System.in);
             printArray(createArray(reader));   // method 01
             simpleGradesStatistics(generateStudentGrades(reader));    // method 02
             testHexadecimalToBinary(reader);     // method 03
             testDecimalToHexadecimal(reader);   // method 04
        }
    }
