package backjoon;

import java.util.Scanner;

public class StringIter {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);

        final String s = sc.next();
        char []chars = new char[26];
        for(int i=0;i<chars.length;++i){
            chars[i] = 0;
        }

        for(int i=0;i<s.length();++i){
            char ch = s.charAt(i);
            if(ch>='a' && ch <='z'){
                ch-='a';
                chars[ch]++;
            }
            else if(ch>='A' && ch <='Z'){
                ch-='A';
                chars[ch]++;
            }
        }

        int max = Integer.MIN_VALUE;
        int maxPos = 0;
        for(int i=0;i<chars.length;++i){
            if(chars[i]>max){
                maxPos = i;
                max = chars[i];
            }
        }

        int maxCnt = 0;
        for(int i=0;i<chars.length;++i){
            if(chars[i]==max){
                maxCnt++;
            }
        }

        if(maxCnt>1)
            System.out.println("?");
        else{
            char ch = (char)(maxPos+'A');
            System.out.println(ch);
        }
    }
}
