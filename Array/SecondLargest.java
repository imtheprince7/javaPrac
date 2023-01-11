package Array;

public class SecondLargest {
    public static void main(String[] args) {
        int [] arr = new int[]{12,14,4,67,54,22,99,100};
        System.out.println("Second Largest Number is:"+ secondLargest(arr));
    }
    public static int secondLargest(int [] arr)
    {
        int first,second;
        second=first=-1;
        for(int i=0; i<arr.length; i++)
        {
            if(arr[i]<first){
                second= first;
                first = arr[i];
            }
            if(arr[i]>second && first != arr[i]){
                second = arr[i];
            }
        }
        return second;
    }
}
