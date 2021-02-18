package backjoon.steps.strings;

import java.util.Scanner;

public class WordCount {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine().trim();
        String []words = s.split(" ");

        int len = words.length;

        if(words.length==1){
            if(words[0]=="")
                System.out.println(0);
            else{
                System.out.println(len);
            }
        }
        else{
            System.out.println(len);
        }
    }

}
