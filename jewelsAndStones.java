//https://leetcode.com/problems/jewels-and-stones/
import java.util.Scanner;

public class jewelsAndStones {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        String str2 = sc.next();
        int k = numJewelsInStones(str,str2);
        System.out.println(k);

        sc.close();
    }
    public static int numJewelsInStones(String jewels, String stones) {

        int temp = 0;
        for (int i = 0; i < jewels.length(); i++) {
            for (int j = 0; j < stones.length(); j++) {
                if (jewels.charAt(i) == stones.charAt(j)){
                    temp++;
                }
            }
        }

        return temp;
    }
}
