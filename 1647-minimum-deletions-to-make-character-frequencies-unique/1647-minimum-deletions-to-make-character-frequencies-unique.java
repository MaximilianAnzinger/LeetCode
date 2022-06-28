class Solution {
    public int minDeletions(String s) {
        int count[] = new int[26];
        for (char c : s.toCharArray())
            count[c - 'a']++;
        Arrays.sort(count);
        int valid = count[25], last = valid;
        for (int i = count.length - 2; i >= 0 && count[i] != 0 && last != 0; i--) {
            last = count[i] < last - 1 ? count[i] : last - 1;
            valid += last;
        }
        return s.length() - valid;
    }
}