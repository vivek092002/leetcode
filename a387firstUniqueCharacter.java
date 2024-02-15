import java.util.HashMap;
//https://leetcode.com/problems/first-unique-character-in-a-string/description/?envType=daily-question&envId=2024-02-05
public class a387firstUniqueCharacter {
    public static void main(String[] args) {
        String s = "leetcode";
        int ans = firstUniqChar(s);
        System.out.println(ans);

    }

    public static int firstUniqChar(String s) {
        HashMap<Character, Integer> mp = new HashMap<>();

        for (char a : s.toCharArray()) {
            mp.put(a, mp.getOrDefault(a, 0) + 1);
        }

        for (int i = 0; i < s.length(); i++) {
            if (mp.get(s.charAt(i)) == 1) {
                return i;
            }
        }

        return -1;
    }
}

