package Java8_Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMapDemo {
    
// *****************  By defalt Stream process the data(object) SEQUENTIALLY **************************
    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(1,3);
        List<Integer> list2 = Arrays.asList(2,4);
        List<Integer> list3 = Arrays.asList(5,7);
        List<Integer> list4 = Arrays.asList(6,8);
        List<List<Integer>> finalList = Arrays.asList(list1,list2,list3,list4);

        finalList.stream().flatMap(m ->m.stream()).filter(x->x>5).map(x->x%2 ==0).collect(Collectors.toList()).forEach(n-> System.out.print(n+" "));


        List<String> teamA = Arrays.asList("Pankaj","Tripathi","Ganguli","saurav");        
        List<String> teamB = Arrays.asList("Suraj","Ahsfaq","Sachin","Nitin");
        List<String> teamC = Arrays.asList("Archana","Sincha","Natraj","Gokul");
        List<String> teamD = Arrays.asList("kritika","Monika","Anshika","Aparsh");

        List<List<String>> finalPlayers = Arrays.asList(teamA,teamB,teamC,teamD);

// Before Java8 TO Print the name of all Players from different team at once.
            System.out.println();        
            System.out.println("Before Java_8 TO Print the name of all Players from different team at once.");            
            for(List<String> teams: finalPlayers){
               for(String name:teams){
                   System.out.print(name+" ");
            }
        }


// With the Help of Java_8
        System.out.println();
        System.out.println("With the Help of Java_8");


        finalPlayers.stream().flatMap(m->m.stream()).collect(Collectors.toList()).forEach(name-> System.out.print(name+" "));
        System.out.println();
        System.out.println("Name of the player length should be Greater Than 6:");
        finalPlayers.stream().flatMap(m->m.stream()).filter(s-> s.length()>7).collect(Collectors.toList()).forEach(name-> System.out.print(name+" "));

    }
}
