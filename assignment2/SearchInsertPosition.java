public class SearchInsertPosition {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6};
        int target = 2;
        //flag for identifying if we have to insert at the end 
        int flag = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>=target){
                flag =1;
                System.out.println(i);
                break;
            }
        }
        if(flag==0){
            System.out.println(arr.length);
        }
    }
}
