public class Handler {
    public static void main(String[] args){
        Student student1=new Student();
        Helper helper= new Helper();
        helper.populateDetails(student1);
        System.out.println(student1.name);
    }
}
