import java.util.*;
public class Problem2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int n= sc.nextInt();
        List<Integer> myList = new ArrayList<Integer>();
        System.out.println("Enter the array elements");
        for(int i=0;i<n;i++){
            myList.add(sc.nextInt());
        }
        System.out.println("Enter the index:");
        int m= sc.nextInt();
        int k = m+1;
        int j = n-1;
        while(k<j){
            Collections.swap(myList, k++, j--);
        }
        System.out.println(myList);
    } 
}
