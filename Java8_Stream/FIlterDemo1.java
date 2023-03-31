package Java8_Stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FIlterDemo1 {
    public static void main(String[] args) {
        List <Integer> numberList= Arrays.asList(2,4,7,8,10,12,45,4,2,7,10,55,14,25,27,16,35,37,18);
        List<Integer> evenNumber = new ArrayList<Integer>();

    // To print Only Even Number we have several methods:
    
    // 1. Normal Method ForEach Method()

        for(Integer num: numberList){
                if(num%2==0){
                    System.out.print(num+" ");
                }
        }
        System.out.println(" ");       
        
        
    // By JAVA_8 =======  STREAM filer() method & Storing in new List

        evenNumber = numberList.stream().filter(n -> n%2 ==0).collect(Collectors.toList());
        System.out.print(evenNumber+" ");
        System.out.println(" ");


    // By JAVA_8 =======  STREAM filer() method & Without extra SPACE

            numberList.stream().filter(n-> n%2==0).forEach(n-> System.out.print(n+" "));
            System.out.println(" ");


    // By JAVA_8 =======  STREAM filer() method & Without EXTRA_LINE_TO_PRINT ::  ENHACNCE METHOD

            numberList.stream().filter(n-> n%2==0).forEach(System.out::println);
            System.out.println("Print Distinct Element");
            numberList.stream().distinct().forEach(num->System.out.print(num+" "));
            System.out.println("Total Number is: "+" "+numberList.stream().distinct().count());



    // Find How many EVEN_NUMBER in this List.
           System.out.println("Total Even_Number is: "+" "+ numberList.stream().filter(e->e%2 ==0).count());
           System.out.println("Total DISTINCT Even_Number is: "+" "+ numberList.stream().distinct().filter(e->e%2 ==0).count());
           System.out.println("Minimum Element in Even_Number is: "+" "+ numberList.stream().distinct().filter(e->e%2 ==0).min((val1,val2)->{ return val1.compareTo(val2);}));
           System.out.println("Maximum Element in Even_Number is: "+" "+ numberList.stream().distinct().filter(e->e%2 ==0).max((val1,val2)->{ return val1.compareTo(val2);}));


    // Find How many ODD_NUMBER in this List.
           System.out.println("PRINT TOTAL ODD_Number is: "+" "+ numberList.stream().filter(e->e%2 !=0).count());
           System.out.println("Total DISTINCT ODD_Number is: "+" "+ numberList.stream().distinct().filter(e->e%2 !=0).count());
           System.out.println("Minimum Element inODD_Number is: "+" "+ numberList.stream().distinct().filter(e->e%2 !=0).min((val1,val2)->{ return val1.compareTo(val2);}));
           System.out.println("aximum Element in ODD_Number is: "+" "+ numberList.stream().distinct().filter(e->e%2 !=0).max((val1,val2)->{ return val1.compareTo(val2);}));
    
    
    
    }
}
