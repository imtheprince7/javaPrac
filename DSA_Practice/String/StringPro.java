// import java.io.StringReader;
// import java.util.Arrays;

// public class StringPro {
//    static final int CHAR =256;
//     public static void main(String[] args) {
//         String str1 = "geeksforgeeks";
//         String str2 = "geeksforgeeks";
//         String str3 = new String("geeksforgeeks");
//         String str = "The quick brown fox jumps over the lazy dog";
//         String str4 = "geeksforgeeks";
//         String patt = "geeks";
//         String num = "12.385";
//         String s1 = "abad";
//         String s2 = "aabdc";
//         String s6 ="aabca";
//         String s7 ="acaba";
//         // System.out.println(str1.contains(str2));
//         // System.out.println(str1.equals(str));
//         // System.out.println(str2.compareTo(str));
//         // System.out.println(str2.indexOf("geek", 6));
//         // if(str2==str1)
//         //     System.out.println("true");
//         // else
//         //     System.out.println("false");


//        System.out.println(isPanagram(str));
//        patternSearch(str4,patt);
//        digitAfterDecimal(num);
//      //  oneExtraCharacter(s1,s2);
     
//      System.out.println("Size of Char"+ CHAR);
//       System.out.println("Check Anagram"+" "+isAnagram(s6,s7));
       
       
//     }

//     public static boolean isPanagram(String str){

//         int n = str.length();
//                 if(n<26)
//             return false;
//         boolean [] visited = new boolean[46];
//         for(int i=0; i<26; i++){
//             char ch = str.charAt(i);
//             if(ch>='a' && ch<'z')
//                 visited[ch-'a'] = true;
            
//             if(ch>='A' && ch<'Z')
//                 visited[ch-'A'] = true;
//             }
//             for(int i=0; i<26; i++){
//                 if(visited[i]==false)
//                     return false;
//             }           
//         return true;
//     }

//     public static void patternSearch(String str4, String patt){
//             int pos = str4.indexOf(patt);
//             while(pos >=0){
//             System.out.println(pos+" ");
//             pos = str4.indexOf(patt, pos+1);
//          }
//     }

//     public static void digitAfterDecimal(String num){
//             // int pos = num.indexOf('.');
//             //     if(pos <0)
//             //         System.out.println("null");
//             //     else
//             //         System.out.println(num.substring(pos+1,6));
//             int pos =0;
//            String str = "";
//             for(int i=0; i<num.length(); i++){
//             char ch = num.charAt(i);
//             if(ch == '.'){
//                 pos = i+1;
//                 str = appendChar(num, pos);   
//              }                    
//        }
//        System.out.println("Trimmmed String is: "+str);
//    }
//    public static String appendChar(String str, int pos){
//         StringBuffer sb = new StringBuffer();
//         for(int i=pos; i<str.length(); i++){
//             sb.append(str.charAt(i));
//         }
//         return sb.toString();
//    }

//    // METHOD -1   convet into toCharArray() --> Sort then return last INDEX of char
// //    public static char oneExtraCharacter(String str, String check){
// //         char [] c1 = str.toCharArray();
// //         char [] c2 = check.toCharArray();
// //         Arrays.sort(c1);
// //         Arrays.sort(c2);
// //         char c;
// //         int size = c1.length >c2.length ? c1.length:c2.length;
// //         for(int i=0; i<size;){
// //             if(c1[i]!=c2[i])
// //                 return c2[i];
// //             return c2[size];
// //         }
// //    }

//    public static boolean isAnagram (String str1,String str2){
        
//         if(str1.length() == str2.length())
//                 return false;
//         int [] count = new int[CHAR];
//         for(int i=0; i<str1.length(); i++){
//              count[str1.charAt(i)]++;
//              count[str2.charAt(i)]--;
//         }
//         for(int i=0; i<CHAR; i++)
//             if(count[i] !=0)
//                 return false;
//         return true;
//    }

// }
