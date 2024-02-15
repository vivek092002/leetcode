import java.util.HashSet;

//https://leetcode.com/problems/find-the-duplicate-number/
public class a287DuplicateNumber {
    public static void main(String[] args) {
        int[] nums = {1,3,4,2,2};
        int temp = findDuplicate(nums);
        System.out.println(nums);
    }
    public static int findDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int num :
                nums) {
            if (set.contains(num)){
                return num;
            }
            set.add(num);
        }
        return -1;
    }
}
