class Solution {

    public int lengthOfLastWord(String s) {
        int len = s.length();
        int lastWordLength = 0;
        int i = len - 1;
        char curr = ' ';
        char prev = ' ';

        while (i >= 0) {
            curr = s.charAt(i);
            if (curr == ' ') {
                if (curr == prev) i--; else break;
            } else {
                lastWordLength++;
                i--;
            }
            prev = curr;
        }

        return lastWordLength;
    }
}
