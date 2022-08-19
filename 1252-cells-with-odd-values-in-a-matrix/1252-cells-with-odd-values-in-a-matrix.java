class Solution {
    public int oddCells(int m, int n, int[][] indices) {
        boolean[] rows = new boolean[m], cols =  new boolean[n];
        for(int[] e : indices) {
            cols[e[1]] ^= true;
            rows[e[0]] ^= true;
        }
        int c = (int) IntStream.range(0, cols.length).mapToObj(x -> cols[x]).filter(x -> {return x;}).count();
        int r = (int) IntStream.range(0, rows.length).mapToObj(x -> rows[x]).filter(x -> {return x;}).count();
        return c*m + r*n - 2*c*r;
    }
}