class Solution {
    public String removeDigit(String number, char digit) {
        int idx = 0;
        for(int i = 0; i < number.length(); i++)
            if(number.charAt(i) == digit) {
                idx = i;
                if(i < number.length() - 1 && digit < number.charAt(i + 1))
                    break;
            }
        StringBuilder res = new StringBuilder(number);
        res.deleteCharAt(idx);
        return res.toString();
    }
}