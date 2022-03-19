class Solution {
    public boolean isMonotonic(int[] nums) {
        int len=nums.length;
        int k=nums[0];
        int m=nums[len-1];
        if(k<=m){
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]<=nums[i+1]){
                continue;
            }
            else{
                return false;
            }
        }
        }
        if(k>=m){
        for(int j=nums.length-1;j>=1;j--){
            if(nums[j]<=nums[j-1]){
                continue;
            }
            else{
                return false;
            }
        }
        }
        return true;
    }
}