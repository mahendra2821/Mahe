import java.util.Scanner;

public class factorial {
    public static void main(String[]args)
    {
        int fact = 1;
        Scanner scan = new Scanner(System.in);
        System.out.println("Entetr your factorial number : ");
        int n = scan.nextInt();
        {
            for (int i=1; i<=n; i++)
            fact = fact*i;
            {
                System.out.println(fact);
            }
        }
    



    }
    
}
