import java.util.*;

public class Problem9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> arr = new ArrayList<>();
        System.out.println("Enter the size of array:");
        int n = sc.nextInt();
        System.out.println("Enter the array:");
        for(int i=0;i<n;i++){
            arr.add(sc.nextInt());
        }
        Collections.sort(arr);
        int lastSmall = Integer.MIN_VALUE;
        int cnt = 0;
        int maxi = 1;
        for (int i = 0; i < n ; i++) {
            if(arr.get(i)-1 == lastSmall){
                cnt+=1;
                lastSmall = arr.get(i);
            }
            else if(arr.get(i)!=lastSmall){
                 cnt=1;
                 lastSmall = arr.get(i);
            }
        }
        maxi = Math.max(cnt, maxi);
        System.out.println(maxi);
    }
}
