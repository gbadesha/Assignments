public class LargestWordInParagraph {
    public void LargestWord(String s){
        //String[] s1=new String[10];
        String[] s1=s.split(" ");
        int l=0;
        String big=" ";
        for(int i=0;i<s1.length;i++){
            //System.out.println(s1[i] + " ");
            if(s1[i].length()>l){
            l=s1[i].length();
            big=s1[i];

        } else if (s1[i].length()==l) {
                big=big.concat(" , ");
                big=big.concat(s1[i]);

                
            }
        }
            System.out.println("Biggest word is  " + big);

    }
}
