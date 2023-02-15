import java.util.Scanner;

public class Swapnumbers_no_thirdvar {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter first number in var x = " );
        int x = sc.nextInt();
        System.out.println("Enter second number in var y = ");
        int y=sc.nextInt();
        x=x+y;
        y=x-y;
        x=x-y;
        System.out.println("After swap value of x = " + x + "\n value of y = " + y);



    }
}
