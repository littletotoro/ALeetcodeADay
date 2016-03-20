

/**
 * Created by Totoro on 16/3/20.
 */
public class countBits {
    public static int[] countBits(int num) {
        int []result = new int[num+1];
        for (int i = 0 ; i <= num ; i++){
           if (i == 0){
               result[i]= 0;
           }
            else{
               int temp = i;
               while (temp > 0){
                   if(temp%2 != 0){
                       result[i] +=1;
                   }
                   temp = temp/2;
               }
           }

        }
        return result;
    }
    public static void main(String[] args){
        //System.out.print("Hello world");
        int []k = countBits(16);
        for (int i = 0 ; i <= 16 ; i++){
            System.out.println(k[i]);
        }
    }
}
