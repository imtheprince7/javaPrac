public class FindNumber {
    
    public static void main(String args[])
    {
        int[] a = {123 , 34 , 3434 , 121 , 100};
        System.out.println(findNumbers(a));
    }
    public static  int findNumbers(int[] nums)
    {
         int result=0;
        for(int i = 0 ; i < nums.length ; i++)
        {
            if(numberOfDigits(nums[i]) % 2 == 0)
                result++;
        }   
        return result;
    }         
    static int numberOfDigits(int num)
    {
        int count=0;
         while(num>0){
                 num/= 10;
                 count++;
             }
        return count;
    }
}
