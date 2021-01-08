package codeforces;

import java.util.Scanner;

/*
 * Codeforces Beta Round #65 (Div. 2)
 */

public class WayTooLongWords {
    public static void main(String []args){
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();

        for(int i=0;i<n;++i){
            String word = input.next();
            final int length = word.length();
            if(length>10){
                final char first = word.charAt(0);
                final char last = word.charAt(word.length()-1);
                String s = new StringBuilder().append(first).append(word.length()-2).append(last).toString();
                System.out.println(s);
            }
            else{
                System.out.println(word);
            }
        }

    }
}
