/**
 * Created by Totoro on 16/3/21.
 */
public class productExceptSelf {
    public int[] productExceptSelf(int[] nums) {
        int len = nums.length;
        int []result = new int[len];
        result[0] = 1;
        int tmp = 1;
        for (int i = 1 ; i < len ; i ++){
            result[i] = result[i-1]*nums[i-1];

        }
        for(int j = len -1 ; j >=0 ; j--){
            result[j] *= tmp;
            tmp *= nums[j];
        }

        return result;


    }
    public static void main(String[] args){
        System.out.print("Product of Array Except Self");
    }
}
