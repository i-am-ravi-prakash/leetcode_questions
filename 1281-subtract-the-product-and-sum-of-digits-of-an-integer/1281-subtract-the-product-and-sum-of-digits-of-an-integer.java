class Solution {

    public int subtractProductAndSum(int n) {
        int sum = 0;
        int product = 1;

        while (n != 0) {
            int currDigit = n % 10;
            sum += currDigit;
            product *= currDigit;
            n = n / 10;
        }

        return (product - sum);
    }
}
