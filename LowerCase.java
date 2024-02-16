/** String processing exercise 1. */
public class LowerCase {
    public static void main(String[] args) {  
        String str = "";
        if (args.length > 0){
            str = args[0];
        }
        System.out.println(lowerCase(str));
    }

   /**
    * Returns a string which is identical to the original string, 
    * except that all the upper-case letters are converted to lower-case letters.
    * Non-letter characters are left as is.
    */
    public static String lowerCase(String s) {
        // Replace the following statement with your code
        String ans = "";
        int i = 0;
        while(i < s.length()){
            char ch = s.charAt(i);
            if((ch >= 'A' && ch <= 'Z')){
                ans = ans + (char)(ch + 32);
            } else {
                ans = ans + ch;
            }
            i++;
        }
         return ans;
    }
}