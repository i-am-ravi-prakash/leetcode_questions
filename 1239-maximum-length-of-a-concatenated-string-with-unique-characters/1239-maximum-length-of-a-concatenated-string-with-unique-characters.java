class Solution {

    public int maxLength(List<String> arr) {
        
        int index = 0;
        String curr = "";
        List<String> combinationList = new ArrayList<>();
        findStringCombination(arr, index, curr, combinationList);
        
        int len = combinationList.size();
        int i = 0;
        int maxLen = 0;
        
        while(i < len){
            String currStr = combinationList.get(i);
            if(isDuplicatePresent(currStr) == false){
                maxLen = Math.max(maxLen, currStr.length());
            }
            i++;
        }
        
        return maxLen;
    }
    
    public static void findStringCombination(List<String> stringList, int index, String curr, List<String> combinationList){
        int n = stringList.size();
        if (index == n) {
            combinationList.add(curr);
            return;
        }
        findStringCombination(stringList, index + 1, curr + stringList.get(index), combinationList);
        findStringCombination(stringList, index + 1, curr, combinationList);
    }

    public boolean isDuplicatePresent(String str) {
        Set<Character> set = new HashSet<>();
        int len = str.length();

        int i = 0;

        while (i < len) {
            char currChar = str.charAt(i);
            if (!set.isEmpty() && set.contains(currChar)) {
                return true;
            } else {
                set.add(currChar);
            }
            i++;
        }
        return false;
    }
}
