import java.util.Deque;
import java.util.ArrayDeque;


class CheckParenthesis {
  
    static boolean isParenthesisBalanced(String s) {
        
        Deque<Character> stack = new ArrayDeque<Character>();
        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            if(c=='(' || c=='{' || c =='['){
                stack.push(c);
            }
            else{
                if(stack.isEmpty()){
                    return false;
                }
                else if(isCheck(stack.peek(),c)==false){
                    return false;
                }
                else
                stack.pop();
            }
        }
        return (stack.isEmpty()==true);
    }

   public static boolean isCheck(char a , char b){
       return ( a =='(' && b==')' || a =='{' && b =='}' || a == '[' && b ==']');
   }

   public static void main(String [] args){
    String str = "[{()}]";
     System.out.println(isParenthesisBalanced(str));
   }
}
