class Solution {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        UnionFind[] v = new UnionFind[n];
        for(int i = 0; i < n; i++)
            v[i] = new UnionFind(i, null);
        for(int[] e : edges)
            union(v[e[0]], v[e[1]]);
        return find(v[source]) == find(v[destination]);
    }
    
    private void union(UnionFind a, UnionFind b) {
        a = find(a);
        b = find(b);
        if(a == b)
            return;
        if(a.r < b.r)
            a.parent = b;
        else if(b.r < a.r)
            b.parent = a;
        else {
            a.parent = b;
            b.r++;
        }
    }
    
    private UnionFind find(UnionFind e) {
        if(e.parent ==  null)
            return e;
        e.parent = find(e.parent);
        return e.parent;
    }
    
    private class UnionFind {
        
        int val, r;
        UnionFind parent;
        
        UnionFind(int val, UnionFind parent) {
            this.val = val;
            r = 0;
            this.parent = parent;
        }
    }
}