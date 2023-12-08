import java.util.Scanner;

public class temperature {
     public static void main(String[]args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your celsius value:");
        int n = scan.nextInt();
        int fahernheit = ((n*9)/5)+32;
        System.out.println(fahernheit);
}
}