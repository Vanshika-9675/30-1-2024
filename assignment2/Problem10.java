//Selection sort
import java.util.*;
public class Problem10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> arr = new ArrayList<>();
        System.out.println("Enter the size of array:");
        int n = sc.nextInt();
        System.out.println("Enter the array:");
        for(int i=0;i<n;i++){
            arr.add(sc.nextInt());
        }
        for(int i=0;i<n-1;i++){
            int min = i;
            for(int j=i+1;j<n;j++){
                if(arr.get(j)<arr.get(min)){
                    min=j;
                }
            }
            if(min!=i)
            Collections.swap(arr, i, min);
        }
        System.out.println(arr);
    }
}
