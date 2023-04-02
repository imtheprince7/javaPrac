package Java8_Stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class StreamMethod {
    
// *****************  By defalt Stream process the data(object) SEQUENTIALLY **************************
    public static void main(String[] args) {
// Sorting & All Rest Functionality through JAVA_8

        List<Integer> numbers = Arrays.asList(2,6,1,8,4,9,3,10,5,24,7);
        List<String> names = Arrays.asList("Prince","David","Surbhi","Divya","Akshara","Pooja","Kirti","Chhaya");


// SORT the number in Ascending && Reverse Order.
        numbers.stream().sorted().forEach(num->System.out.print(num+" "));
        System.out.println();
        numbers.stream().sorted(Comparator.reverseOrder()).forEach(num->System.out.print(num+" "));



// SORT the STRING in Ascending Order.
        System.out.println();
        names.stream().sorted().forEach(name->System.out.print(name+" "));
        System.out.println();
        names.stream().sorted(Comparator.reverseOrder()).forEach(nam->System.out.print(nam+" "));


// Matching Method in JAVA_8
        // anyMatch()
       // allMatch()
       // noneMatch()

        Set<String> fruites = new HashSet<String>();
                fruites.add("One Mango");       fruites.add("Two Appple");        
                fruites.add("One Banana");       fruites.add("Two Banana");        
                fruites.add("Three Saladss");       fruites.add("Four PineApple");        
                fruites.add("One lemon");       fruites.add("Six groups of Grapes");        

        
//[anyMatch] TO CHECK ANY MATCH AVAIALABLE IN THE GIVEN STRING OR NOT [only Start or any one word  should match in the other String]
           System.out.println(fruites.stream().anyMatch(fru->{return fru.startsWith("One");})); 


//[allMatch] TO CHECK ANY MATCH AVAIALABLE IN THE GIVEN STRING OR NOT  [Every word in String_word should match in the other String_word]
            System.out.println(fruites.stream().allMatch(fru->{return fru.startsWith("one");})); 

//[noneMatch] TO CHECK ANY MATCH AVAIALABLE IN THE GIVEN STRING OR NOT  [Opposite of anyMatch()]
System.out.println(fruites.stream().noneMatch(fru->{return fru.startsWith("one");})); 


    }
}
