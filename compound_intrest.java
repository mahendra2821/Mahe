import java.util.Scanner;

public class compound_intrest {
public static void main(String[] args) {
    double p,r,t,compound_intrest;
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your princeple amount:");
        p = scan.nextDouble();
        
        System.out.println("Enter your Rate:");
        r = scan.nextDouble();
        
        System.out.println("Enter your number of years");
        t = scan.nextDouble();
        
        compound_intrest = p *(Math.pow((1 + r / 100), t));
        System.out.println("YOUR COMPOUND INTREST AMOUNT: " + compound_intrest);

        
    }
    
}
