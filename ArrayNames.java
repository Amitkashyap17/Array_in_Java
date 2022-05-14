//Take an array of names as input from the user and print them on the screen.

import java.util.Scanner;

public class ArrayNames {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Take a number : ");
        int size = sc.nextInt();
        String names[] = new String[size];

        // for input
        for (int i=0; i<size; i++){
            System.out.print("Enter name here : ");
            names[i]= sc.next();
        }
        for (int i=0; i<size; i++){
            System.out.println(names[i]);
        }
    }
}
