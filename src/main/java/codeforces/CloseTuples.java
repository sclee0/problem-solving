package codeforces;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class CloseTuples {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);

        int tc = input.nextInt();

        for(int t=0;t<tc;++t){
            int n = input.nextInt();
                Integer arr[] = new Integer[n];
            for(int i=0;i<arr.length;++i){
                arr[i] = input.nextInt();
            }

            Arrays.sort(arr,0,n);
            long total = 0;
            for(int i=0;i<n;++i){
                long minVal = arr[i];
                long maxVal = minVal+2;
                int index = upperBound(arr,n,maxVal);
                if(index-i >= 2){
                    long p = index -i;
                    total += (p*(p-1))/2;
                }
            }
            System.out.println(total);
        }
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