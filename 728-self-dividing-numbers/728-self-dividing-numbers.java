class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        ArrayList<Integer> res = new ArrayList<>();
        A: for(int i = left; i <= right; i++) {
            int n = i, d;
            while(n > 0) {
                if((d = n%10) == 0 || i%d != 0)
                    continue A;
                else
                    n /= 10;
            }
            res.add(i);
        }
        return res;
    }
}