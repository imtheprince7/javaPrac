package Java8_Stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterDemo2 {
// *****************  By defalt Stream process the data(object) SEQUENTIALLY **************************    public static void main(String[] args) {
    public static void main(String[] args) {
        
        List<String> names = Arrays.asList("Prince","Aashish","Chanchal","Aashi Singh","Ankita Singh","Kirti Kumari","Priya Singh","Shubhangi");
        
// To print Only NAME which size >=6 &&  size <=8 SEVERAL methods:
    
// 1. Normal Method ForEach Method()
        for (String str : names) {
            if(str.length()>=6 &&str.length()<=8){
                System.out.print(str+" ");
            }            
        }
        System.out.println(" ");        


// By JAVA_8 =======  STREAM filer() method & Storing in new List
        
        names.stream().filter(n -> n.length() >=6 && n.length()<=11 ).forEach(s->System.out.print(s+" "));
        System.out.println("");
        names.stream().filter(n -> n.length() >=6 && n.length()<=14).forEach(System.out::print);
               


        System.out.println("Minimum Element inODD_Number is: "+" "+ names.stream().distinct().filter(e->e.length()<7).min((val1,val2)->{ return val1.compareTo(val2);}));
        System.out.println("aximum Element in ODD_Number is: "+" "+ names.stream().distinct().filter(e->e.length()>10).max((val1,val2)->{ return val1.compareTo(val2);}));
  
            
        }
}
