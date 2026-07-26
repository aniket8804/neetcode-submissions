class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i=0; i<nums.length; i++){
            map.put(nums[i], map.getOrDefault(nums[i], 0)+1);
        }
        int[] arr = new int[k];
        int l=0;
        while(k>0){
            int max=0;int maxkey=0;
            for(Map.Entry<Integer, Integer> i: map.entrySet()){
                if(i.getValue() > max){
                    max = i.getValue();
                    maxkey = i.getKey();
                }
            } 
            arr[l]=maxkey;
            map.remove(maxkey);
            l++;
            k--;
        }return arr;
    }
}
