import java.util.*;

class Gfg_11Jan{


    public static void main(String[] args) {
        String str = "geeksforgeeks";
        System.out.println(longestUniqueSubstr(str));
    }

    public static int longestUniqueSubstr(String str) {
        String [] s = str.toCharArray(); 
        int res = 0, count = 0, left = 0, right = 0;
       while (right < s.length()) {
           while (
               (left < right) &&
               ((count & (1 << (s[right] - 'a'))) > 0)
           ) {
               count ^= 1 << (s[left] - 'a');
               left += 1;
           }
           
           count ^= 1 << (s[right] - 'a');
           res = max(res, right - left + 1);
           right += 1;
       }
       return res;
   }
}