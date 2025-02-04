package Java8;

import java.util.function.Function;

public class Sum {
    int sum(int a , int b){
        return a+b;
    }
     
    public static void main(String[] args) {
         Sum ss = new Sum();
          FunctionalInterface  =(a,b) -> a+b ;
        // Function<Integer, Integer> sum = a -> a+a;
        System.out.println("sum of two Number is"+ss(22,22));
    }
}
