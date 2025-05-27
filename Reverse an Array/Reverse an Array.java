class Solution {
    public void reverseArray(int arr[]) {
    int n = arr.length;
    int temp = 0;
    int i=0;
    while(i < n/2){
        temp = arr[i];
        arr[i] = arr[n - i - 1];
        arr[n-i-1] = temp;
        i++;
    }
    // for(int j=0;j<n;j++){
    //     System.out.print(arr[j]+" ");
    // }
        
    }
}