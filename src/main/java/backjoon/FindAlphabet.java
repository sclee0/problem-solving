package backjoon;

import java.util.Scanner;

public class FindAlphabet {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String word = sc.next();

        char chars[] = new char[26];

        for(int i=0;i<chars.length;++i){
            int ascii = 'a'+i;
            char ch = (char) (ascii-0);
            String s = String.valueOf(ch);
            if(!word.contains(s))
                System.out.print("-1 ");
            else{
                for(int j=0;j<word.length();++j){
                    String find = String.valueOf(word.charAt(j));
                    if(find.equals(s)) {
                        System.out.print(j+" ");
                        break;
                    }
                }
            }
        }
    }
}
