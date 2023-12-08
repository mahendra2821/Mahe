public class string_buffer {
public static void main(String[] args) {
StringBuffer sb = new StringBuffer("saran");
sb.append("Java"); // Append strings to the buffer
sb.append(" ");
sb.append("oops");
// Insert a string at a specific position
sb.insert(5, "parul");
System.out.println(sb);
// Replace a portion of the string
sb.replace(0, 5, "Hi");
System.out.println(sb);
// Delete a portion of the string
sb.delete(2, 4);
System.out.println(sb);
// Reverse the string
sb.reverse();
System.out.println(sb);
// Convert the StringBuffer to a String
String result = sb.toString();
System.out.println(result);
}
}
