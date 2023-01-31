
public class BasicQuest {
    public static void main(String[] args) {
        int num = 123456;
        System.out.println(findPalindorm(num));
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
}
