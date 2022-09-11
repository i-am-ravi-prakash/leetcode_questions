class Solution {

    public boolean isPalindrome(int x) {
        if (x < 0) return false;
        String num = Integer.toString(x);
        int len = num.length();
        int l = 0;
        int r = len - 1;

        while (l <= r) {
            if (num.charAt(l) != num.charAt(r)) return false;
            l++;
            r--;
        }

        return true;
    }
}
