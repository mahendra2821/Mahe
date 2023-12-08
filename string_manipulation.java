
    class string_manipulation{
        public static void main(String args[]){
        String Str1 = " The Cool Captain ";
        String Str2 = "MS Dhoni";
        System.out.println(Str1);
        System.out.println(Str1.charAt(9));
        System.out.println(Str1.codePointAt(2));
        System.out.println(Str1.compareTo(Str2));
        System.out.println(Str1.concat(Str2));
        System.out.println(Str1.contains("cool"));
        System.out.println(Str1.endsWith("S"));
        System.out.println(Str1.equals(Str2));
        System.out.println(Str1.length());
        System.out.println(Str1.replace("o","xx"));
        System.out.println(Str1.toCharArray());
        System.out.println(Str1.toLowerCase());
        System.out.println(Str1.toString());
        System.out.println(Str1.toUpperCase());
        System.out.println(Str1.trim());
        }
    }

