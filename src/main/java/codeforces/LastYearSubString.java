package codeforces;

import java.util.Scanner;

public class LastYearSubString {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        final int tc = sc.nextInt();

        for(int t=0;t<tc;++t){
            final int n = sc.nextInt();
            String string =  sc.next();
            char []chars = new char[n];
            for(int i=0;i<chars.length;++i){
                chars[i] = string.charAt(i);
            }

            boolean polycarp = false;


            if(chars[0]=='2' && chars[1]=='0' && chars[2]=='2' && chars[3]=='0'){
                    polycarp=true;
            }
            else{
                if(chars[0]=='2'){
                    for(int j=1;j<chars.length-2;++j){
                        if(chars[j]=='0' && chars[j+1]=='2' && chars[j+2]=='0' && (j+3==chars.length))
                            polycarp=true;
                    }
                    if(chars[1]=='0'){
                        for(int j=2;j<chars.length-1;++j){
                            if(chars[j]=='2' && chars[j+1]=='0' && (j+2==chars.length))
                                polycarp=true;
                        }
                    }

                    if(chars[1]=='0' && chars[2]=='2'){
                        for(int j=3;j<chars.length;++j){
                            if(chars[j]=='0' && j+1==chars.length)
                                polycarp=true;
                        }
                    }
                }
                else{
                    for(int i=1;i<chars.length-3;++i){
                        if(chars[i]=='2' && chars[i+1]=='0' && chars[i+2]=='2' && chars[i+3]=='0' && i+4==chars.length){
                            polycarp=true;
                        }
                    }
                }
            }

            if(polycarp)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}
