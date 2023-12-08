
import java.util.Scanner;

class shop_details
{
String Sname = "ABC & Co";
String SAddress = "Shop no : 514,New building,PU";
String phone = "7894585857";
void show1(){
System.out.println("****************Invoice Bill***********");
System.out.println("Shop name :" + Sname);
System.out.println("Address : " +SAddress);
System.out.println("Contact: " +phone);
}
}
class Customer extends shop_details {
String Cname,Email,phone;
void details(){
Scanner input= new Scanner(System.in);
System.out.print("Enter the name of the customer :");
Cname = input.next();
System.out.print("Enter the E-mail of the Customer :");
Email = input.next();
System.out.print("Enter the mobile number: :");
phone = input.next();
}
void disply(){
System.out.println("Name of the Customer : "+Cname);
System.out.println("Email :" +Email);
System.out.println("Mobile number : " +phone);
}
}
class product extends Customer {
String Pname ;
int PQty;
double price;
void getinput(){
Scanner get = new Scanner(System.in);
System.out.println("Enter the Product name");
Pname = get.next();
System.out.println("Enter the Product quantity");
PQty = get.nextInt();
System.out.println("Enter the Product price");
price= get.nextDouble();
}
void disply1(){
System.out.println("Product name : "+Pname);
System.out.println("Quantity" +PQty);
System.out.println("Price :"+price);
System.out.println("Total Amount "+PQty*price);
}
}
class encapsul_b {
public static void main(String[] args)
{
product P = new product();
P.details();
P.getinput();
P.show1();
P.disply();
P.disply1();
System.out.println("****************Thank you***************");
}
}