class College{
String name = "Parul University,NAAC A++";
String Address = "Limda,Gujarat";
void disply(){
System.out.println("Name of the Institute: "+name);
System.out.println("Address: " +Address);
class Student{
String name = "Dinesh kumar";
String Dept = "CSE-AI";
void disply()
{
System.out.println("Name of the Students: "+name);
System.out.println("Department: " +Dept);
} 
}
Student S = new Student();
S.disply();
}
}
class importance_inner_class{
public static void main(String[] args)
{
College Clg=new College();
Clg.disply();
}
}
