
class Solution {
    public int findMinDiff(ArrayList<Integer> arr, int m) {
        Collections.sort(arr);
        
        int min = Integer.MAX_VALUE;
        int j=0;
        int diff =0;
        while(j+m-1 < arr.size() ){
            diff = arr.get(j+m-1) - arr.get(j);
            min = (diff<min)?diff:min;
            j++;
        }
        return min;
    }
}e