import java.util.Scanner;
public class Sip {
public static void main(String[]args){
  Scanner sc=new Scanner(System.in);
  Integer  a=sc.nextInt();
  String s=a.toString();
   System.out.println(" char at index position 2 = "+s.charAt(s.length()-3));
}
}