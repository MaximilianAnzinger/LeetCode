class Solution {
    
    public int romanToInt(String s) {
        char prev = '-', current;
        int result = 0;
        
        for(int i = s.length()-1; 0 <= i; i--) {
            current = s.charAt(i);
            switch(current) {
                case 'I':
                    if(prev == 'V' || prev == 'X') result -= 1;
                    else result += 1;
                    break;
                case 'V':
                    result += 5;
                    break;
                case 'X':
                    if(prev == 'L' || prev == 'C') result -= 10;
                    else result += 10;
                    break;
                case 'L':
                    result += 50;
                    break;
                case 'C':
                    if(prev == 'D' || prev == 'M') result -= 100;
                    else result += 100;
                    break;
                case 'D':
                    result += 500;
                    break;
                case 'M':
                    result += 1000;
                    break;
                default: break;
            }
            prev = current;
        }
        return result;
    }
}