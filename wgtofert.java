import java.util.Scanner;

public class wgtofert {
      public static void main(String[]args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your earth value:");
        int n = scan.nextInt();
        double weight_on_mass =  0.38 * (n);
        System.out.println(weight_on_mass);
}
}