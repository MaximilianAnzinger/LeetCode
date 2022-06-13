class Solution {
    public int removeCoveredIntervals(int[][] intervals) {
        Arrays.sort(intervals, new Comparator<int[]>() {
            @Override
            public int compare(int[] a, int[] b) {
                if(a[0] == b[0])
                    return b[1] - a[1];
                return a[0] - b[0];
            }
        });
        
        int r = intervals.length;
        int[] i = new int[] {-1, -1};
        for(int[] interval : intervals)
            if( i[0] <= interval[0] && interval[1] <= i[1])
                r--;
            else
                i = interval;
        return r;
    }
}