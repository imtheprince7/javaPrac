package DSA_Practice.Leetcode_Practice;

import java.util.ArrayList;
import java.util.List;

public class Leetcode_1790 {
    public static void main(String[] args) {
        String s1 = "bank", s2 = "kanb";
        System.out.println( areAlmostEqual(s1, s2));
    }

    public static boolean areAlmostEqual(String s1, String s2) {
        List<Integer> diffIndices = new ArrayList<>();
   
       for (int i = 0; i < s1.length(); ++i)
         if (s1.charAt(i) != s2.charAt(i))
           diffIndices.add(i);
   
       return diffIndices.isEmpty() ||
           (diffIndices.size() == 2 &&
            s1.charAt(diffIndices.get(0)) == s2.charAt(diffIndices.get(1)) &&
            s1.charAt(diffIndices.get(1)) == s2.charAt(diffIndices.get(0)));   
       }
}
