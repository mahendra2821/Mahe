import java.util.Scanner;

public class evenODD { 
    public static void main(String[]args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your N value:");
        int N = scan.nextInt();
        if (N%2==0)
        {
            System.out.println("even");
        
        }
        else {
            System.out.println("Odd");
        }

        }
    }
