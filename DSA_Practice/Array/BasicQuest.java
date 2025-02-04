import java.util.ArrayList;
import java.util.Arrays;
public class BasicQuest {
    public static void main(String[] args) {
        int num = 123456;
        int [] arr ={2,54,12,1,23,67,87,98,67,78,45,88};
        System.out.println(findPalindorm(num));
        System.out.println(findReverse(num));
        System.out.println(secondLargest(arr));
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
    static int secondLargest(int [] arr){
        Arrays.sort(arr);
        int first =-1, second =-1;
        for(int i=0; i<arr.length; i++){
            if(arr[i]> first){
                second = first;
                first = arr[i];
            }
            else if( arr[i]>second && arr[i] != first){
                second = arr[i];
            }
        }
        return second;
        
    }

}
