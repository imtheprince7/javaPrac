import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;


public class Demo{
    private final String name;
    private final List<Object> petNameList;

    Demo( String name, List<Object> petNameList){
        this.name = name;
        this.petNameList = petNameList;
    }

    public String getName(){
        return name;
    }
    public List<Object> getpetNameList(){
        return new ArrayList<>(petNameList);
    }


    public static void main(String[] args) {
        List<Object> petNames = new ArrayList<>();
        petNames.add("PS");
        petNames.add("KS");


        Demo demo = new Demo("my_name", petNames);
        System.out.println(demo.getpetNameList());
        System.out.println();
        petNames.add("args");
        petNames.add("vargss");
        
        System.out.println(demo.getpetNameList());
        System.out.println(demo.getName());

    }
}
