public class RverseString{public static void main(String[] args) {
    
   revString("abcd");
}
static void revString(String s)
{
    String rev="";
    for(int i =s.length()-1;i>=0;i--)
    {
        char ch =s.charAt(i);
        rev = rev+ch;
    }
    System.out.println("reverse string is"+rev);

}
}