class Pair{
    String first;
    int second;
    Pair(String first, int second){
        this.first = first;
        this.second = second;
    }
}
class Solution {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        HashSet<String> st = new HashSet<>();
        int n = wordList.size();
        Queue<Pair> q = new LinkedList<>();
        for(int i=0;i<n;i++){
            st.add(wordList.get(i));
        }
        q.add(new Pair(beginWord,1));
        if(st.contains(beginWord)){
            st.remove(beginWord);
        }
        while(!q.isEmpty()){
            String cur = q.peek().first;
            int steps = q.peek().second;
            q.remove();
            if(endWord.equals(cur)){
                return steps;
            }
            for(int i=0;i<cur.length();i++){
                for(char j = 'a';j<='z';j++){
                    char[] rep = cur.toCharArray();
                    rep[i] = j;
                    String ne = new String(rep);
                    if(st.contains(ne)){
                        q.add(new Pair(ne,steps+1));
                        st.remove(ne);
                    }
                }
            }
        }
        return 0;
    }
}