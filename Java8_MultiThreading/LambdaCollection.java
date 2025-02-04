package Java8;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/*
class MyComparator implements Comparator<Integer>{
    public int compare(Integer i1, Integer i2){
        return (i1<i2)?-1: (i1>i2)?1:0;
    }
}
public class LambdaCollection {
    public static void main(String[] args) {
        List <Integer> arr = new ArrayList<Integer>();
        arr.add(11);  arr.add(20);
        arr.add(10);  arr.add(25);
        arr.add(5);   arr.add(30);
        arr.add(0);   arr.add(15);
        System.out.println(arr);
        Collections.sort(arr, new MyComparator());
        System.out.println(arr);

    }    
}
 */




// ==================  BY USING LAMBDA EXPRESSION  ==================

public class LambdaCollection {
    public static void main(String[] args) {
        List <Integer> arr = new ArrayList<Integer>();
        arr.add(11);  arr.add(20);
        arr.add(10);  arr.add(25);
        arr.add(5);   arr.add(30);
        arr.add(0);   arr.add(15);
        System.out.println(arr);
        Comparator <Integer> c = (i1,i2)-> (i1<i2)?-1: (i1>i2)?1:0;
        Collections.sort(arr, c);
        System.out.println(arr);

    }    
}