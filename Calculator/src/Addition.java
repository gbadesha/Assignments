public class Addition {
   //int a=0;


    public void add(int[] array){
     int a=array[0];
        for(int i=1;i<array.length; i++){
            a=a+array[i];
        }
            System.out.println("Sum of entered numbers is " + a);

    }
}
