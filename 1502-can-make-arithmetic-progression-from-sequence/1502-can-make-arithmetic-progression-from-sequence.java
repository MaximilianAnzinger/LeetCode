class Solution {
    public boolean canMakeArithmeticProgression(int[] arr) {
        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
        for(int i : arr) {
            if(i < min)
                min = i;
            if(i > max)
                max = i;
        }
        
        if((max - min) % (arr.length - 1) != 0)
            return false;
        
        int i = 0, d = (max - min) / (arr.length - 1);
        while(i < arr.length) {
            if(arr[i] == min +  d * i)
                i++;
            else if((arr[i] - min) % d != 0)
                return false;
            else {
                int t = arr[i], p = (arr[i] - min) / d;
                if(p <= i || arr[p] == arr[i])
                    return false;
                arr[i] = arr[p];
                arr[p] = t;
            }
        }
        return true;
    }
}