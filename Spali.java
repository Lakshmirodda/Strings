import java.util.Scanner;
public class Spali {
public static void main(String[] args){
  Scanner sc=new Scanner(System.in);
  String a=sc.next();
  String reverse="";
  for(int i=a.length()-1;i>=0;i--)
    {
      char ch=a.charAt(i);
      reverse=reverse+ch;
    }
      if(reverse.equalsIgnoreCase(a)){
    System.out.println(a+ "  is a palindrome");
     }
      else
     {
       System.out.println(a+ "  is not a palindrome");
      }
   }
}