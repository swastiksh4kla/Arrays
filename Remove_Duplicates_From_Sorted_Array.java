//----Leetcode Solution Block----
//Time Complexity: O(n)  & Space Complexity: O(1)
class Solution {
    public int removeDuplicates(int[] nums) {
        int unique=0;

        for(int i=1;i<nums.length;i++){
            if(nums[i]!=nums[unique]){
                unique++;
                nums[unique]= nums[i];
            }
        }
        return unique+1;
    }
}


//----Local Testing Block----
//Time Complexity: O(n)  & Space Complexity: O(1)
import java.util.Arrays;
public class removeDup {
    public static void main(String[] args) {
        int[] arr= {1,2,1,4,2,3,2};
        int unique=0;
        Arrays.sort(arr);
        
        for(int i=1;i<arr.length;i++){
            if(arr[i]!=arr[unique]){
                unique++;
                arr[unique]=arr[i];
            }
        }
        
        System.out.println();
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }

    }
}
