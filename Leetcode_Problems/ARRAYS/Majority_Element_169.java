class Solution {
    public int majorityElement(int[] nums) {
        int hold = nums[0];
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == hold) {
                count++;
                continue;
            }

            if (nums[i] != hold)
                count--;
            if (count == 0) {
                hold = nums[i];
                count = 1;
            }
        }
        count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (hold == nums[i])
                count++;
        }
        if (count > (nums.length / 2))
            return hold;
        return -1;
    }
}