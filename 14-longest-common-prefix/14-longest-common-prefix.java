class Solution {

    public static String lcp(String[] strs, int a, int b) {
        if(a == b)
            return strs[a];
       
        int m = a + (b-a)/2;
        
        String left = lcp(strs, a, m);
        String right = lcp(strs, m+1, b);
        String lcp = "";
        for(int l = 0, r = 0; l < left.length() && r < right.length(); l++, r++)
            if(left.charAt(l) == right.charAt(r))
                lcp += left.charAt(l);
            else break;
        return lcp;
    }
    
    public String longestCommonPrefix(String[] strs) {
        if(strs.length == 1) return strs[0];
        
        return lcp(strs, 0, strs.length-1);
    }
}