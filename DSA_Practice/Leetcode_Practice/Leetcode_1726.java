import java.util.HashMap;
import java.util.Map;

class Leetcode_1726{
    public static void main(String[] args) {
        int [] nums = {2,3,4,6};
        System.out.println(tupleSameProduct(nums));
    }
    public static int tupleSameProduct(int[] nums) {
    int ans = 0;
    Map<Integer, Integer> count = new HashMap<>();

    for (int i = 0; i < nums.length; ++i)
      for (int j = 0; j < i; ++j) {
        final int prod = nums[i] * nums[j];
        ans += count.getOrDefault(prod, 0) * 8;
        count.merge(prod, 1, Integer::sum);
      }
    return ans;
    }

}