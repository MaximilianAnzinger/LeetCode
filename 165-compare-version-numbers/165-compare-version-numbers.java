class Solution {
    public int compareVersion(String version1, String version2) {
        String[] v1 = version1.split("\\.");
        String[] v2 = version2.split("\\.");
        for(int i = 0; i < Math.max(v1.length, v2.length); i++) {
            int a = 0, b = 0;
            if(i < v1.length)
                a = Integer.parseInt(v1[i]);
            if(i < v2.length)
                b = Integer.parseInt(v2[i]);
            if(a != b)
                return a < b ? -1 : 1;
        }
        return 0;
    }
}