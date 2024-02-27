import java.util.Scanner;
import java.util.Arrays;      //used in method 8: copyOf

public class Main {

    // exponent here
    public static int exponent(int base, int exp){
        int result  = base;
        for (int i = 1; i < exp; i++)
             result *= base;

        return result;
    }
    // testExponent here
    public static void testExponent(Scanner input){
        System.out.print("Enter the base: ");
        int base = Integer.valueOf(input.nextLine());

        System.out.print("Enter the exponent: ");
        int exponent = Integer.valueOf(input.nextLine());

        System.out.println(base + " raises to the power of "
                     + exponent + " is: " + exponent(base, exponent));

    }


    // hasEight here
    public static boolean hasEight(int num){
         String str = String.valueOf(num);
         if (str.contains("8")) return true;
               else return false;
    }
    // testMagicNumber here
    public static int testMagicNumber(Scanner input){
          final int sentinel = -1;
          int num = 0;
          int result = 0;

          while (num != sentinel)
          {
              System.out.print("Enter a positive integer (or -1 to end): ");
              num = Integer.valueOf(input.nextLine());
              if (hasEight(num)) result += num;
          }

          return result;
    }


    // print here
    public static void print(int[] arr){
        System.out.print("The content of arr is: [");
        for (int i = 0; i < arr.length; i++)
            if (i < arr.length - 1)
                System.out.print(arr[i] + ", ");
        System.out.print(arr[arr.length - 1] + "]");

    }
    // testPrint here
    public static void testPrint(Scanner input){
        System.out.print("Enter the number of items: ");
        int numOfItems = Integer.valueOf(input.nextLine());
        if (numOfItems > 0){
             System.out.print("The items of array: ");
             int[] arr = new int[numOfItems];

             for (int i = 0; i < numOfItems; i++)
                 arr[i] = input.nextInt();

             print(arr);
        } else
            System.out.println("Array is empty");
    }


    // arrayToString here
    public static String arrayToString(int[] arr){
          String result = "[";
          for (int i = 0; i < arr.length; i++)
              if (i < arr.length - 1)
                  result += String.valueOf(arr[i]) + ",";
              else
                  result += String.valueOf(arr[i]) + "]";

          return result;
    }
    // testArrayToString here
    public static void testArrayToString(Scanner input){
        System.out.print("Enter the number of items: ");
        int numOfItems = Integer.valueOf(input.nextLine());
        if (numOfItems > 0){
            System.out.print("The items of array: ");
            int[] arr = new int[numOfItems];

            for (int i = 0; i < numOfItems; i++)
                arr[i] = input.nextInt();

            System.out.println(arrayToString(arr));
        } else
            System.out.println("Array is empty");
    }


    // contains here
    public static boolean contains(int[] arr, int key){
        for (int i = 0; i < arr.length; i++)
             if (arr[i] == key)
                 return true;
        return false;
    }
    // testContains here
    public static void testContains(Scanner input){
        System.out.print("Enter a number of items and a number of Key respectively: ");
        int numOfArr = input.nextInt();
        int key = input.nextInt();

          System.out.print("Enter the items of array: ");
          int arr[] = new int[numOfArr];

          for (int i = 0; i < numOfArr; i++)
              arr[i] = input.nextInt();

          if (contains(arr, key))
              System.out.println("The array contains the key");
          else
              System.out.println("The array does NOT contain the key");
    }


    // search here
    public static int search(int[] arr, int key){
         for (int i = 0; i < arr.length; i++)
             if (arr[i] == key)
                 return i;
         return -1;
    }
    // testSearch here
    public static void testSearch(Scanner input){
        System.out.print("Enter a number of items and a number of Key respectively: ");
        int numOfArr = input.nextInt();
        int key = input.nextInt();

        System.out.print("Enter the items of array: ");
        int arr[] = new int[numOfArr];

        for (int i = 0; i < numOfArr; i++)
            arr[i] = input.nextInt();

        if (search(arr, key) != -1)
            System.out.println("The index of item that equals the Key is: "
                    + search(arr, key));
        else
            System.out.println("The array does not contain the key");
    }


    // equals here
    public static boolean equals(int[] arr1, int[] arr2){
        if (arr1.length == arr2.length)
        {
            for (int i = 0; i < arr1.length; i++)
                if (arr1[i] != arr2[i])
                    return false;
            return true;
        }
        return false;
    }
    // testEquals here
    public static void testEquals(Scanner input){
         // Enter data of arr1
         System.out.print("Enter a number of arr1's items: ");

         int numOfArr1 = input.nextInt();
         int arr1[] = new int[numOfArr1];

         System.out.print("The items of arr1 (separated by space): ");
        for (int i = 0; i < numOfArr1; i++)
             arr1[i] = input.nextInt();

         // Enter data of arr2
        System.out.print("Enter a number of arr1's items: ");

        int numOfArr2 = input.nextInt();
        int arr2[] = new int[numOfArr2];

        System.out.print("The items of arr2 (separated by space): ");
        for (int i = 0; i < numOfArr2; i++)
            arr2[i] = input.nextInt();

        System.out.println(equals(arr1, arr2));
    }


    // copyOf here
    public static int[] copyOf(int arr[], int newLength){
          int result[] = new int [newLength];
          int indexOfResult = 0;

          String str = Arrays.toString(result);
          for (int i = 0; i < str.length(); i++)
              if (Character.isDigit(str.charAt(i)))
              {
                  result[indexOfResult] = str.charAt(i) - 48;
                  indexOfResult ++;
              }
          return result;
    }
    // testCopyOf here
    public static void testCopyOf(Scanner input){
        System.out.print("Enter a number of items: ");
        int num = input.nextInt();

        int arr[] = new int [num];
        System.out.print("Enter the elements of array (separated by space): ");
        for (int i = 0; i < num; i++)
            arr[i] = input.nextInt();

        System.out.print("Enter the number of elements what you want to copy from array: ");
        int newLength = input.nextInt();

        System.out.println("Copy " + newLength
                + "-first elements of the array: " + copyOf(arr, newLength));
    }



    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
         testExponent(reader);    // method 01/
        System.out.println("The magic sum is: " + testMagicNumber(reader));     // method 02
         testPrint(reader);    // method 03
          testArrayToString(reader);   // method 04
           testContains(reader);    // method 05
         testSearch(reader);    // method 06
         testEquals(reader);   // method 07
          testCopyOf(reader);    // method 08
    }
}