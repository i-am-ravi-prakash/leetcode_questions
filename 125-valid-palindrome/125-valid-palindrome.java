class Solution {

    public boolean isPalindrome(String s) {
        String modifiedString = "";

        for (int i = 0; i < s.length(); i++) {
            char currChar = s.charAt(i);
            char lowerCaseChar = Character.toLowerCase(currChar);

            if ((lowerCaseChar >= 'a' && lowerCaseChar <= 'z') || Character.isDigit(lowerCaseChar)) {
                modifiedString = modifiedString + lowerCaseChar;
            }
        }

        int start = 0;
        int end = modifiedString.length() - 1;

        while (start <= end) {
            if (modifiedString.charAt(start) != modifiedString.charAt(end)) {
                return false;
            }

            start++;
            end--;
        }

        return true;
    }
}
