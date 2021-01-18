package backjoon;

import java.util.Scanner;

public class SelfNumber {
    static final int N = 10000;
    public static int d(int n){
        int sum = n;

        while(true){
            sum+=n%10;
            n = n/10;
            if(n==0)
                break;
        }
        return sum;
    }

    public static void main(String[] args){
        boolean numbers[] = new boolean[N+1];

        for(int i=1;i<=N;++i){
            int num = d(i);
            if(num<N)
                numbers[num] = true;
        }

        for(int i=1;i<numbers.length-1;++i){
            if(!numbers[i])
                System.out.println(i);
        }
    }
}
