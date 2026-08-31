//Using Gauss's Formula (risk of integer overflow)
//Time Complexity: O(n)    &    Space Complexity: O(1)
public class MissingNumber {
    public static void main(String[] args) {
        //using long variable to avoid number overflow bugs
        long[] arr= {5,3,1,4};
        long n= arr.length+1;
        long sum= n*(n+1)/2;
        long arrSum= 0;
        for(int i=0;i<arr.length;i++){
            arrSum+=arr[i];
        }
        System.out.println(sum-arrSum);
    }
}

//Using XOR(^) Operator to avoid overflow
//Time Complexity: O(n)    &    Space Complexity: O(1)
class Solution {
    public int missingNumber(int[] nums) {
        int xor= 0;
        for(int i=0; i<=nums.length; i++){
            xor ^= i;
        }
        for(int x: nums){
            xor ^= x;
        }
        return xor;
    }
}
