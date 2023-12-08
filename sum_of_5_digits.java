import java.util.Scanner;

public class sum_of_5_digits{
    
    public static void main(String[]args)
    {
        int sum_num = 1;
        Scanner scan = new Scanner(System.in);
        System.out.println("Entetr your number : ");
        int n = scan.nextInt();
        {
            for (int i=1; i<=n; i++)
            sum_num = sum_num+i;
            {
                System.out.println("Sum of: "+ n  + sum_num);
            }
        }}
    


}
