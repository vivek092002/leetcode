public class a201bitwiseAndOfRange {
    public static void main(String[] args) {
        int left = 5;
        int right = 7;
        int ans = rangeBitwiseAnd(left, right);
        System.out.println(ans);
    }
    public static int rangeBitwiseAnd(int left, int right) {

        while (left>right){
            left = left & left-1;
        }
        return right&left;
    }
}
