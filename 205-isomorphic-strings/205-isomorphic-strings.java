class Solution {
    public boolean isIsomorphic(String s, String t) {
        int[] smap = new int[128];
        int[] tmap = new int[128];
        for(int i = 0; i < s.length(); i++)
            if(smap[s.charAt(i)] != tmap[t.charAt(i)])
                return false;
            else if(smap[s.charAt(i)] == 0)
                smap[s.charAt(i)] = tmap[t.charAt(i)] = i + 1;
        return true;
    }
}