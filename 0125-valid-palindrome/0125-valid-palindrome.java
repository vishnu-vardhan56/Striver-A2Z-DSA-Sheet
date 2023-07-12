class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        //System.out.print(s);
        int i = 0,j=s.length()-1;
        while(i<=j){
            char f = s.charAt(i);
            char l = s.charAt(j);
            if(!Character.isLetterOrDigit(f)){
                i++;
            }
            else if(!Character.isLetterOrDigit(l)){
                j--;
            }
            else if(f!=l){
                return false;
            }
            else{
                i++;
                j--;
            } 
        }
        return true;
    }
}