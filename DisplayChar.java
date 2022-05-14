import java.util.Scanner;

public class DisplayChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numArray[]= new int[4];
        System.out.println("Enter the digits:");
        for (int i=0; i<4; i++){
            numArray[i]= sc.nextInt();
        }

        for (int x : numArray){
            System.out.println(x+"-"+(char)x);
        }
    }
}
