import java.util.*;
public class Main{
	public static void main(String[] args) {
	    ArrayList<Integer> arr = new ArrayList<>();
	    arr.add(30);    arr.add(55);
	    arr.add(10);    arr.add(75);
	    arr.add(40);    arr.add(25);
	    arr.add(50);    arr.add(43);
	    arr.add(70);    arr.add(39);
	    arr.add(870);   arr.add(71);
	    arr.add(90);    arr.add(85);
	    arr.add(100);   arr.add(55);
	    arr.add(550);   arr.add(63);
		
		
		long answer = arr.stream().filter((Integer num) -> num %2  == 0).count();
        System.out.println("Total count , Where number is Greater than 35:"+" "+answer); 
        System.out.println("Total Count: "+" "+totalCount(arr));
	}

    public static int totalCount(ArrayList<Integer> arr){
        int totalcount = 0;

        for(int num : arr){
            if(num %2 ==0){
                totalcount++;
            }
        }

        return totalcount;
    }
}
