public class StringSession {
    public static void main(String[] args){
        int a=9;
        //String name = new String("Gurpreet");
        String name2="Gurpreet";
        String name3="Gurpreet";
    //name="Sunny";
    //name="Mottu";
    StringBuilder s1= new StringBuilder("Gurpreet");// its not going to string pool
    StringBuilder s2=new StringBuilder("Sunny");
    System.out.println(s1 + "  " + s2+ " "+ name2+" " +name3);
    }
}
