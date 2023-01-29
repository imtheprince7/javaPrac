import java.util.Scanner;

public class ArrayAllOperation {
    static  Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {

	    System.out.println("Enter size of Array");
		int n = sc.nextInt();
		int [] ar = new int[n];
	    int [] res = enterElement(ar);

        //Printing the Array Element
	    for(int i=0; i<ar.length; i++){
	        System.out.print(ar[i]+" ");
	    }

        System.out.println("Enter position and Element to insert at specific place:");
        int pos = sc.nextInt();
        int element = sc.nextInt();

        int [] res2 =   insertAtPos(ar, pos, element);
        //Printing the Array Element
	    for(int i=0; i<ar.length; i++){
	        System.out.print(res2[i]+" ");
	    }

	} // main() method close Here

//Taking user-Input to store Array Element.  
	static int [] enterElement(int [] arr){
	    System.out.println("Enter 6 Array Elements:");
	    for(int i=0; i<arr.length; i++){
	        arr[i]= sc.nextInt();
	    }
	    return arr;
	} // enterElement() method close here

// Sorting Array-Element  
	static int [] sortArray(int [] arr){
	    for(int i=0; i<arr.length; i++){
	        if(arr[i]>arr[i+1]){
	            int temp = arr[i];	            
	        }   
	    }
        return arr;
	}  // sortArray() method close here

// Inserting an Element at specific order----

    static int [] insertAtPos(int [] arr, int pos, int ele){
       int i=0;
            if(pos>=0 && pos <=arr.length){
                for(i=arr.length; i>pos; i--){
                        arr[i]= arr[i-1];
                    }
                    arr[pos] = ele;
            }
            else{
                System.out.println("Please Enter Valid Position for Inster the Element");
        }
        return arr;
    }  // insertAtPos() Method End Here

} // Class--- Scope End Here !!
