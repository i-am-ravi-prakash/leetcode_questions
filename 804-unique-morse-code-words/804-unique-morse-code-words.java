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
        int wordLen = words.length;

        for (int i = 0; i < wordLen; i++) {
            String currWord = words[i];
            int currWordLen = currWord.length();
            String currWordMorseCode = "";
            for (int j = 0; j < currWordLen; j++) {
                currWordMorseCode = currWordMorseCode + morseCode[currWord.charAt(j) - 'a'];
            }
            set.add(currWordMorseCode);
        }

        int uniqueTransformations = set.size();

        return uniqueTransformations;
    }
}
