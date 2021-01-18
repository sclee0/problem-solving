package codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class UniqueNumber {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());

        for(int t=0;t<tc;++t){
            int n = Integer.parseInt(br.readLine());
            if(n>45)
                System.out.println("-1");
            else if(n==45)
                System.out.println("123456789");
            else if(n>=1 && n<=9){
                System.out.println(n);
            }
            else{
                StringBuilder sb = new StringBuilder();
                for(int i=9;i>0;--i){
                    sb.append(i);
                    n -= i;
                    if(n<10 && i>n)
                        break;
                }
                sb.append(n);
                System.out.println(sb.reverse().toString());
            }
        }
    }
}