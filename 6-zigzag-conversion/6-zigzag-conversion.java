class Solution {
    public String convert(String s, int numRows) {
        if(numRows == 1)
            return s;
        StringBuilder out = new StringBuilder();
        for(int r = 0; r < numRows; r++) {
            for(int i = r; i < s.length(); i += 2*(numRows-1)) {
                out.append(s.charAt(i));
                // second char at: i + 2*(numRows-1-r)
                int second_char = i + 2*(numRows-1-r);
                if (r != 0 && r != numRows-1 && second_char < s.length())
                    out.append(s.charAt(second_char));
            }
        }
        return out.toString();
    }
}