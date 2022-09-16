class Solution {

    public boolean validtaeString(String str) {
        str = str.toLowerCase();
        char[] charArray = str.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            char ch = charArray[i];
            if (!(ch >= 'a' && ch <= 'z')) {
                return false;
            }
        }
        return true;
    }

    public int lengthOfLastWord(String s) {
        int counter = 0;
        for (int i = s.length() - 1; i > 0; i--) {
            if (s.charAt(i) == ' ') {
                continue;
            } else if (validtaeString(String.valueOf(s.charAt(i))) && s.charAt(i - 1) != ' ') {
                counter++;
            } else {
                break;
            }
        }
        return counter + 1;
    }
}
