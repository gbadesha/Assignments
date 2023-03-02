public class ArraysMethod {
    int[] values=new int[5];
    public int[] printingInMainMethod(){

        for(int i=0; i<values.length;i++)
        {
            values[i]=i+1;
        }
        System.out.println(values.length);
        return values;
    }
}
