package String;

public class ReverseNumber {
    public static void main(String[] args) {
        String str ="prince Kumar";
         System.out.println(reverseNum(str));
         System.out.println(reverseString(str));

    }
    public static String reverseNum(String str){
        StringBuilder sb = new StringBuilder();
        for(int i=str.length(); i>=0; i--)
        {
            sb.append(str.charAt(i));
        }
        return  sb.toString();
    }

    public static String reveString(String str){
        String ans ="";
        for(int i=str.length(); i>=0; i++){
            ans += str.charAt(i);
        }
        return ans;
        
    }
}
