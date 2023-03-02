public class Main {
   // static int a=0;

    public static void main(String[] args) {


        Book obj1=new Book("Gurpreet","Life","2020");
        //Book.a=9;//static variables can be changed only under static environment
        obj1.display();


        }
        static{
        Book.a=11;
        Book obj2=new Book("Sunny","tr","2021");
        obj2.display();
        }

        static{
        System.out.println("static is executed at the first even before main");
        //System.out.println("Hello world!");
    }
}