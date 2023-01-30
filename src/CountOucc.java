
public class CountOucc {
    public static void main(String[]arg) {
        int n=1233423;
        int count=0;

        while (n>0){
            int rem = n%10;
            if (rem==3){
                count++;
            }
            n=n/10;
        }
        System.out.println(count);
    }
}
