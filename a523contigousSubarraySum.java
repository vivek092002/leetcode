import java.util.HashMap;
//https://leetcode.com/problems/continuous-subarray-sum/description/
public class a523contigousSubarraySum {

    public static void main(String[] args) {
        int[] nums = {23,2,4,6,7};
        int k = 6;
        boolean temp = checkSubarraySum(nums, k);
        System.out.println(temp);
    }

    public static boolean checkSubarraySum(int[] nums, int k) {

        int sum=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int  i=0; i<nums.length ;i++)
        {
            sum+=nums[i];
            sum%=k;
            if(sum==0 && i>0) // suppose a long sub array in that case the sum will be 0 as we have mod it by k
                return true ;
            if(map.containsKey(sum) && i-map.get(sum)>1) // same sum is found again  [i - idx of the position where same sum was already there ]
                return true;
            if(!map.containsKey(sum)) // map is not having this sum just add the sum
                map.put(sum,i);
        }
        return false;

    }
}
