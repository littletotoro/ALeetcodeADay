/**
 * Created by Totoro on 16/3/24.
 */
public class maxSubArray {
    public int maxSubArray(int[] nums) {
        int result = nums[0];
        int sum = nums[0];
        for (int i = 1 ; i < nums.length ; i++){
            if (sum < 0){
                sum = nums[i];
            }
            else{

                sum = sum + nums[i];
            }
            if (result < sum) result = sum;
        }
        return result;
    }
    public static void main(String[] args){
        System.out.println("Maximum Subarray");
    }
}
