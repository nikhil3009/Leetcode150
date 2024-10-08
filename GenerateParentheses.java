public class GenerateParentheses {
    public List<String> generateParenthesis(int n) {
        int open = n;
        int close = n;
        List<String> ans = new ArrayList<>();
        String out = "";
        generate(open,close,ans,out);
        return ans;
    }
    public void generate(int open, int close, List<String> ans,String out){
        if(open == 0 && close == 0){
            ans.add(out);
            return;
        }
        if(open !=0){
            String op1 = out;
            op1 += "(";
            generate(open-1,close,ans,op1);
        }
        if(close>open){
            String op2 = out;
            op2+=")";
            generate(open,close-1,ans,op2);
        }
    }
}
