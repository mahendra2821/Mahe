import java.util.Scanner;
interface shop_details
{
String Sname = "ABC & Co";
String SAddress = "Shop no : 514,New building,PU";
String phone = "7894585857";
void show1();
}
interface Customer {
String Cname ="Saran",Email="123@gmail",phonenum="48545151";
void disply();
}
class product implements shop_details, Customer {
String Pname ;
int PQty; //Implementing Multiple Inheritance.
double price;
public void show1(){
System.out.println("****************Invoice Bill***********");
System.out.println("Shop name :" + Sname);
System.out.println("Address : " +SAddress);
System.out.println("Contact: " +phone);
}
public void disply(){
System.out.println("Name of the Customer : "+Cname);
System.out.println("Email :" +Email);
System.out.println("Mobile number : " +phonenum);
}
void getinput(){
Scanner get=new Scanner(System.in);
System.out.println("Enter the Product name");
Pname = get.next();
System.out.println("Enter the Product quantity");
PQty = get.nextInt();
System.out.println("Enter the Product price");
price= get.nextDouble();
}
void Pdisply(){
System.out.println("Product name : "+Pname);
System.out.println("Quantity" +PQty);
System.out.println("Price :"+price);
System.out.println("Total Amount "+PQty*price);
}
}
class Interfacenew{
public static void main(String[] args)
{
product P=new product();
P.getinput();
P.show1();
P.disply();
P.Pdisply();
System.out.println("****************Thank you***************");
}
}
