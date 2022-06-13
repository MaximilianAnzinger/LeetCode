class Solution {
    public int maxDistance(int[] nums1, int[] nums2) {
        int i = 0, j = 0, r = 0;
        while (i < nums1.length && j < nums2.length)
            if (nums2[j] < nums1[i])
                i++;
            else
                r = Math.max(r, j++ - i);
        return r;
    }
}