import java.util.*;
public class mergeSort {
    public static void mergeSort(ArrayList arr,int low,int high){
        if (low >= high) return;
        int mid = (low + high) / 2 ;
        mergeSort(arr, low, mid);  // left half
        mergeSort(arr, mid + 1, high); // right half
        merge(arr, low, mid, high);  // merging sorted halves
    }
    public static void merge(ArrayList arr,int low,int mid,int high){
        ArrayList<Integer> temp = new ArrayList<>(); 
        int left = low;      
        int right = mid + 1;   

        while (left <= mid && right <= high) {
            if ((int)arr.get(left) <= (int)arr.get(right)) {
                temp.add((int)arr.get(left));
                left++;
            } else {
                temp.add((int)arr.get(right));
                right++;
            }
        }
        while (left <= mid) {
            temp.add((int)arr.get(left));
            left++;
        }

        while (right <= high) {
            temp.add((int)arr.get(right));
            right++;
        }

        // transfering all elements from temporary to arr 
        for (int i = low; i <= high; i++) {
            arr.set(i,temp.get(i - low));
        }  
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<>();
        System.out.println("Enter the size of array:");
        int n = sc.nextInt();
        System.out.println("Enter the array:");
        for(int i=0;i<n;i++){
            arr.add(sc.nextInt());
        }
        mergeSort(arr,0,n-1);
        System.out.println(arr);
    }
}
