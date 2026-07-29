class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s2.contains(s1)){
            return true;
        }
        HashMap<Character, Integer> map = new HashMap<>();
        HashMap<Character, Integer> map1 = new HashMap<>();
        for(int i=0; i<s1.length(); i++){
            map.put(s1.charAt(i), map.getOrDefault(s1.charAt(i), 0)+1);
        }
        for(int i=s1.length()-1; i<s2.length(); i++){
            map1.clear();
            for(int j=0; j<s1.length(); j++){
                map1.put(s2.charAt(i-j), map1.getOrDefault(s2.charAt(i-j), 0)+1);
            }
            if(map1.equals(map)){
                return true;
            }
        }return false;
    }
}
