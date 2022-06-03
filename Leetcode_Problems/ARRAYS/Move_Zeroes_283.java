class Solution {
    public void moveZeroes(int[] nums) {
        int insertpointer=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                nums[insertpointer]=nums[i];
                insertpointer++;
            }
        }
        while(insertpointer<nums.length){
            nums[insertpointer]=0;
            insertpointer++;
        }
    }
}