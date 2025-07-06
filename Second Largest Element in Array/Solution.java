class Solution {
    public int getSecondLargest(int[] arr) {
int sl = -1;
int l =arr[0];
for(int i=0;i<arr.length;i++){
    if(arr[i] > l ){
        sl = l;
        l=arr[i];
    }
    else if(arr[i] < l && arr[i] > sl){
        sl = arr[i];
        
    } 
}
return sl;
    }
}