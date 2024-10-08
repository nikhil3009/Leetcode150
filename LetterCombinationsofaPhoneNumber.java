public class LetterCombinationsofaPhoneNumber {
    private Map<Character, String> digitToChar = Map.of(
        '2',
        "abc",
        '3',
        "def",
        '4',
        "ghi",
        '5',
        "jkl",
        '6',
        "mno",
        '7',
        "pqrs",
        '8',
        "tuv",
        '9',
        "wxyz"
    );
    public List<String> letterCombinations(String digits) {
        List<String> ans = new ArrayList<>();
        String cur = "";
        if(digits.length() == 0){
            return ans;
        }
        backtrack(digits,ans,cur,0);
        return ans;

    }
    public void backtrack(String digits,List<String> ans,String cur,int index){
        if(digits.length() == cur.length()){
            ans.add(cur);
            return;
        }
        else if(index>=digits.length()){
            return;
        }
        else{
            String digit = digitToChar.get(digits.charAt(index));
            for(char c : digit.toCharArray()){
                backtrack(digits,ans,cur+c,index+1);
            }
        }
    }
}
