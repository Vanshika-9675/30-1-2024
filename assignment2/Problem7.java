//kth largest element
import java.util.*;
public class Problem7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> arr = new ArrayList<>();
        List<Integer> out = new ArrayList<>();
        System.out.println("Enter the size of array:");
        int n = sc.nextInt();
        System.out.println("Enter the array:");
        for(int i=0;i<n;i++){
            arr.add(sc.nextInt());
        }
        System.out.println("Enter the k:");
        int k = sc.nextInt();
        Collections.sort(arr);
        System.out.println("K largest elements:");
        for(int i=n-k;i<n;i++){
             System.out.print(arr.get(i)+" ");
        }
    }
}
