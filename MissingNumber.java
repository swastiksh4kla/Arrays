public class MissingNumber {
    public static void main(String[] args) {
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
