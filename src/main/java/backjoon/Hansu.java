package backjoon;

import java.util.Scanner;

public class Hansu {
    public static boolean isHansu(int num){
        if(num<10)
            return true;

        boolean hansu = true;
        final int len = String.valueOf(num).length();
        int []arr = new int[len];
        int pos = 0;

        while(true){
            int cur = num%10;
            num = num/10;
            arr[pos++] = cur;
            if(num==0) break;
        }

        int d = arr[1]-arr[0];
        for(int i=2;i<len;++i){
            if((arr[i]-arr[i-1])!=d){
                hansu = false;
            }
        }

        return hansu;
    }

    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int ans = 0;
        for(int i=1;i<= num;++i){
            if(isHansu(i)){
                ans++;
            }

        }
        System.out.println(ans);
    }
}
