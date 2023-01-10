package String;

public class ReverseNumber {
    public static void main(String[] args) {
        String str ="prince Kumar";
        reverseNum(str);
    }
    public static String reverseNum(String str){
        StringBuilder sb = new StringBuilder();
        for(int i=str.length(); i>=0; i--)
        {
            sb.append(str.charAt(i));
        }
        return  sb.toString();
    }
}
