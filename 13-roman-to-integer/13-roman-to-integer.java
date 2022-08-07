class Solution {
    public int romanToInt(String s) {
        int result = 0;
        int len = s.length();
        
        int i = 0;
        
        while(i < len){
            String temp = "";
            if(i != (len - 1)){
                temp = s.substring(i, i + 2);
            }
            if(temp.equals("IV") || temp.equals("IX") || temp.equals("XL") || temp.equals("XC") || temp.equals("CD") || temp.equals("CM")){
                result = result + getValue(temp);
                i = i + 2;
            }
            else{
                char ch = s.charAt(i);
                result = result + getValue("" + ch);
                i = i + 1;
            }
        }
        
        return result;
    }
    
    public int getValue(String str){
        Map<String, Integer> map = new HashMap<>();
        map.put("I", 1);
        map.put("V", 5);
        map.put("X", 10);
        map.put("L", 50);
        map.put("C", 100);
        map.put("D", 500);
        map.put("M", 1000);
        map.put("IV", 4);
        map.put("IX", 9);
        map.put("XL", 40);
        map.put("XC", 90);
        map.put("CD", 400);
        map.put("CM", 900);
        
        return map.get(str);
    }
}