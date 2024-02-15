//https://leetcode.com/problems/find-the-index-of-the-first-occurrence-in-a-string/
public class a28firstOccurence {
    public static void main(String[] args) {
        String haystack = "leetcode";
        String needle = "leeto";

        int temp = strStr(haystack, needle);
        System.out.println(temp);
    }

    public static int strStr(String haystack, String needle) {
        if(needle.length()>haystack.length()){
            return -1;
        }
        int left =0 , right = needle.length();
        while(right <= haystack.length()){
            String str = haystack.substring(left, right);
            if(str.equals(needle)){
                return left;
            }
            left++;
            right++;
        }
        return -1;
    }
}
