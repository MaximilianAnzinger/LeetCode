class Solution {
    public double average(int[] salary) {
        long sum = 0, min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
        for(int i : salary) {
            sum += i;
            min = (int) Math.min(min, i);
            max = (int) Math.max(max, i);
        }
        return ((double) (sum - min - max)) / ((double) salary.length - 2);
    }
}