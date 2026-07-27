class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0){return 0;}
        int[] arr = new int[nums.length];

        for(int i=0; i<arr.length; i++){
            arr[i]=nums[i];
        }

        Arrays.sort(arr);
        int cont = 1;
        int maxcont = 1;
        for(int i=1; i<arr.length; i++){
            if(arr[i]==arr[i-1]){continue;}
            if(arr[i]==arr[i-1]+1){cont++;}else{cont=1;}

            maxcont = Math.max(maxcont, cont);

        }return maxcont;
    }
}
