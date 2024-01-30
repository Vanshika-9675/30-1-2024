import java.util.*;
public class Problem3 {
    public static void main(String[] args) {
        //range 1 to 6
        int arr[] = {1,2,2,4};
        Arrays.sort(arr);
        int n= arr.length;
        int repeatedEle=0;
        int sum=0;
        for(int i=0;i<arr.length-1;i++){
            sum+=arr[i];
            if(arr[i]==arr[i+1]){
                repeatedEle= arr[i];
            }
        }
        sum+=arr[n-1];
        int total = n*(n+1)/2;
        sum = sum - repeatedEle;

 
        System.out.println(repeatedEle+" "+(total-sum));
    }
}
