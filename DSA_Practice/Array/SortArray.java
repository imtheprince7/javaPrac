

public class SortArray {
   public static void main(String[] args) {
        
        int [] arr = new int []{34,3,5,1,7,4,23,67,98};
        sortArray(arr);
    }
    public static void sortArray(int [] arr)
    {
        int n = arr.length;
        int [] ans = new int[n];
        for(int i=0; i<n; i++)
        {
            for(int j=i+1; j<n; j++)
            {
                if(arr[i]<arr[j])
                {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        // return ans;
    } 
}
