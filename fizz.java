import java.util.Scanner;

public class fizz{
    public static void main(String[]args){
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the n value");
        int n = scan.nextInt();
        for(int i=1; i<=n; ++i)
        {
            if (i%3==0 && i%5==0)
            {
                System.out.println("fizz bozz");
            }
            else if (i%3==0) {
                System.out.println("fizz");
            }
            else if (i%5==0){
                System.out.println("buzz");
            }
            else{
                System.out.println(i);
            }
        }
    }
}