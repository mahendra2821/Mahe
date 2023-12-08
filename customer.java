public class customer {
public static void main(String[] args) {
String customerType = "Regular";
int quantity = 2;
int unitPrice = 10;
int totalCost = 0;
int discount = 5;
int deliveryCharge = 5;
totalCost = unitPrice * quantity;
if (customerType == "Regular") {
totalCost = totalCost - (totalCost * discount / 100);
System.out.println("Eligible for 5% discount");
} 
else {
totalCost = totalCost + deliveryCharge;
System.out.println("Delivery charge of $5");
}
System.out.println("Total cost: " + totalCost);
}
}
