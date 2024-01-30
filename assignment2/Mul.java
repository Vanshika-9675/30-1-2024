import java.util.*;

/**
 * Mul
 */
public class Mul {

    public static int helper(ArrayList list,int ind){
        int mul1=1,mul2=1;
             for(int i=0;i<ind;i++){
                int ele = (int)list.get(i);
                mul1= mul1 * ele;
             }
             for(int i=ind+1;i<list.size();i++){
                int ele = (int)list.get(i);
                mul2= mul2 * ele;
             }
             return mul1*mul2;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<>();
        ArrayList<Integer> out = new ArrayList<>();
        System.out.println("Enter the size of array:");
        int n = sc.nextInt();
        System.out.println("Enter the array:");
        for(int i=0;i<n;i++){
            arr.add(sc.nextInt());
        }
        for(int i=0;i<n;i++){
            out.add(i,helper(arr,i)); 
        }
        System.out.println(out);
    }
}