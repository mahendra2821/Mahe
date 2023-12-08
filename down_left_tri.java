import java.util.Scanner;

public class down_left_tri {
 public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter you number :");
        int n = scan.nextInt();
        for (int i=n-1; i>=0; i--)
        {
            for (int j=0; j<=i; j++)
            
            {
                System.out.print(" *");
            }
            System.out.println();

        }

    }
}