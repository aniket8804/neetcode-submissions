class Solution {
    public int[] productExceptSelf(int[] nums) {
        int product = 1;
        int zero=0;
        for(int i=0; i<nums.length; i++){
            if(nums[i]!=0){
            product*=nums[i];
         }else{
            zero++;
         }
        }
       
        int[] arr = new int[nums.length];
    if(zero==0){
        for(int i=0; i<nums.length; i++){
            if(nums[i]==0){
                nums[i]=0;
            }else{
            arr[i]=product/nums[i];
            }
        }
        return arr;
    }if(zero==1){
    for(int i=0; i<nums.length; i++){
        if(nums[i]!=0){
            arr[i]=0;
        }else{
            arr[i]=product;
        }
       
    } return arr;
} for(int i=0; i<nums.length; i++){
    arr[i]=0;
}return arr;
}
}
