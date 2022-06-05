class Solution {
    public List<List<Integer>> generate(int numRows) {
        if(numRows == 1) {
            List<List<Integer>> rows = new ArrayList<>();
            rows.add(new ArrayList<Integer>());
            rows.get(0).add(1);
            return rows;
        } else if(numRows == 2) {
            List<List<Integer>> rows = generate(1);
            rows.add(new ArrayList<Integer>());
            rows.get(1).add(1);
            rows.get(1).add(1);
            return rows;
        }
        List<List<Integer>> rows = generate(numRows - 1);
        rows.add(new ArrayList<Integer>());
        rows.get(numRows - 1).add(1);
        for(int i = 1; i < numRows - 1; i++)
            rows.get(numRows - 1).add(rows.get(numRows - 2).get(i-1) + rows.get(numRows - 2).get(i));
        rows.get(numRows - 1).add(1);
        return rows;
    }
}