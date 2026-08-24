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
