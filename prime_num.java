import java.util.Scanner;

public class prime_num {
    public static void main(String[]args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your number :");
        int n = scan.nextInt();
        {
            for (int i=2; i<=n; i++){
                int count = 0;
                for(int j=2; j<i;j++) {
                    if(i%j==0){
                        count++;
                    }}
                    if(count==0){
                        System.out.println((i));
                    }
                    }
                }
            }    
        

    }

