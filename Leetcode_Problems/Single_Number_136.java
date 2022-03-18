// Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.

// You must implement a solution with a linear runtime complexity and use only constant extra space.

class Solution {
    public int singleNumber(int[] nums) {
        
        for(int i=0;i<nums.length;i++){
            int temp=nums[i];
            boolean pre = false;
            for(int j=0;j<nums.length;j++){
                
                if(nums[j]==temp && i!=j)
                {
                    pre=true;
                }
            }
            if(pre==false){
                return nums[i];
            }
        }
        return 0;
    }
}