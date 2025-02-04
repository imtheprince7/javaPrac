public class SingleNumber {
    public static void main(String[] args) {
        int [] arr ={4,1,2,1,2};
        System.out.println(singleNumber(arr));
    }
    public static int singleNumber(int [] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            count = 0;
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    count++;
                }
            }
            if (count == 1) {
                return nums[i];
            }
        }
        return 0;
    }
}