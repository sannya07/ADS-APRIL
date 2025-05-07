import java.util.HashMap;

public class HashMapq1 {
    public static int maxLengthWithDistinctK(String s, int k) {
        if (s.length() == 0 || k == 0) return 0;

        int maxLength = 0;
        int left = 0;
        HashMap<Character, Integer> map = new HashMap<>();

        for (int right = 0; right < s.length(); right++) {
            char c = s.charAt(right);
            map.put(c, map.getOrDefault(c, 0) + 1);

            while (map.size() > k) {
                char leftChar = s.charAt(left);
                map.put(leftChar, map.get(leftChar) - 1);
                if (map.get(leftChar) == 0) map.remove(leftChar);
                left++;
            }

            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
    }

    public static void main(String[] args) {
        String s1 = "eceba";
        int k1 = 2;
        System.out.println("Test 1: Expected 3, Got: " + maxLengthWithDistinctK(s1, k1)); // "ece"

        String s2 = "aa";
        int k2 = 1;
        System.out.println("Test 2: Expected 2, Got: " + maxLengthWithDistinctK(s2, k2)); // "aa"

        String s3 = "abcadcacacaca";
        int k3 = 3;
        System.out.println("Test 3: Expected 11, Got: " + maxLengthWithDistinctK(s3, k3)); // "cadcacacaca"

        String s4 = "a";
        int k4 = 1;
        System.out.println("Test 4: Expected 1, Got: " + maxLengthWithDistinctK(s4, k4)); // "a"

        String s5 = "";
        int k5 = 2;
        System.out.println("Test 5: Expected 0, Got: " + maxLengthWithDistinctK(s5, k5)); // ""
    }
}
