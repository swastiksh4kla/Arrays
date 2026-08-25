//----Leetcode Solution Block----
//Time Complexity: O(n)  &  Space Complexity: O(1)
class Solution {
    public int[] productExceptSelf(int[] nums) {
        int leftProd=1;
        int rightProd=1;
        int[] returnArr= new int[nums.length];
        for(int i=0;i<nums.length;i++){
            returnArr[i]= leftProd;
            leftProd= leftProd*nums[i];
        }
        for(int i=nums.length-1;i>=0;i--){
            returnArr[i]= returnArr[i]*rightProd;
            rightProd= rightProd*nums[i];
        }
        return returnArr;
    }
}

//----Local Testing Block----
//Time Complexity: O(n)  &  Space Complexity: O(1)
public class ProdExcepSelf {
    public static void main(String[] args) {
        int[] arr= {1,2,3,4};
        int[] prodArr= new int[arr.length];
        int leftProd=1;
        int rightProd=1;
        for(int i=0;i<arr.length;i++){
            prodArr[i]= leftProd;
            leftProd= leftProd*arr[i];
        }
        for(int i=arr.length-1;i>=0;i--){
            prodArr[i]= prodArr[i]*rightProd;
            rightProd= rightProd*arr[i];
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(prodArr[i]+" ");
        }
    }
}
