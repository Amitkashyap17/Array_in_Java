//Take an Array Integers inputs from users and print them.

import java.util.Scanner;

public class ArrayExamples {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Numbers of inputs : ");
        int size = sc.nextInt();
        int number[] = new int[size];

        for (int i=0; i<size; i++){
            number[i] = sc.nextInt();
        }
        System.out.print("Entered numbers are : ");
        for(int i=0; i<number.length; i++){
            System.out.print(number[i]+" ");
        }
    }
}

