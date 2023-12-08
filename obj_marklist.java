class Admin{
String Clgname = "Parul University";
String Address = "Wagodia Road, Vadodara, GJ";
public Admin(){
System.out.println(Clgname);
System.out.println(Address);
}
void show(){
System.out.println("391760");
}
}
class Dept{
String Std_name="Rajesh";
String Std_Regno = "220202301254";
void disply(){
System.out.println(Std_name);
System.out.println(Std_Regno);
}
}
class Exam{
String Subject = "Java";
int mark = 85;
char result='P';
double CGPA= 8.5;
void disply(){
System.out.println(Subject);
System.out.println(mark);
System.out.println(result);
System.out.println(CGPA);
}
}
class Principal{
void disply(){
System.out.println("Sign of Principal");
}
}
class Marklist{
public static void main(String args[]){
Admin objadmin = new Admin();
objadmin.show();
Dept objdept = new Dept();
objdept.disply();
Exam objexam = new Exam();
objexam.disply();
System.out.println(a);
Principal objprinc=new Principal();
objprinc.disply();
}jn
//classname objname = new classname();
}
