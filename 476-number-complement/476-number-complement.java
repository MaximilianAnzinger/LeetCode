class Solution {
    public int findComplement(int num) {
        int mask = Integer.MAX_VALUE;
        while ((num & mask) != 0)
            mask <<= 1;
        return num ^ ~mask;
    }
}