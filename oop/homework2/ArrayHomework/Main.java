import java.util.Scanner;

public class Main {



    // printArrayStars here
    public static void printArrayStars(Scanner input){
        System.out.print("Enter the number of items: ");
        int numOfItems = input.nextInt();

        System.out.print("Enter the value of all items (separated by space): ");
        int arr[] = new int [numOfItems];
        for (int i = 0; i < numOfItems; i++)
            arr[i] = input.nextInt();

        for (int i = 0; i < numOfItems; i++) {
            System.out.print(i + ": ");
            for (int j = 0; j < arr[i]; j++)
                System.out.print("*");
            System.out.println("(" + arr[i] + ")");
        }

    }
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        printArrayStars(reader);   // method 01

    }
}
