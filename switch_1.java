import java.util.Scanner;

public class switch_1 {
    
    public static void main(String[] args)
     {
         
        System.out.println("welcome to you our Hotel.... \n Select your item \n 1.DAL \n 2.RICCE \n 3.CURRY \n 4.MILK");
        Scanner scan = new Scanner(System.in);
        System.out.println("Choose your favorite food :");
        int items = scan.nextInt();

        Scanner scan1 = new Scanner(System.in);
        System.out.println("How much quantity do you want:");
        int number = scan1.nextInt();
                
        switch(items)
        { 
        case 1:
        System.out.println("Your item is DAL");
        System.out.println("Your food Quantity is : " + number*10);
        break;
        case 2:
        System.out.println("Your item is RICE");
        System.out.println("Your food Quantity is : " + number*20);
        break;
        case 3:
        System.out.println("Your item is CURRY");
        System.out.println("Your food Quantity is : " + number*30);
        break;
        case 4:
        System.out.println("Your item is MILK");
        System.out.println("Your food Quantity is : " + number*40);
        break;
        default:
        System.out.println("your order is wrong");
        }
    }
}
    
    

 
 

