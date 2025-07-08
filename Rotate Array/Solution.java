class Solution {
    // Function to rotate an array by d elements in counter-clockwise direction.
    static int temp=0;
    public static  void reverse(int[] arr,int start,int end){
            while(start <= end){
                temp=arr[start];
                arr[start]=arr[end];
                arr[end]=temp;
                start++;
                end--;
            }
        }
    static void rotateArr(int arr[], int d) {
        int n=arr.length;
        d=d%n;
        reverse(arr,0,d-1);
        reverse(arr,d,n-1);
        reverse(arr,0,n-1);
        
        
    }
}