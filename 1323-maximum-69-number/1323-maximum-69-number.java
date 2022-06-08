class Solution {
    public int maximum69Number (int num) {
        int i = -1;
        for(int t = num, j = 0; t > 0; t /= 10, j++)
            if(t % 10 == 6)
                i = j;
        return i == -1 ? num : num + 3 * (int) Math.pow(10, i);
    }
}