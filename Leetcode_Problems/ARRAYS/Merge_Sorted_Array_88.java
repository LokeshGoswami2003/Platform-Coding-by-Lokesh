class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int inslast=m+n-1;
        n--;
        m--;
        while(m>=0 && n>=0){
            if(n<0)
                break;
            if(nums1[m]<nums2[n]){
                nums1[inslast]=nums2[n];
                n--;
                inslast--;
            }
            else if(nums1[m]>=nums2[n]){
                nums1[inslast]=nums1[m];
                m--;
                inslast--;
            }
        }
        while(n>=0){
            nums1[inslast]=nums2[n];
                n--;
                inslast--;
        }
        while(m>=0){
              nums1[inslast]=nums1[m];
                m--;
                inslast--;
        }
    }
}