//Time Complexity: O(n)
//Space Complexity: O(1)
class Solution {
    public int firstMissingPositive(int[] nums) {
        int i=0; 
        while(i<nums.length){
            int corrInd = nums[i] - 1;
            if(nums[i]>0 && nums[i]<=nums.length && nums[i]!=nums[corrInd]){
                int temp = nums[i]; //using cyclic sort
                nums[i] = nums[corrInd];
                nums[corrInd] = temp;
            }
            else i++;
        }
        for(int r=0; r<nums.length; r++){
            if(nums[r]!=r+1){
                return r+1;
            }
        }
        return nums.length+1;
    }
}
