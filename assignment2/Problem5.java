public class Problem5 {
    public static void main(String[] args) {
        int arr[] = {1,2,3};
        int l=2;
        int r=9;
        l-=1;
        int n=arr.length;
        int sum=0;
        while(l<r) {
             sum+=arr[l%n];
             l++;
        }
        System.out.println(sum);
    }
}
