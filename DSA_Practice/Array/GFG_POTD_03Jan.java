import java.util.*;

public class GFG_POTD_03Jan {
        public long subarrayXor(int arr[], int k) {

            long answer = 0;
             Map<Integer,Integer>map = new HashMap<Integer, Integer>();
            map.put(0,1);
            int currxor=0;
            
            for(int i:arr){
                currxor ^=i;
                if(map.containsKey(currxor^k)){
                    answer += map.get(currxor^k);
                }
                map.put(currxor, map.getOrDefault(currxor,0)+1);
            }
            return answer;
        }

        public static void main(String[] args) {
            int [] arr = {4, 2, 2, 6, 4};
            int k = 6;
            GFG_POTD_03Jan gfg = new GFG_POTD_03Jan();

            System.out.println(gfg.subarrayXor(arr, k));

        }
    
}
