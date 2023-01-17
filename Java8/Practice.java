package Java8;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number to perform basic operation:");
        int num = sc.nextInt();
        Function<Integer,Integer>fun=  i -> i*i;
        System.out.println("Square of"+num+" "+"is:"+" "+fun.apply(num  )); 
        Predicate <Integer> p =i -> i%2==0;
        if(p.test(num) ==false){
            System.out.println("The Given Number"+num+" "+"is "+p.test(num));
        }
        else{
            System.out.println("The Given Number"+num+" "+"is "+p.test(num));
    
        }
    }
}
