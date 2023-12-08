import java.util.Scanner;
import java.util.Random;
class Random_num{
public static void main(String args[]){
Random R = new Random();
int value = R.nextInt(1+100);
Scanner S=new Scanner(System.in);
int i=0;
int count=1;
while(i==0){
int Unum=S.nextInt();
if(Unum==value)
{
System.out.println("Success!!!");
break;
}
else if(Unum>value)
{
System.out.println("Too high");
count++;
}
else if(Unum<value)
{
System.out.println("Too Low");
count++;
}
else
{
System.out.println("Try again");
count++;
}
}
System.out.println("No of attempts: "+count);
System.out.println("The value is : "+value);
}
}