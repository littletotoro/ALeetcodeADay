/**
 * Created by Totoro on 16/3/25.
 */
public class trailingZeroes {
    public int trailingZeroes(int n) {
        int tmp = n;
        int count = 0;
        while (tmp >= 5){
            count += tmp/5;
            tmp = tmp/5;
        }
        return count;
    }
    public static void main(String[] args){
        System.out.println("Factorial Trailing Zeroes");
    }
}
