//Brute Force Solution
//Time Complexity: O(n²)    &    Space Complexity: O(1)
public class two_sum {
    public static void main(String[] args) {
        int[] arr= {4,7,3,2,9};
        int target= 13;

        outer : for(int i=0;i<arr.length;i++){
            inner : for(int j=i+1;j<arr.length;j++){
                if(arr[i]+arr[j]==target){
                    System.out.println(arr[i]+" + "+arr[j]+" = "+target);
                    break outer;
                }
            }
        }
    }
}

//Optimized Solution (Using HashMap)
//Time Complexity: O(n)    &    Space Complexity: O(n)
class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            int requiredNum = target - nums[i];

            if(map.containsKey(requiredNum)){
                return new int[]{map.get(requiredNum), i};
            }
            map.put(nums[i], i);
        }
        return new int[]{};
    }
}
