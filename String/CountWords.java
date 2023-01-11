package String;
import java.util.Scanner;;

public class CountWords {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner((System.in));
        System.out.println("Enter String");
        String str = sc.nextLine();
        System.out.println("Reverse String is:"+" "+countTotalWords(str));
        sc.close();
        int num = 123456;
        System.out.println("Reverse Number  is:"+" "+reverseNum(num));
        
        
    }
    public static int reverseNum(int num)
    {
        int rev=0, rem=0;
        while(num>0){
                rem = num%10;
                num/= num;
                rev= rev*10+rem;
        }

        return rev;
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
