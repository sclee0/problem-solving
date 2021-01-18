package codeforces;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.stream.Stream;

public class AddToNeighBourAndRemove {
    public static void main(String []args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());

        for(int t=0;t<tc;++t){
            int n = Integer.parseInt(br.readLine());
            String []stringArray = br.readLine().split(" ");
            int[] arr = Stream.of(stringArray).mapToInt(Integer::parseInt).toArray();
            int sum = 0;
            for(int i=0;i<arr.length;++i){
                sum+=arr[i];
            }

            for(int i=n;i>=1;--i){
                boolean ok = true;
                if(sum%i==0){
                    int needSum = sum/i;
                    int currSum = 0;
                    for(int j=0;j<n;++j){
                        currSum+=arr[j];
                        if(currSum>needSum){
                            ok = false;
                            break;
                        }
                        if(currSum==needSum){
                            currSum=0;
                        }
                    }
                    if(ok){
                        System.out.println(n-i);
                        break;
                    }
                }
            }
        }
    }
}