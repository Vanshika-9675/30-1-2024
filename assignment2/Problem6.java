public class Problem6 {
    public static void main(String[] args) {
        int arr[] = {4,5,1};
        int arr2[] ={3,4,5};
        int sum1=0,sum2=0;
        for(int i=0;i<arr.length;i++){
            sum1 = sum1*10+arr[i];
        }
        for(int i=0;i<arr2.length;i++){
            sum2 = sum2*10+arr2[i];
        }
        System.out.println(sum1+sum2);
    }
}
