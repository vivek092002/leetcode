
//https://leetcode.com/problems/rotate-array/
import java.util.Arrays;
import java.util.Scanner;

public class rotateArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        //number of rotation to be made
        int k = sc.nextInt();

        //taking array input
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Array before rotation : ");
        System.out.println(Arrays.toString(arr));

        //making a temporary array to store rotated array
        int[] temp = new int[n];
        for (int i = 0; i < n; i++) {

            // ..% n gives number from [ 0 to n-1 ]
            temp[(i+k)%n] = arr[i];
        }

        arr = temp;
        System.out.print("Arrays after rotation is : ");
        System.out.println(Arrays.toString(arr));
        sc.close();
    }
}
