import java.util.*;
public class Sc {
    public static void main(String[] args){
        String s = "123456789";
       int sum=0;
      int len=s.length();
        for (int i=0;i<s.length();i++){
          if(Character.isDigit(s.charAt(i))){
            sum=sum+Character.getNumericValue(s.charAt(i));
          }
          }
      System.out.println("sum = "+sum);
    }}