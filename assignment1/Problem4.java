import java.util.*;
public class Problem4 {
    public static void main(String[] args) {
        int arr[] = {1,1,2,2,3,3,5,5,6,6,7};
        Arrays.sort(arr);
        int i=0;
        int flag=0;
        while(i<arr.length-1){
           if(arr[i]!=arr[i+1]){
              System.out.println(arr[i]);
              flag=1;
              break;
           }
           i+=2;
        }
        if(flag==0){
            System.out.println(arr[arr.length-1]);
        }
    }
}
