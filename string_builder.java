
public class string_builder{
public static void main(String[] args) {
StringBuilder sb = new StringBuilder("Computer");
sb.append(" Engg");
System.out.println(sb.toString()); 
sb.insert(5, ",");
System.out.println(sb.toString()); 
sb.delete(5,8); // deleting 7th & 8th char
System.out.println(sb.toString()); 
sb.reverse();
System.out.println(sb.toString()); 
}
}

