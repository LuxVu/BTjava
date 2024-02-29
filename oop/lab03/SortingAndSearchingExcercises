import java.util.Scanner;

public class Main {


    // linearSearch here
    public static boolean linearSearch(int[] array, int key){
        for (int i = 0; i < array.length; i++)
            if (array[i] == key)
                return true;

        return false;
    }
    // linearSearchIndex here
    public static int linearSearchIndex(int[] array, int key){
        for (int i = 0; i < array.length; i++)
            if (array[i] == key)
                return i;

        return 0;
    }
    // testLinearSearchAndLinearSearchIndex here
    public static void testLinearSearchAndLinearSearchIndex(Scanner input){
        System.out.print("Enter the number of items and the key respectively: ");
        int numItems = input.nextInt();
        int key = input.nextInt();

        int[] arr = new int[numItems];
        for (int i = 0; i < numItems; i++)
            arr[i] = input.nextInt();

        System.out.println(linearSearch(arr, key) + " "
                + linearSearchIndex(arr, key));
    }


    // binarySearchRecursive here
    public static boolean binarySearch(int[] arr, int key, int  fromIndex, int toIndex) {
        int middleIndex;
        if (fromIndex == toIndex - 1) // terminating one-element list
        {
            if (key == arr[fromIndex])
                return true;
            else
                return false;
        }
        else {
            middleIndex = (fromIndex + toIndex) / 2;

            if (key == arr[middleIndex])
                return true;
            else if (key < arr[middleIndex])
                toIndex = middleIndex;
            else
                fromIndex = middleIndex + 1;   // end of if-else nested

            return binarySearch(arr, key, fromIndex, toIndex);   // recursive call
        }
    }
    // testBinarySearch here
    public static void testBinarySearch(Scanner input){
         System.out.print("Enter the number of items and the key which you want to search: ");
         int numItems = input.nextInt();
         int key = input.nextInt();

         System.out.print("Enter the elements of array (sorted version): ");
         int arr[] = new int[numItems];
         for (int i = 0; i < arr.length; i++)
             arr[i] = input.nextInt();

         System.out.print("Enter the fromIndex and toIndex: ");
         int fromIndex = input.nextInt();
         int toIndex = input.nextInt();

         System.out.println(binarySearch(arr, key, fromIndex, toIndex));
    }


    // bubbleSort here
    public static void bubbleSort(int arr[]){
        int n = arr.length;

        while (n > 1){
            for (int i = 0; i < n - 1; i++)
                if (arr[i+1] < arr[i])
                {
                    int mid = arr[i+1];
                    arr[i+1] = arr[i];
                    arr[i] = mid;
                }
            n--;    // 1 item would be sorted after each round
        }

        System.out.print("The values of sorted arr are: ");
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
    // testBubbleSort here
    public static void testBubbleSort(Scanner input){
        System.out.print("Enter the number of items: ");
        int num = input.nextInt();

        System.out.print("Enter the values of arr: ");
        int arr[] = new int[num];
        for (int i = 0; i < num; i++)
            arr[i] = input.nextInt();

        bubbleSort(arr);
    }


    // insertionSort here
    public static void insertionSort(int[] array){
         for (int i = 1; i < array.length; i++)
         {
             int key = array[i];
             int j = i -1;
             while (j >= 0 && array[j] > key){
                 array[j +1] = array[j];
                 j--;
             }
             array[j+1] = key;
         }

         System.out.print("The array after sorting by insertionSort is: ");
        for (int i = 0; i < array.length; i++)
             System.out.print(array[i] + " ");
    }
    // testInsertionSort here
    public static void testInsertionSort(Scanner input){
          System.out.print("Enter the number of items: ");
          int num = input.nextInt();

          int arr[] = new int[num];
          for (int i = 0; i < num; i++)
              arr[i] = input.nextInt();

          insertionSort(arr);
    }



    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        testLinearSearchAndLinearSearchIndex(reader);   // method 01
          testBinarySearch(reader);   // method 02
          testBubbleSort(reader);   // method 03
          testInsertionSort(reader);   // method 04
    }
}
