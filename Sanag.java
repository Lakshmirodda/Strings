import java.util.*;
public class Sanag{
  public static void main(String[]args){
    String s="race";
    String s1="care";
    if(s.length()==s1.length()){
      char[]a=s.toCharArray();
     char[]a1=s1.toCharArray(); 
      Arrays.sort(a);
      Arrays.sort(a1);
      boolean result=Arrays.equals(a,a1);
      if(result){
      System.out.println(s+" and "+s1+" are Anagram");
      }
      else{
      System.out.println(s+" and "+s1+" are not Anagram");
      }
      }
    }
}