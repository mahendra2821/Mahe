import java.util.Scanner;

public class left_ang_tri {
 public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter you number :");
        int n = scan.nextInt();
        for (int i=0; i<n; i++)
        {
            for (int j =2*(n-i); j>=0; j--)
            {
                System.out.print(" ");
            }

        {
            for (int j=0; j<=i; j++)
            
            {
                
                System.out.print(" *");
            }
            System.out.println();

        }

    }
}
    
}
