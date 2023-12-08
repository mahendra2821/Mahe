package nvoice;
public class Shop
{
String Sname = "ABC & Co";
String SAddress = "Shop no : 514,New building,PU";
String phone = "7894585857";
public void show(){
System.out.println("****************Invoice Bill***********");
System.out.println("Shop name :" + Sname);
System.out.println("Address : " +SAddress);
System.out.println("Contact: " +phone);
}
}
File name: Customer.java
package Invoice;
import java.util.Scanner;
public class Customer{
String Cname,Email,phone;
public void details(){
Scanner input=new Scanner(System.in);
System.out.print("Enter the name of the customer :");
Cname = input.next();
System.out.print("Enter the E-mail of the Customer :");
Email = input.next();
System.out.print("Enter the mobile number: :");
phone = input.next();
}
public void disply(){
System.out.println("Name of the Customer : "+Cname);
System.out.println("Email :" +Email);
System.out.println("Mobile number : " +phone);
}
}
File name: Product.java
package Invoice;
import java.util.Scanner;
public class Product
{
String Pname ;
int PQty;
double price;
public void getinput(){
Scanner get=new Scanner(System.in);
System.out.println("Enter the Product name");
Pname = get.next();
System.out.println("Enter the Product quantity");
PQty = get.nextInt();
System.out.println("Enter the Product price");
price= get.nextDouble();
}
public void disply(){
System.out.println("Product name : "+Pname);
System.out.println("Quantity" +PQty);
System.out.println("Price :"+price);
System.out.println("Total Amount "+PQty*price);
}
}
Filename: Groceries.java
import Invoice.Shop;
import Invoice.Customer;
import Invoice.Product;
class Groceries9
public static void main(String[] args){
Shop S = new Shop();
Customer C=new Customer();
Product P = new Product();
C.details();
P.getinput();
S.show();
C.disply();
P.disply();
}

