/**
 * Created by Totoro on 16/3/23.
 */
public class FirstBadVersion {
    public boolean isBadVersion(int version){
        return false;
    }
    public int firstBadVersion(int n){
        return badVersion(1,n);
    }

    public int badVersion(int first,int last){
        int tmp = first + (last - first)/2;
        if (first == last) {
            return first;
        }
        else if (isBadVersion(tmp) == true){
            return badVersion(first,tmp);
        }
        else{
            return badVersion(tmp + 1,last);
        }
    }
    public static void main(String[] args){
        System.out.println("First Bad Version");
    }
}
