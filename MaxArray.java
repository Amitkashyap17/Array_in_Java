//Find the maximum & minimum number in an array of integers.
import java.util.Scanner;

public class MaxArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array : ");
        int size = sc.nextInt();
        int numbers[] = new int[size];

        System.out.println("Enter the elements");
        for (int i=0; i<size; i++){
            numbers[i]=sc.nextInt();
        }
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int i=0; i<numbers.length; i++){
            if (numbers[i]<min){
                min = numbers[i];
            }
            if (numbers[i]>max){
                max = numbers[i];
            }
        }
        System.out.println("Smallest number is : "+min);
        System.out.println("Largest number is : "+max);
    }
}
