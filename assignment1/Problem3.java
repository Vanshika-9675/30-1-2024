import java.util.*;
public class Problem3 {
    public static void main(String[] args) {
        HashMap<Integer, Integer> myHashMap = new HashMap<>();
        int arr[]= {1,1,1,2,3,3,3,4,4,4};
        for(int i=0;i<arr.length;i++){
            if(!myHashMap.containsKey(arr[i])){
                myHashMap.put(arr[i],1);
            }
            else{
                int currentVal = myHashMap.get(arr[i]);
                myHashMap.put(arr[i], currentVal + 1);
            }
        }
        for (Map.Entry<Integer, Integer> entry : myHashMap.entrySet()) {
            if (entry.getValue().equals(1)) {
                System.out.println(entry.getKey());
                break;
            }
        }
    }
}
