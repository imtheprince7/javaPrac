public class ElementInRange{
    public static void main(String [] args)
    {	
        int [] arr = new int []{1, 4, 5, 2, 7, 8, 3};
        int n=arr.length, A=2, B=5;
        boolean b = check_elements(arr,n,A,B);
        System.out.println(b);
    }
   static boolean check_elements(int arr[], int n, int A, int B)
   {
        int count = B - A + 1;
        boolean[] seen = new boolean[B + 1];
        for(int num : arr) {
             //   System.out.println(num+" ");
                if(num >= A && num <= B && !seen[num]) {
                    count --;
            // we use this line because if in case that Number comes twice 
            //then no need to check again.
                    seen[num] = true;
                }
                if(count ==0)	
                    return true;
    
                }
                return count ==0;
            }
       }
    