import java.util.HashMap;
import java.util.Map;

public class UniqueCharacter {
    public static int firstUniqChar(String s) {
        // Create a HashMap to store character frequencies
        Map<Character, Integer> frequencyMap = new HashMap<>();

        // Count the frequency of each character in the string
        for (char ch : s.toCharArray()) {
            frequencyMap.put(ch, frequencyMap.getOrDefault(ch, 0) + 1);
        }

        // Find the first non-repeating character and return its index
        for (int i = 0; i < s.length(); i++) {
            if (frequencyMap.get(s.charAt(i)) == 1) {
                return i;
            }
        }

        // No non-repeating character found, return -1
        return -1;
    }
    public static void main(String[] args) {
        String str = "leetcode";
        int index = firstUniqChar(str);
        System.out.println(index);

    }
}
