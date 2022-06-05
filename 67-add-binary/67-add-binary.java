class Solution {
    public String addBinary(String a, String b) {
        int i = a.length() - 1, j = b.length() - 1, carry = 0;
        StringBuilder result = new StringBuilder();
        while(0 <= i || 0 <= j) {
            if(0 <= i) carry += a.charAt(i--) - '0';
            if(0 <= j) carry += b.charAt(j--) - '0';
            result.append((char) ((carry % 2) + '0'));
            carry /= 2;
        }
        if(carry != 0)
            result.append('1');
        return result.reverse().toString();
    }
}