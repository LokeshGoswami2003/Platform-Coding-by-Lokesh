class Solution {
    public int pivotIndex(int[] nums) {
        int arrsum=0;
        for(int i=0;i<nums.length;i++){
            arrsum+=nums[i];
        }
        int leftsum=0;
        for(int i=0;i<nums.length;i++){
            if(leftsum==(arrsum-leftsum-nums[i]))
                return i;
            leftsum+=nums[i];
        }
        return -1;
    }
}