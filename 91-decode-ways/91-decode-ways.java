class Solution {

    public int numDecodings(String digits) {
        int n = digits.length();
        int[] count = new int[n + 1];
        count[0] = 1;
        count[1] = 1;
        //for base condition "01123" should return 0
        if (digits.charAt(0) == '0') return 0;
        for (int i = 2; i <= n; i++) {
            count[i] = 0;

            // If the last digit is not 0,
            // then last digit must add to the number of words
            if (digits.charAt(i - 1) > '0') count[i] = count[i - 1];

            if (digits.charAt(i - 2) == '1' || (digits.charAt(i - 2) == '2' && digits.charAt(i - 1) < '7')) {
                count[i] += count[i - 2];
            }
        }
        return count[n];
    }
}
