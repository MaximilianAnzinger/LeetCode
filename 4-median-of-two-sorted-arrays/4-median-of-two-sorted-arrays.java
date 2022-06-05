class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        if(nums1.length == 0) {
            if((nums2.length & 1) == 0) {
                return ((double) (nums2[nums2.length/2 - 1] + nums2[nums2.length/2]) / 2.0);
            } else {
                return (double) nums2[nums2.length/2];
            }
        }
        if(nums2.length == 0) {
            if((nums1.length & 1) == 0) {
                return ((double) (nums1[nums1.length/2 - 1] + nums1[nums1.length/2]) / 2.0);
            } else {
                return (double) nums1[nums1.length/2];
            }
        }
        
        int merged_half_length = (nums1.length + nums2.length)/2 + 1;
        int i = 0, j = 0, a = -1, b = -1;
        while(j + i < merged_half_length) {
            if( i != nums1.length && (j == nums2.length || nums1[i] < nums2[j])) {
                if(i+j == merged_half_length-2) {
                    a = nums1[i++];
                } else if(i+j == merged_half_length-1) {
                    b = nums1[i++];
                } else {
                    i++;
                }
            } else {
                if(i+j == merged_half_length-2) {
                    a = nums2[j++];
                } else if(i+j == merged_half_length-1) {
                    b = nums2[j++];
                } else {
                    j++;
                }
            }
        }
        
        if(((nums1.length + nums2.length) & 1) == 0) {
            return ((double) (a + b) / 2.0);
        } else {
            return (double) b;
        }
    }
}