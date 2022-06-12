class Solution {
    public boolean isHappy(int n) {
        while(n != 1) {
            if(n == 16)
                return false;
            int t = 0;
            while(n > 0) {
                t += Math.pow(n%10, 2);
                n /= 10;
            }
            n = t;
        }
        return true;
    }
}