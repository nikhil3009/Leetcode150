import java.util.Arrays;
import java.util.Stack;

public class SimplifyPath {
    public String simplifyPath(String path) {
        Stack<String> st = new Stack<>();
        for(String s : path.split("/")){
            if(!st.isEmpty()&& "..".equals(s)){
                st.pop();
            }
            else if(!Arrays.asList(".","..","").contains(s)){
                st.push(s);
            }
        }
        return "/" + String.join("/",st);
    }
}
