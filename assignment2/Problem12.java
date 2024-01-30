//insertion sort
import java.util.*;
public class Problem12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> arr = new ArrayList<>();
        System.out.println("Enter the size of array:");
        int n = sc.nextInt();
        System.out.println("Enter the array:");
        for(int i=0;i<n;i++){
            arr.add(sc.nextInt());
        }
        for(int i=1;i<n;i++){
            int temp = arr.get(i);
            int j=i-1;
            while(j>=0 && arr.get(j)>temp){
              arr.set(j+1,arr.get(j));
              j--;
            }
            arr.set(j+1,temp);
        }
        System.out.println(arr);
    }
}
