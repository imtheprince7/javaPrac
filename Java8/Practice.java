package Java8;

import java.util.function.Function;
import java.util.function.Predicate;
import java.util.Scanner;


interface Interf {
    public int squareInt(int a);
}    
public class Practice {
     public static void main (String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number to perform basic operation:");
        int num = sc.nextInt();     

    //    Interf demo =(a) ->{ return a*a; };
    //    int result = demo.squareInt(num);
    //    System.out.println("Lambda Expression value:"+" "+result);

        Interf demo =(a) ->a*a;
        System.out.println("Lambda Expression value:"+" "+demo.squareInt(num));



        Function<Integer,Integer>fun=  i -> i*i;
        System.out.println("Square of"+num+" "+"is:"+" "+fun.apply(num  )); 
        Predicate <Integer> p =i -> i%2==0;
        
        if(p.test(num) ==false)
            System.out.println("The Given Number"+num+" "+"is "+p.test(num));
        else
            System.out.println("The Given Number"+num+" "+"is "+p.test(num));
            sc.close();
            
    }
}
