package codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * Codeforces Round #690 (Div. 3)
 */

public class LastYearSubString {
    public static void main(String []args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int tc = Integer.parseInt(br.readLine());
        for(int t=0;t<tc;++t){
            int size = Integer.parseInt(br.readLine());
           String s = br.readLine();
           if(s.startsWith("2020"))
               System.out.println("YES");
           else if(s.startsWith("202") && s.endsWith("0"))
               System.out.println("YES");
           else if(s.startsWith("20") && s.endsWith("20"))
               System.out.println("YES");
           else if(s.startsWith("2") && s.endsWith("020"))
               System.out.println("YES");
           else if(s.endsWith("2020"))
               System.out.println("YES");
           else
               System.out.println("NO");
        }
    }
}
