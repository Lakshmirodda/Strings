import java.util.*;
public class Sevenp {
    public static void main(String[] args){
        String s = "Welcometojava";
       String res=" ";
        for (int i=0;i<s.length();i+=2){
          res=res+s.charAt(i);
        }
      res=res+" ";
      for (int i=1;i<s.length();i+=2){
          res=res+s.charAt(i);
    }
      System.out.println(res.toString());
}
}