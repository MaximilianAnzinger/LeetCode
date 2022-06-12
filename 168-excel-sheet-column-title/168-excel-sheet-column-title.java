class Solution {
    public String convertToTitle(int columnNumber) {
        StringBuilder out = new StringBuilder();
        while(columnNumber != 0) {
            columnNumber--;
            out.append((char) ((columnNumber%26) + 'A'));
            columnNumber /= 26;
        }
        return out.reverse().toString();
    }
}