class Solution {
    public boolean isUgly(int n) {
        if (n <= 0)
            return false;
        for (int i = 5; i >= 2; i--)
            while (n % i == 0)
                n /= i;
        return n == 1; 
    }
}