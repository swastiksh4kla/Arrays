//Time Complexity: O(n)  & Space Complexity: O(1)
class Solution {
    public int removeDuplicates(int[] nums) {
        int hold = 0;
        int run = 1;

        while(run<nums.length){
            if(nums[hold]!=nums[run]){
                hold++;
                nums[hold] = nums[run];
            }
            else{
                run++;
            }
        }
        return hold+1;
    }
}
