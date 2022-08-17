class Solution {
    public String removeDuplicates(String s) {
        LinkedList<Character> st = new LinkedList<>();
        for(int i = 0; i < s.length(); i++)
            if(!st.isEmpty() && s.charAt(i) == st.peekLast())
                st.removeLast();
            else
                st.add(s.charAt(i));
        return st.stream().map(String::valueOf).collect(Collectors.joining());
    }
}