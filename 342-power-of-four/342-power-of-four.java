class Solution {
    public boolean isPowerOfFour(int n) {
        if(n < 1) {
            return false;
        }
        while((n & 3) == 0){
            n >>= 2;
        }
        return n == 1;
    }
}