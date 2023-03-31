package Java8_Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapDemo1 {

    public static void main(String[] args) {
        List<String> vehicles = Arrays.asList("thar","swift","kia","fortuner","scarpio","bolero","pajero","bmw","ninja");
        
        // To convert all the List object in UpperCase.
        vehicles.stream().map(u->u.toUpperCase()).collect(Collectors.toList()).forEach(s-> System.out.print(s+" "));
        

        // TO count the length of every object and print them
        System.out.println("TO count the length of every object and print them");
        vehicles.stream().map(st -> st.length()).collect(Collectors.toList()).forEach(System.out::println);


    
    
    }
    
}
