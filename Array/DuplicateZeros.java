import java.util.List;
import java.util.ArrayList;
public class DuplicateZeros {
    public static void main(String[] args) {
        int [] arr = {1,0,2,3,0,4,5,0};
        System.out.println(duplicateZeros(arr));
    }

    public static int [] duplicateZeros(int[] arr) {
    List<Integer> list = new ArrayList<Integer>();
    for(int i=0; i<arr.length; i++){
        if(arr[i]==0){
            list.add(0);
            list.add(0);
        }
        else
            list.add(arr[i]);
    }
     for (int i = 0; i < arr.length; i++) 
            arr[i] = list.get(i);
    return arr;
  }
}