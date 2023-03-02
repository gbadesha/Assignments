public class Book {
    String author;
    String title;
    String year;
    static int a=0;

    Book(String a,String t,String y){
author=a;
this.title=t;
this.year=y;


    }
    public void display(){

        a++;
        System.out.println(" Author: "+author+" Title: "+title+" Year: "+year+"  "+a);

    }
}
