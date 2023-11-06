import java.util.*;
public class Rev {
    public static void main(String[] args)
    {
        String s = "Welcome to java";
        char[] a = s.toCharArray();
        for (int i = a.length - 1; i >= 0; i--)
            System.out.print(a[i]);
    }
}