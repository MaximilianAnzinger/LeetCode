class Solution {
    public int computeArea(int ax1, int ay1, int ax2, int ay2, int bx1, int by1, int bx2, int by2) {
        return area(ay2, ay1, ax1, ax2) + area(by2, by1, bx1, bx2) - overlap(ax1, ay1, ax2, ay2, bx1, by1, bx2, by2);
    }
    
    public int overlap(int ax1, int ay1, int ax2, int ay2, int bx1, int by1, int bx2, int by2) {
        int t = Math.min(ay2, by2);
        int b = Math.max(ay1, by1);
        int l = Math.max(ax1, bx1);
        int r = Math.min(ax2, bx2);
        if(l<r && b<t)
             return (t-b)*(r-l);
        return 0;
    }
    
    public int area(int t, int b, int l, int r) {
        return (t - b) * (r - l);
    }
}