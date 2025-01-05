import java.util.*;

class  CountPairLessThanTarget{

    int countPairs(ArrayList<Integer> arr, int target) {
        Collections.sort(arr);
         
        int i = 0, n = arr.size();
        int j = n-1, count = 0;
        
        while( i<j ){
            if( target > arr.get(i) + arr.get(j) ){
                count+=(j-i);
                i++;
            }
            else{
                j--;
            }
        }
        return count;
    }

    public static void main(String [] args){

    }
}