import java. util.Scanner;
import java.time.LocalDate;
public class age{
    public static void  main (String[]args)
    {
        LocalDate currenDate = LocalDate.now();
        //dd/mm/yyyy
        int currenyear = currenDate.getYear();
        //current year yyyy
        Scanner sc1 = new Scanner(System.in);
        System.out.println("enter DOB : ");
        int DOB = sc1.nextInt();
        int Age = currenyear-DOB;
        System.out.println(Age);
        
        
    
    }
}