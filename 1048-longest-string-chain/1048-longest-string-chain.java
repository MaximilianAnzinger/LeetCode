class Solution {
    public int longestStrChain(String[] words) {
        HashMap<String, Integer> dp = new HashMap<>();
        Arrays.sort(words, (a, b) -> a.length() - b.length());
        int res = 0, curr;
        for (String word : words) {
            curr = 0;
            StringBuilder left = new StringBuilder(), right = new StringBuilder(word);
            right.deleteCharAt(0);
            for (int i = 0; i < word.length(); i++) {
                curr = (int) Math.max(curr, dp.getOrDefault(left.toString() + right.toString(), 0) + 1);
                left.append(word.charAt(i));
                if(right.length() != 0)
                    right.deleteCharAt(0);
            }
            dp.put(word, curr);
            res = (int) Math.max(res, curr);
        }
        return res;
    }
}