class Solution {

    public int minSetSize(int[] arr) {
        int len = arr.length;
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();

        for (int i = 0; i < len; i++) {
            int currEle = arr[i];
            if (!map.containsKey(currEle)) {
                map.put(currEle, 1);
            } else {
                map.put(currEle, (map.get(currEle)) + 1);
            }
        }

        int[] tempArr = new int[map.size()];
        int i = 0;

        for (Map.Entry<Integer, Integer> mapData : map.entrySet()) {
            tempArr[i++] = mapData.getValue();
        }

        Arrays.sort(tempArr);

        int minSetCount = 1;
        int freq = 0;

        for (int j = (tempArr.length) - 1; j >= 0; j--) {
            freq += tempArr[j];
            if (freq >= (len / 2)) break;
            minSetCount++;
        }

        return minSetCount;
    }
}
