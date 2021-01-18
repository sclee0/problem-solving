package codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FavoriteSequence {
    public static void main(String []args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int tc = Integer.parseInt(br.readLine());

        for(int t=0;t<tc;++t){
            br.readLine();
            String[] nums = br.readLine().split(" ");
            String ans = "";

            int i=0, j= nums.length-1;
            while(i<=j){
                if(i==j){
                    ans = ans+nums[i]+" ";
                }
                else{
                    ans = ans+nums[i]+" "+nums[j]+" ";
                }
                i++;
                j--;
            }
            System.out.println(ans);
        }
    }
}
