import java.util.*;
public class mergekSort {
    public static void main(String[] args) {
        ArrayList<Integer> res = new ArrayList<>();
        int input[][]= {{1,2,3},{7,8,9,10},{2,4,9}};
        for(int i=0;i<input.length;i++){
            for(int j=0;j<input[i].length;j++){
                res.add(input[i][j]);
            }
        }
        Collections.sort(res);
        System.out.println(res);
    }
}
