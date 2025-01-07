import java.util.*;

class Gfg_07Jan{
    public static void main(String[] args) {
        int [] arr = {-1, 1, 5, 5, 7};
        int target = 6;
        
        System.out.println(countPairs(arr, target));
    }

    public static  int countPairs(int [] arr, int target) {

        int count=0;
        HashMap<Integer,Integer>map = new HashMap<>();
        for(int i =0; i <arr.length; i++){
            if(map.containsKey(target - arr[i])){
                count+= map.get(target - arr[i]);
            } 
            map.put(arr[i], 1);
        }        
        return count;
    }

}