import java.util.ArrayList;
import java.util.HashSet;
public class arrayDuplicateaDEl {
public static void main(String[] args) {
ArrayList<Integer> list = new ArrayList<>();
list.add(1);
list.add(2);
list.add(2);
list.add(3);
list.add(4);
list.add(4);
HashSet<Integer> set = new HashSet<>(list);
list.clear();
list.addAll(set);
System.out.println("ArrayList after removing duplicates: " + 
list);
}
}
    
