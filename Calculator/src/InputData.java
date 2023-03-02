import java.util.Scanner;

public class InputData {
    int i;
    int[] data =new int[5];
    public int[] input(){
        //String[] data=new String[10];

        Scanner sc = new Scanner(System.in);
    System.out.println(" Note you can enter only 5 numbers and if you want to calculate less Enter # as your last number");
        System.out.println("Enter the numbers ");

                            for(i=0;i<5;i++){


                    data[i]=sc.nextInt();
                                if(data[i]==7){
                                   // for(int j=i;j<5;j++)
                                    data[i]=0;
                                    break;
                                }



                }

           //String s = data;
            return data;
    }
}
