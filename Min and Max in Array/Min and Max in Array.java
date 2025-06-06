// User function Template for Java
// User function Template for Java


class Pair<K, V> {
    private final K key;
    private final V value;

    public Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }
}



class Max_in_Array {
    public Pair<Integer, Integer> getMinMax(int[] arr) {
        // Code Here
        int maximum = 0;
        int minimum =Integer.MAX_VALUE;
        
        for(int i=0;i<arr.length;i++){
            if(arr[i] > maximum){
                maximum = arr[i];
            }
            if(arr[i] < minimum){
                minimum = arr[i];
            }
        }
        return new Pair<>(minimum,maximum);
        
    }
}
