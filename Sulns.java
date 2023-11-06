public class Sulns{
  public static void main(String[]args){
    String s="Adilakshmi@1235";
    int upp=0;
    int low=0;
    int num=0;
      int spec=0;
    for(int i=0;i<s.length();i++){
 char c=s.charAt(i);
      if(c>='A'&&c<='Z')
        upp++;
        else if(c>='a'&&c<='z')
        low++;
         else if(c>='0'&&c<='9')
        num++;
       else
         spec++;
    }
    System.out.println("upperletters count = "+upp);
    System.out.println(" lower letters count ="+low);
    System.out.println(" numbers letters count ="+num);
    System.out.println(" special symbols count ="+spec);
  }
}