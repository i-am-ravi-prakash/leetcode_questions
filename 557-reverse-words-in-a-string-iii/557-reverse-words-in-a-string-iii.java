class Solution {

    public String reverseWords(String s) {
        int len = s.length();
        int i = 0;
        String currWord = "";
        String result = "";

        while (i < len) {
            if (s.charAt(i) != ' ') {
                currWord += s.charAt(i);
            } else if (s.charAt(i) == ' ') {
                StringBuffer sb = new StringBuffer(currWord).reverse();
                result = result + sb.toString() + " ";
                currWord = "";
            }
            i++;
        }
        StringBuffer sb = new StringBuffer(currWord).reverse();
        result = result + sb.toString();

        return result;
    }
}
