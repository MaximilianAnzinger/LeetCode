class Solution {
    
    static String[] M = {"", "M", "MM", "MMM"};
    static String[] C = {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
    static String[] X = {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
    static String[] I = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
    
    public String intToRoman(int num) {
        StringBuilder out = new StringBuilder();
        out.append(M[num/1000]);
        out.append(C[(num%1000)/100]);
        out.append(X[(num%100)/10]);
        out.append(I[num%10]);
        return out.toString();
    }
}