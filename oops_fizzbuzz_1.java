import java.util.Scanner;

public class oops_fizzbuzz_1 {
    public static void main(String[]args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the value");
        int n = scan.nextInt();

        for (int i=1; i<=n; ++i){
            if (i%3==0 && i%5==0){
                System.out.println("FizzBuzz");
            }
            else if (i%3==0){
                System.out.println("Buzz");
            }
            else if (i%5==0){
                System.out.println("Buzz");
            }
            else{
                System.out.println(i);
            }
            }
            }
        
}