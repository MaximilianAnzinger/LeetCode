public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        int r = 0;
        while(n != 0) {
            r += (n&1);
            n >>>= 1;
        }
        return r;
    }
}