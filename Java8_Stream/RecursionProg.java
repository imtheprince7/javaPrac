import java.util.Scanner;
public class Main
{
	public static void main(String[] args) 
	{
	    
	    Scanner sc = new Scanner(System.in);
	    int [] arr = {1,2,3,4,5,6,7,8};
	    System.out.println("Enter Your Name:");
	    String name = sc.nextLine();
	    int n =name.length();
	    int m = arr.length;
	    printName(name,n);
	    System.out.println();
	    printNameSame(name,0);
	    System.out.println();
	    System.out.print(sumofNumber(5));
	    System.out.println();
	    System.out.println(reverseArray(arr, m));
	}
	static int printNameSame(String name, int i){
	   int n= name.length(); // n=6
	    if(i>=n)
	        return i-1;
	    else
	        System.out.print(name.charAt(i)+" ");
	        return printNameSame(name, i+1);
	}

    static int printName(String name, int n){
        if(n==0)
            return 0;
        else
            System.out.print(name.charAt(n-1)+" ");
        return printName(name,n-1);
    }
    static int sumofNumber(int n){
        if(n==1)
            return 1 ;
        
        return (n+sumofNumber(n-1));
    }
    static int reverseArray(int [] arr, int n){
        if(n==0)
            return 0;
        else
        System.out.print(arr[n-1]+" ");
        return reverseArray(arr, n-1);
    }
    
}
