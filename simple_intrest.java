import java.util.Scanner;

public class simple_intrest {
public static void main(String[] args) {
    float p,r,t,simple_intrest;
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your princeple amount:");
        p = scan.nextFloat();
        
        System.out.println("Enter your Rate:");
        r = scan.nextFloat();
        
        System.out.println("Enter your number of years");
        t = scan.nextFloat();
        
        simple_intrest = p*r*t/100;
        System.out.println("YOUR INTREST AMOUNT: " + simple_intrest);

        
    } 
    
}
