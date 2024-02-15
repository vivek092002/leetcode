public class a202happyNumber {
    public static void main(String[] args) {
        int n = 19;
        boolean ans = isHappy(n);
        System.out.println(ans);
    }
    public static boolean isHappy(int n) {

        while (true) {
            int d = 0, sum = 0;
            while (n > 0) {
                d = n % 10;
                sum += Math.pow(d, 2);
                n = n / 10;
            }
            if (sum == 1) {
                return true;
            } else {
                continue;
            }
        }
    }
}
