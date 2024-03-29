class Solution {

    public int uniqueMorseRepresentations(String[] words) {
        String[] morseCode = {
            ".-",
            "-...",
            "-.-.",
            "-..",
            ".",
            "..-.",
            "--.",
            "....",
            "..",
            ".---",
            "-.-",
            ".-..",
            "--",
            "-.",
            "---",
            ".--.",
            "--.-",
            ".-.",
            "...",
            "-",
            "..-",
            "...-",
            ".--",
            "-..-",
            "-.--",
            "--.."
        };
        Set<String> set = new HashSet<String>();

        for (String currWord : words) {
            int currWordLen = currWord.length();
            String currWordMorseCode = "";
            for (int j = 0; j < currWordLen; j++) {
                currWordMorseCode += morseCode[currWord.charAt(j) - 'a'];
            }
            set.add(currWordMorseCode);
        }

        return set.size();
    }
}
