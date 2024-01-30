import java.util.*;
public class BubbleSort {
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
            for(int j=0;j<n-i-1;j++){
                if(arr.get(j+1)<arr.get(j))
                Collections.swap(arr,j+1,j);
            }
        }
        System.out.println(arr);
    }
}
