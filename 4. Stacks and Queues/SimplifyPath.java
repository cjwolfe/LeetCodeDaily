import java.util.*;
public class SimplifyPath {

    public String simplifyPath(String path){
        Stack<Character> stack = new Stack();
        String ans = path;

        return ans;
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

        System.out.println("Path 1: " + path1);
        System.out.println("Path 1 Ans: " + path1Ans);
        System.out.println("Output: " + path1Ans.equals(sp.simplifyPath(path1)));
        System.out.println("Path 1: " + path2);
        System.out.println("Path 1 Ans: " + path2Ans);
        System.out.println("Output: " + path2Ans.compareTo(sp.simplifyPath(path2)));
        System.out.println("Path 1: " + path3);
        System.out.println("Path 1 Ans: " + path3Ans);
        System.out.println("Output: " + path3Ans.compareTo(sp.simplifyPath(path3)));
        
        
    
    }
}
