class Solution {
    public List<String> letterCombinations(String digits) {
        String[] mapping = new String[] {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        List<String> res = new ArrayList<String>(), tmp = new ArrayList<String>();
        for(int i = 0; i < digits.length(); i++) {
            for(int j = 0; j < mapping[digits.charAt(i) - '0'].length(); j++)
                if(i == 0)
                    tmp.add("" + mapping[digits.charAt(i) - '0'].charAt(j));
                else
                    for(String s : res)
                        tmp.add(s + mapping[digits.charAt(i) - '0'].charAt(j));
            res = tmp;
            tmp = new ArrayList<String>();
        }
        return res;
    }
}