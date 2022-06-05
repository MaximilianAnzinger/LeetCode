class Solution {
    public int myAtoi(String s) { // TODO leading white space && cut if other char
        boolean empty = true;
        int result = 0, sign = 0, t;
        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == ' ' && empty)
                continue;
            else if(s.charAt(i) == '+' && sign == 0) {
                empty = false;
                sign = 1;
            } else if(s.charAt(i) == '-' && sign == 0) {
                empty = false;
                sign = -1;
            } else if('0' <= s.charAt(i) && s.charAt(i) <= '9') {
                if(sign == 0)
                    sign = 1;
                empty = false;
                t = result * 10 + (s.charAt(i) - '0');
                if(result != t/10)
                    return sign > 0 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
                result = t;
            } else
                break;
        }
        return sign * result;
    }
}