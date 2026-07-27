class Solution {
    public boolean isPalindrome(String s) {
        int i=0;
        int j=s.length()-1;
        String str = s.toLowerCase();
      
        while(i<=j){
            while(i<j && !Character.isLetterOrDigit(str.charAt(i))){
                i++;
            }
            while(i<j && !Character.isLetterOrDigit(str.charAt(j))){
                j--;
            }
            if(str.charAt(i)!=str.charAt(j)){
                return false;
            }
            
                i++;
                j--;
            

        }return true;
    }
}
