/** String processing exercise 2. */ 
public class UniqueChars {
    public static void main(String[] args) {  
        String str = "";
        if (args.length > 0){
            str = args[0];
        }
        System.out.println(uniqueChars(str));
    }
    /**
     * Returns a string which is identical to the original string, 
     * except that all the duplicate characters are removed,
     * unless they are space characters.
     */
    public static String uniqueChars(String s) {
        // Replace the following statement with your code
        String ans = "";
        int i = 0;
        while (i < s.length()){
            char current = s.charAt(i);
            if ((s.indexOf(current) == i) || (current == ' ') ){
                ans = ans + current;
            }
            i++;
        }
        return ans;
    }
}