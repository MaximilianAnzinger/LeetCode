class Solution {
    public int[] plusOne(int[] digits) {
        for(int i = digits.length - 1; 0 <= i; i--)
            if(digits[i] == 9)
                digits[i] = 0;
            else {
                digits[i]++;
                break;
            }
        if(digits[0] == 0) {
            int[] result = new int[digits.length + 1];
            result[0] = 1;
            return result;
        }
        return digits;
    }
}