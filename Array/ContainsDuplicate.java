import java.util.*;

public class ContainsDuplicate {
    public static boolean containsDuplicate(int[] nums) {
        // write your code here
        HashSet<Integer> s=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            if(s.contains(nums[i])){
                return true;
            }else{
                s.add(nums[i]);
            }
        }
        return false;
    }
}
