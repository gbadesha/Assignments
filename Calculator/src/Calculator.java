import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        int i;

        do
        {
        System.out.println("Enter 1 for addition");
        System.out.println("Enter 2 for subtraction");
        System.out.println("Enter 3 for multiplication");
        System.out.println("Enter 4 for division");
        System.out.println("Enter 0 for exit");
        Scanner sc = new Scanner(System.in);
        i = sc.nextInt();
        //int[]=
        //      }
        InputData cal1 = new InputData();
        Addition cal2 = new Addition();
        Subtraction cal3=new Subtraction();
        Multiplication cal4=new Multiplication();
        //int[] array1=new int[5];
        //if(i>0 && i<=4)
          int[] array1=cal1.input();
            //System.out.println(cal1.i);
            //array1=new int[cal1.i];

        switch (i) {
            case 1:
                cal2.add(array1);
                break;
            case 2:
                cal3.sub(array1);
                break;
            case 3:
                cal4.mul(array1);
                break;
            case 0:
                break;
                default:
                System.out.println("Enter a correct option");
                continue;

        }
    } while(i!=0);
}}