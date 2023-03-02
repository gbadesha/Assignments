public class ArrayDemo {
    public static void main(String[] args){
        StudentMarks studentMarks=new StudentMarks();
        int[] marks;// initialize size
      marks=studentMarks.marks1;     //or if you want to pass value of other array to marks that array has to be size declared


        studentMarks.giveMarks();
        //marks=studentMarks.marks1;

        for(int i=0;i<studentMarks.marks1.length;i++){
            System.out.println(studentMarks.marks1[i]+" "+marks[i]);
        }
        System.out.println(marks);
       System.out.println(studentMarks.marks1);
    }
}

