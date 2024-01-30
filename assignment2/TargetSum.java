import java.util.*;
public class TargetSum {
    public static int helper(ArrayList<Integer> arr,int i,int target,int sum) {
        if(sum==target && i==arr.size()){
            return 1;
        }
        if(sum!=target && i>=arr.size()){
            return 0;
        }
        return helper(arr,i+1,target,sum+arr.get(i)) + helper(arr, i+1, target, sum-arr.get(i));
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
        System.out.println("Enter the target:");
        int target = sc.nextInt();
        int sum=0;
       System.out.println(helper(arr,0,target,sum));
    }
}
