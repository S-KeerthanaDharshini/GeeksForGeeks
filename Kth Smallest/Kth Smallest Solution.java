// User function Template for Java
import java.util.Collections;
class Solution {
    public static int kthSmallest(int[] arr, int k) {
        // Your code here
        PriorityQueue<Integer> obj = new PriorityQueue<>(Collections.reverseOrder());
        for(int num : arr){
            obj.offer(num);
            if(obj.size()> k){
                obj.poll();
            }
        }
        return obj.poll();
    }
}
