public class LengthofLastWord {
    public int lengthOfLastWord(String s) {
        String cur[] = s.split(" ");
        return cur[cur.length-1].length();
    }
}
