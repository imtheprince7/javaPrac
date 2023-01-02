package String;
import java.util.Scanner;;

public class CountWords {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner((System.in));
        System.out.println("Enter String");
        String str = sc.nextLine();
        System.out.println("Reverse String is:"+" "+countTotalWords(str));
        sc.close();
        
    }

    public static String countTotalWords(String str)
    {
       String rev=""; 
        for(int i=str.length()-1; i>=0; i--)
        {
             rev+= str.charAt(i);
        }
        return rev;
    }
}
