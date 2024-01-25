//https://leetcode.com/problems/maximum-number-of-words-found-in-sentences/
import java.util.Arrays;
import java.util.Scanner;

public class maxWordsInSentence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] str = {"please wait", "continue to fight", "continue to win"};
        int k = mostWordsFound(str);
        System.out.println(k+1);

        sc.close();
    }

    public static int mostWordsFound(String[] sentences) {

        int temp = 0;
        int[] arr = new int[sentences.length];
        for (int i = 0; i < sentences.length; i++) {
            int count = 0;
            for (int j = 0; j < sentences[i].length() ; j++) {
                if (sentences[i].charAt(j) == ' '){
                    count++;
                }
                arr[i] = count;
            }
        }

        temp = Arrays.stream(arr).max().getAsInt();

        return temp;
    }
}
