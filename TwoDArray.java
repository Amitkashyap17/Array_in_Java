import java.util.Scanner;

public class TwoDArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows : ");
        int rows = sc.nextInt();
        System.out.print("Enter number of cols : ");
        int cols = sc.nextInt();

        int numbers[][] = new int[rows][cols];

        //input
        //rows
        System.out.println("Input elements of array ");
        for (int i=0; i<rows; i++){
            //colums
            for (int j=0; j<cols; j++){
              numbers[i][j]= sc.nextInt();
            }
        }
        System.out.print("Enter the number x which index find : ");
        int x = sc.nextInt();
        //output
        for (int i=0; i<rows; i++){
            for (int j=0; j<cols; j++){
                if (numbers[i][j]==x){
                    System.out.println("Index found at : "+i+","+j);
                }
            }
        }
    }
}
