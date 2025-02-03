public class Leetcode_3105 {
    
    public static void main(String[] args) {
        int [] nums = {1,4,3,3,2};
        System.out.println(longestMonotonicSubarray(nums));
    }
    
    public static int longestMonotonicSubarray(int[] nums) {
            int ans = 1;
            for (int i = 1, t = 1; i < nums.length; ++i) {
                if (nums[i - 1] < nums[i]) {
                    ans = Math.max(ans, ++t);
                } else {
                    t = 1;
                }
            }
            for (int i = 1, t = 1; i < nums.length; ++i) {
                if (nums[i - 1] > nums[i]) {
                    ans = Math.max(ans, ++t);
                } else {
                    t = 1;
                }
            }
            return ans;
        }
}
