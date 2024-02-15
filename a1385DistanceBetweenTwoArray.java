//https://leetcode.com/problems/find-the-distance-value-between-two-arrays/
public class a1385DistanceBetweenTwoArray {
    public static void main(String[] args) {
        int[] arr1 = {4,5,8};
        int[] arr2 = {10,9,1,8};
        int d = 2;
        int ans = findTheDistanceValue(arr1, arr2, d);
        System.out.println(ans);
    }
    public static int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        
        int temp = 0;
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (Math.abs(arr1[i]-arr2[j])<=d){
                    temp++;
                    break;
                }
            }
        }
        return arr1.length-temp;
    }
}
