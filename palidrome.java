public class palidrome {
        public static boolean ispalidrome(String str){
            String reversed = new StringBuilder(str).reverse().toString();
            return str.equals(reversed);
        }
        public static void main(String[] args){
            String str = "ABA";
            if (ispalidrome(str)){
                System.out.println(str + " is a palindrome");
            }
            else {
                System.out.println(str + " is not a palidrome");
            }
            }
        
      
    
}
