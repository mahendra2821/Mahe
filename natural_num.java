import java.util.Scanner;
public class natural_num {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter you number :");
        int n = scan.nextInt();
        for (int i=1;i<=n;i++)
        {
            System.out.println( " "+ i);
        }
    }
}