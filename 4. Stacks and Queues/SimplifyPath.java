import java.util.*;
public class SimplifyPath {

    public String simplifyPath(String path){
        Stack<Character> stack = new Stack();
        for(char c : path.toCharArray()){
            stack.push(c);
        }
        StringBuilder ans = new StringBuilder();
        
        while(!stack.isEmpty()){
            System.out.println("ans is " + ans.length() + " " + ans.toString());
            // push the next character
            ans.append(stack.pop());

            if(stack.peek() == '/' && ans.charAt(ans.length()) == '/'){
                stack.pop();
            }
            
        
        }
        return ans.toString();
    }

    public static void main(String[] args){
        SimplifyPath sp = new SimplifyPath();

        String path1 = "/home/";
        String path2 = "/home//foo/";
        String path3 = "/home/user/Documents/../Pictures";

        // String path1Test = "/home";

        String path1Ans = "/home";
        String path2Ans = "/home/foo";
        String path3Ans = "/home/user/Pictures";

        System.out.println("Path 1 Input: " + path1);
        System.out.println("Path 1 Ans: " + path1Ans);
        System.out.println("Act Output: " + sp.simplifyPath(path1));
        System.out.println("Output: " + path1Ans.equals(sp.simplifyPath(path1)));
        System.out.println("Path 2 Input: " + path2);
        System.out.println("Path 2 Ans: " + path2Ans);
        System.out.println("Act Output: " + sp.simplifyPath(path2));
        System.out.println("Output: " + path2Ans.compareTo(sp.simplifyPath(path2)));
        System.out.println("Path 3 Input: " + path3);
        System.out.println("Path 3 Ans: " + path3Ans);
        System.out.println("Act Output: " + sp.simplifyPath(path3));
        System.out.println("Output: " + path3Ans.compareTo(sp.simplifyPath(path3)));
        
        
    
    }
}
