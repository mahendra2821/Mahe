
class Maths{
void add(){
System.out.println("Method 1: No Parameters ");
}
void add(int a, int b){
System.out.println("Method 2 : Two Parameters ");
}
void add(int x, int y,int z){
System.out.println("Method 3 : Three Parameters ");
}
}
class encapsule_c{
public static void main(String args[])
{
Maths m = new Maths();
m.add();
m.add(2,5);
m.add(5,8,4);
}
}

