import java.util.Scanner;

public class WayTooLongWords {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        final int n = sc.nextInt();

        String[]  words = new String[n];

        for(int i=0;i<n;++i){
            words[i] = sc.next();
        }

        for(int i=0;i<n;++i){
            final String word = words[i];
            final int len = word.length();
            if(len > 10){
                System.out.println(word.substring(0,1)+String.valueOf(len-2)+word.substring(len-1,len));
            }
            else
                System.out.println(word);
        }
    }
}
