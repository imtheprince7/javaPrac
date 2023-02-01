
public class BasicQuest {
    public static void main(String[] args) {
        int num = 123456;
        System.out.println(findPalindorm(num));
        System.out.println(findReverse(num));
    }

    public static boolean findPalindorm(int num){
        int n=num, rem=0, rev =0;
        while(n>0){
            rem = n%10;
            n/= n;
            rev = (rev*10)+rem;
        }
        if(rev==num)
            return true;
        else
            return false;
    }

    static int findReverse (int num){
        int rev=0, rem=0;
        while(num>0){
            rem = num%10;
            num/= 10;
            rev= (rev*10)+ rem;
        }
        return rev;
    }
}
