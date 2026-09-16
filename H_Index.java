//Time Complexity: O(nlogn)
//Space Complexity: O(nlogn)
class Solution {
    public int hIndex(int[] citations) {
        Arrays.sort(citations);
        //after sorting: [0,1,3,5,6]
        int count = 0;
        for(int i=citations.length-1; i>=0; i--){
            if(citations[i]>=count+1){      //use count as index
                count++;
            }
            else{
                break;
            }
        }
        return count;
    }
}
