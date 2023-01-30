import java.util.Scanner;
public class calculator {
    public static void main(String[] arg) {

        Scanner input = new Scanner(System.in);
        //Take input till X or x
        int ans = 0;
        while (true) {
            //operatot
            System.out.println("enter the operator");
            char op = input.next().trim().charAt(0);
            if (op == '+' || op == '-' || op == '*' || op == '/') {
                //user input value
                System.out.println("enter the value");
                int num1 = input.nextInt();
                int num2 = input.nextInt();
                if (op == '+') {
                    ans = num1 + num2;
                }
                if (op == '-') {
                    ans = num1 - num2;
                }
                if (op == '*') {
                    ans = num1 * num2;
                }
                if (op == '/') {
                    if (num2 != 0)
                        ans = num1 / num2;
                }
            } else if (op == 'X' || op == 'x') {
                break;
            } else {
                System.out.println("invalid input error");
            }
        System.out.println("your answer is "+ans);
        }
    }
}
