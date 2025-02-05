package Basic_Question;

class JavaBasicQuestions {
    public static void main(String[] args) {
        int palindrom = 123215;
        int number = 371; 
        int [] arr = {2, 5, -1, 3, 0, -5, 0, 1};
        int [] ar1 = {2, 5, 57, -1, 3,13, 7, 0, 27, 32, -5, 0, 1};
        System.out.println(checkPalindrome(palindrom));
        System.out.println(findSumofDigit(palindrom));
        System.out.println(checkArmstrong(number));
        System.out.println("Smallest Number"+" "+ findSmallestNumber(arr));
        System.out.println("Largest Number"+" "+ findLargestNumber(arr));
    }
    
    public static boolean checkPalindrome(int number){
        // edge case:
        if(number < 0){
            return false;
        }
        int reverse =0 ,remainder = 0,  num = number;
        while(number >0){
            remainder = number%10;
            number = number /10;
            reverse = reverse *10 + remainder;
        }
        //checking both variable and returning the answer:

        if(reverse == num)
            return true;
        return false;
    }

// Find sum of all digits:
    public static int findSumofDigit(int number){
        // edge case:
        if(number < 0){
            return 0;
        }
        int totalSum =0;
        while (number >0) {
            int remainder = number %10;
            number /= 10;
            totalSum += remainder;            
        }
        return totalSum;
    }

    public static boolean checkArmstrong(int number){
        // edge case:
        if(number < 0){
            return false;
        }
        String str = Integer.toString(number);
        int n = str.length();

        return false;
    }


// Find Smallest number:
    public static int findSmallestNumber(int [] arr){
    // edge case:
        if(arr.length < 0)
            return 0;
     int smallest = arr[0];

     for(int i=0; i<arr.length; i++){
        if(arr[i] < smallest)
            smallest = arr[i];
     }
     return smallest;

  }

// Find Largest number:
    public static int findLargestNumber(int []arr){
    // edge case:
        if(arr.length < 0)
            return 0;

     int largest = arr[0];

     for(int i=0; i<arr.length; i++){
        if(arr[i] > largest){
            largest = arr[i];
            System.out.println("Largest "+" "+ largest);
        }
     }
     return largest;

  }
    
}
