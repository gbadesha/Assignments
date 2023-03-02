public class Subtraction {
    public static void sub(int[] array){
        int a=array[0];
        for(int i=1;i<array.length; i++){
            a=a-array[i];
        }
        System.out.println("Subtraction of entered numbers is " + a);

    }
}
