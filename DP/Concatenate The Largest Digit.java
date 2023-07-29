import java.util.* ;
import java.io.*; 
public class Solution {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int result = concatLargestDigit(a, b, c);
        System.out.println(result);
    }

    static int func(int num) {
        int ans = 0;
        int rem;

        while (num != 0) {
            rem = num % 10;
            ans = Math.max(ans, rem);
            num = num / 10;
        }
        return ans;
    }

    public static int concatLargestDigit(int a, int b, int c) {
        StringBuilder str = new StringBuilder();
        int x = func(a);
        str.append(x);
        int y = func(b);
        str.append(y);
        int z = func(c);
        str.append(z);

        return Integer.parseInt(str.toString());
    }
}
