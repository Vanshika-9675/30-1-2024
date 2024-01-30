import java.util.Scanner;

public class Problem5 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int q = sc.nextInt();
    int sum=0;
    int mul = 1;
    if(q==1){
        for(int i=1;i<=n;i++){
            sum+=i;
        }
        System.out.println(sum);
    }
    else if(q==2){
        for(int i=1;i<=n;i++){
           mul*=i;
        }
        System.out.println(mul);
    }  
    }  
}
