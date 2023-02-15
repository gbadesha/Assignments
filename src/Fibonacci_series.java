import java.util.Scanner;
public class Fibonacci_series {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of fibonacci series");
        int l= sc.nextInt();
        int a=0, b=0, c=1;
        for (int i=0;i<=l;i++)
        {
            a=b;
            b=c;
            c=a+b;
            System.out.print(a + " ");
        }
    }
}
