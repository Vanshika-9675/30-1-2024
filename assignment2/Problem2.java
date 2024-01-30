import java.util.*;
public class Problem2 {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<Integer>(Arrays.asList(1,1,1,2,2,2,3,3,3,3));
        int i=0;
        while(i<arr.size()-1){
            if (arr.get(i)==arr.get(i+1)) {
                arr.remove(i+1);
                continue;
            }
            i++;
        }
        System.out.println(arr.size());
    }
}
