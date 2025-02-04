package DSA_Practice.String;

public class ReverseNumber {
    public static void main(String[] args) {
        String str ="prince Kumar";
         System.out.println(reverseNum(str));
         System.out.println(reverseString(str));
         System.out.println(removeVowel(str));
         System.out.println(removeConsonent(str));

    }
    public static String reverseNum(String str){
        StringBuilder sb = new StringBuilder();
        for(int i=str.length(); i>=0; i--)
        {
            sb.append(str.charAt(i));
        }
        return  sb.toString();
    }

    public static String reverseString(String str){
        String ans ="";
        for(int i=str.length(); i>=0; i++){
            ans += str.charAt(i);
        }
        return ans;
    }

    static String removeVowel(String str){
        StringBuffer sb = new StringBuffer();
       for(int i=0; i< str.length(); i++){
            if(str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='i' || str.charAt(i)=='o' || str.charAt(i)=='u'){
                continue;
            }
            else{
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();
    }

    static String removeConsonent(String str){ 
        StringBuffer sb = new StringBuffer();
        for(int i=0; i< str.length(); i++){
             if(str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='i' || str.charAt(i)=='o' || str.charAt(i)=='u'){
                sb.append(str.charAt(i));
             }
         }
    
        return sb.toString();
    }




}
