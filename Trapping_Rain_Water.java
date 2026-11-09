//BRUTE FORCE APPROACH    (TLE on large dataSet)
//Time Complexity: O(n*2)  &  Space Complexity: O(1)
class Solution {
    public int trap(int[] height) {
        if(height==null || height.length<3) return 0;
        int water = 0;
        for(int i=1; i<height.length-1; i++){
            int l=i-1;
            int maxL=height[i];
            while(l>=0){
                maxL = Math.max(height[l],maxL);
                l--;
            }
            int r=i+1;
            int maxR=height[i];
            while(r<=height.length-1){
                maxR = Math.max(height[r],maxR);
                r++;
            }
            if(maxR<height[i] || maxL<height[i])    continue;
            else{
                water += Math.min(maxL,maxR) - height[i];
            }
        }
        return water;
    }
}



//BEST APPROACH    (uses 2 extra arrays to store leftMax & rightMax for each index)
//Time Complexity: O(n)    &    Space Complexity: O(n)
/*
class Solution {
    public int trap(int[] height) {
        if(height==null || height.length==0)    return 0;
        int water = 0;
        int n = height.length;
        int[] leftMax = new int[n];
        leftMax[0] = height[0];
        for(int i=1; i<=n-1; i++){
            leftMax[i] = Math.max(leftMax[i-1],height[i]);
        }
        int[] rightMax = new int[n];
        rightMax[n-1] = height[n-1];
        for(int i=n-2; i>=0; i--){
            rightMax[i] = Math.max(rightMax[i+1], height[i]);
        }
        for(int i=1; i<n-1; i++){
            water += Math.min(leftMax[i],rightMax[i]) - height[i];
        }
        return water;
    }
}
*/
