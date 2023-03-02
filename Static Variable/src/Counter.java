public class Counter {
   // public static void main(String[] args) {

        static int count = 0;
        int instancecount = 0;
        public void counterincrement() {
            count++;
            instancecount++;
        }
        public void print() {
            System.out.println("count is= " + count + " instancecounter is =" + instancecount);
        }
    }
//}