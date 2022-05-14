/*Take an array as input from the user.
  Search for a given number x and print the index at witch it  occurs. */

import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array : ");
        int size = sc.nextInt();
        int number[] = new int[size];

        // for input
        for (int i=0; i<size; i++){
            System.out.print("Enter the array elements : ");
            number[i] = sc.nextInt();
        }
        System.out.print("Enter the array element to find their index : ");
        int x = sc.nextInt();

        for (int i=0; i<size; i++){
            if (number[i]==x){
                System.out.println("Element found at index : "+i);
            }
        }
    }
}
