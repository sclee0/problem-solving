import java.util.Scanner;

public class FavoriteSequence {
    public static void main(String []args){
            Scanner sc = new Scanner(System.in);

            final int n = sc.nextInt();

            for(int i=0;i<n;++i){
                final int len = sc.nextInt();
                int a[] = new int[len];
                for(int j=0;j<len;++j){
                    a[j] = sc.nextInt();
                }

                final int halfLen = len/2;
                for(int j=0;j<halfLen;++j){
                    System.out.print(String.valueOf(a[j]) +" "+ String.valueOf(a[len-j-1])+" ");
                }
                if(len%2!=0)
                    System.out.println(String.valueOf(a[halfLen]));
            }
    }
}
