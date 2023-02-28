import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the text");
        String s1= sc.nextLine();
       // String s1 = "USS Indiana was the lead ship of her class and the first battleship in the United States Navy comparable to foreign battleships of the time. Authorized in 1890, she was launched on 28 February 1893 and commissioned on 20 November 1895. The ship pioneered the use of an intermediate battery. Indiana served in the Spanish–American War as part of the North Atlantic Squadron and took part in the blockade of Santiago de Cuba and the battle of Santiago de Cuba. After the war she became obsolete—despite several modernizations—and spent most of her time in commission as a training ship or in the reserve fleet, with her last commission during World War I as a training ship for gun crews. She was decommissioned for the third and final time in January 1919 and was shortly after renamed Coast Battleship Number 1 so that the name Indiana could be reused. She was sunk in shallow water as a target in aerial bombing tests in 1920 and her hull was sold for scrap in 1924. (Full article...)oked up one of the more obscure Latin words, consectetur, from a Lorem Ipsum passage, and going through the cites of the word in classical literature, discovered the undoubtable source. Lorem Ipsum comes from sections 1.10.32 and 1.10.33 of \"de Finibus Bonorum et Malorum\" (The Extremes of Good and Evil) by Cicero, written in 45 BC. This book is a treatise on the theory of ethics, very popular during the Renaissance. The first line of Lorem Ipsum, \"Lorem ipsum dolor sit amet..\", comes from a line in section 1.";
        LargestWordInParagraph obj1= new LargestWordInParagraph();
        obj1.LargestWord(s1);
        /*String s2 = s1.substring(2);// it will print llo world
        String s3 = s1.substring(2, 2);
        int firstlocation = s1.indexOf("o");
        int lastlocation = s1.indexOf("w");
        //String s=s1.concat(s2);
        //String s = "hello world";
        // String s1= "hello world";
        //s1="Hello world";
        //String s2=new String("hello world");//
        // s=s.toUpperCase();
        //s=s.toLowerCase();

        System.out.println(firstlocation + " " + lastlocation);
        //System.out.println(s3 + " "+s3.length());
        String[] s7 = s1.split(" ");// it will give us multiple strings out of one string
        for (int i = 0; i < s7.length; i++) {


            System.out.println(s7[i]);
        }


        System.out.println("printing location of 6 string" + s7[6]);*/
    }}
