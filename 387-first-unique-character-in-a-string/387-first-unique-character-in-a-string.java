class Solution {

    public int firstUniqChar(String s) {
        int len = s.length();
        Map<Character, Integer> map = new HashMap<Character, Integer>();

        for (int i = 0; i < len; i++) {
            char currChar = s.charAt(i);

            if (!map.containsKey(currChar)) {
                map.put(currChar, 1);
            } else {
                map.put(currChar, (map.get(currChar)) + 1);
            }
        }

        for (int i = 0; i < len; i++) {
            char currChar = s.charAt(i);
            if (map.get(currChar) == 1) {
                return i;
            }
        }

        return -1;
    }
}
