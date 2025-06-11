
class Solution {
    static boolean pairInSortedRotated(int arr[], int target) {
        // Your code here
        HashSet<Integer> hash = new HashSet<>();
        int rem = 0;
        for(int i =0;i<arr.length;i++){
            rem = target - arr[i];
            if(hash.contains(rem)){
                return true;
            }
            hash.add(arr[i]);
        }
        return false;
    }
}
