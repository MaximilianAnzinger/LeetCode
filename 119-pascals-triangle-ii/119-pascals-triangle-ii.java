class Solution {
    public List<Integer> getRow(int rowIndex) {
        if(rowIndex == 0)
            return Arrays.asList(1);
        else if(rowIndex == 1)
            return Arrays.asList(1, 1);
        List<Integer> r = getRow(1), t;
        while(1 < rowIndex--) {
            t = new ArrayList();
            t.add(1);
            for(int i = 1; i < r.size(); i++)
                t.add(r.get(i-1) + r.get(i));
            t.add(1);
            r = t;
        }
        return r;
    }
}