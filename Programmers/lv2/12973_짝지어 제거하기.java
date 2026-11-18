class Solution
{
    public int solution(String s)
    {
        StringBuilder st = new StringBuilder();
        for(int i = 0; i < s.length(); i ++) {
            if(st.length() == 0) {
                st.append(s.charAt(i));
            } else {
                if(st.charAt(st.length() - 1) == s.charAt(i)) {
                st.deleteCharAt(st.length() - 1);
                } else {
                    st.append(s.charAt(i));
                }    
            }
        } //for
        
        return st.length() == 0 ? 1 : 0;
    } //main
} // class

/*
시간복잡도 O(n)
*/
