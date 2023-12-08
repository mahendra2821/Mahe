class Person{ 
int id; 
String name; 
Person(int id,String name){ 
this.id=id; 
this.name=name; 
} 
} 
class Employee extends Person{ 
double salary; 
Employee(int id,String name,float salary){ 
super(id,name); //using parent constructor method using super keyword
this.salary=salary; 
} 
void display()
{
System.out.println(id+" "+name+" "+salary);} 
} 
class super_method{ 
public static void main(String[] args){ 
Employee E=new Employee(101,"Rajesh kumar",55000); 
E.display(); 
}
} 
