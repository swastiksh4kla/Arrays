//BRUTE FORCE  (TLE on large dataSet)
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
