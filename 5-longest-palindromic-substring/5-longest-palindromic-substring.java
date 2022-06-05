class Solution {
    
    public String longestPalindrome(String s) { // Manacher's algorithm
        String str = "-" + s.chars().mapToObj(c -> {
			return "" + (char) c;
		}).collect(Collectors.joining("-")) + "-";
        
        int[] radii = new int[str.length()];
        
        int c = 0, r = 0, c_old, r_old, c_m, r_max;
        
        while(c < radii.length) {
            while(c-r-1 >= 0 && c+r+1 < radii.length && str.charAt(c-r-1) == str.charAt(c+r+1))
                r++;
            radii[c] = r;
            c_old = c;
            r_old = r;
            c++;
            r=0;
            while(c <= c_old + r_old) {
                c_m = 2 * c_old - c;
                r_max = c_old + r_old - c;
                if(radii[c_m] < r_max)
                    radii[c++] = radii[c_m];
                else if(r_max < radii[c_m])
                    radii[c++] = r_max;
                else {
                    r = r_max;
                    break;
                }
            }
        }
        
        int max = 0;
        int index = 0;
        for(int i = 0; i < radii.length; i++)
            if(max < radii[i]) {
                max = radii[i];
                index = i;
            }
        
        String result = "";
        
        for(int i = index - max + 1; i < index + max; i+= 2)
            result += str.charAt(i);
        
        return result;
    }
}