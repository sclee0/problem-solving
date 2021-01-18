package backjoon;

import java.util.Scanner;

public class Array {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int []cnt = new int[10];

        int res = a*b*c;
        String s = String.valueOf(res);
        final int len = s.length();
        for(int i=0;i<len;++i){
            for(int j=0;j<10;++j){
                if((s.charAt(i)-'0')==j){
                    cnt[j]++;
                }
            }
        }

        for(int i=0;i<cnt.length;++i){
            System.out.println(cnt[i]);
        }
    }
}
