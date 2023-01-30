import java.util.Scanner;

public class fiboncci {
    public static void main(String[]arg){
        Scanner i= new Scanner(System.in);
        int n= i.nextInt();
        int a=0;
        int b=1;
        int count=2;
        while(count<=n){
            int t=b;
            b=b+a;
            a=t;
            count++;
        }
        System.out.println(b);
    }
}
