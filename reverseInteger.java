import java.util.Scanner;

public class reverseInteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int k = reverse(x);
        System.out.println(k);

        sc.close();
    }
    public static int reverse(int x) {

        int temp = 0;
        while (x != 0){

            temp = temp*10 + x % 10;
            x = x / 10;
        }
        return temp;
    }
}
