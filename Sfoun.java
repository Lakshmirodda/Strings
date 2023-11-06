import java.util.Scanner;
public class Sfoun {
public static void main(String[]args){
  Scanner sc=new Scanner(System.in);
  String s=sc.nextLine();
  System.out.println("Enter search String :");
  String subString= sc.next();
  if(s.contains(subString)){
    System.out.println(subString + " is  found");
  }
  else
  {
    System.out.println(subString+" is not found");
  }
}
}