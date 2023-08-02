class Solution {
    public String removeOuterParentheses(String s) {
        String s1 ="";
        int n = s.length();
        int c =0;
        int ind = 0;
        for(int i=0;i<n;i++){
            char ch = s.charAt(i);
            if(ch=='('){
                c+=1;
            }
            else{
                c-=1;
            }
            if(c==0){
                s1+=s.substring(ind+1,i);
                ind =i+1;
            }
        }
        return s1;
    }
}