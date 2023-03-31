package Java8;

import java.util.*;
public class StreamPrac {
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<Integer>();
        arr.add(5);   arr.add(6);
        arr.add(7);   arr.add(8);
        arr.add(9);   arr.add(10);
        arr.add(11);   arr.add(12);
        arr.add(13);   arr.add(14);
         
        arr= (List<Integer>)arr.stream().map(e -> e*5).toList();
        for(Integer val : arr)
        {
            System.out.print(val+" ");
        }
    }
}
