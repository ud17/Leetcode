public class MyHashSet {

    int[] arr = new int[1000001];
   
    public MyHashSet() {
        Arrays.fill(arr,-1);
    }
    
    public void add(int key) {
        arr[key] = key;
    }
    
    public void remove(int key) {
        arr[key]=-1;
    }
    
    public boolean contains(int key) {
        int ans = arr[key];
        if(ans==-1){
            return false;
        }
        return true;
    }
}