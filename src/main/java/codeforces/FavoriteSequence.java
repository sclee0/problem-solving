package codeforces;

import java.util.Scanner;

public class FavoriteSequence {
    public static void main(String []args){
        Scanner input = new Scanner(System.in);

        final int n = input.nextInt();

        for(int i=0;i<n;++i){
            final int length = input.nextInt();
            int a[] = new int[length];
            for(int j=0;j<length;++j){
                a[j] = input.nextInt();
            }

            final int half = length/2;
            for(int j=0;j<half;++j){
                System.out.print(String.valueOf(a[j]) +" "+ String.valueOf(a[length-j-1])+" ");
            }
            if(length%2!=0)
                System.out.println(String.valueOf(a[half]));
        }
    }
}
