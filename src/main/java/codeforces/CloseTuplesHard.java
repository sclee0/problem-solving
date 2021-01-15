package codeforces;

import java.util.Arrays;
import java.util.Scanner;

public class CloseTuplesHard {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        final int mod = (int)1e9+7;
        int tc = input.nextInt();

        int[][] memo = new int[101][(int) (2 * 1e5) + 1];
        for (int i = 0; i < memo.length; i++)
            Arrays.fill(memo[i], -1);

        for(int t=0;t<tc;++t){
            int n = input.nextInt();
            int m = input.nextInt();
            int k = input.nextInt();
            Integer arr[] = new Integer[n];
            for(int i=0;i<arr.length;++i){
                arr[i] = input.nextInt();
            }

            Arrays.sort(arr,0,n);
            long total = 0;
            for(int i=0;i<n;++i){
                int l = i+1;
                int r = upperBound(arr,n,arr[i]+k);
                total = (total + nCr(memo,r-l+1,m-1,mod));
            }
            System.out.println(total%mod);
        }
    }

    public static int nCr(int[][]memo, int n, int r,int mod) {
        if (n < r)
            return 0;
        if (r == 0 || n == r)
            return 1;
        if (memo[r][n] != -1)
            return memo[r][n];
        return memo[r][n] = ((nCr(memo,n - 1, r - 1,mod) + nCr(memo,n - 1, r,mod)) % mod);
    }

    private static int upperBound(Integer[] arr, int N, long target) {
        int low = 0;
        int high = N - 1;
        while (low < high) {
            int mid = (low + high + 1) / 2;
            if (target >= arr[mid]) {
                low = mid;
            } else {
                high = mid - 1;
            }
        }
        return high;
    }
}