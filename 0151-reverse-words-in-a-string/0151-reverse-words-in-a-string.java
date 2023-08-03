class Solution {
    public String reverseWords(String str) {
        String s = "";
        String temp = "";
        int i = 0;
        int j = str.length();
        while(i<j){
            char ch = str.charAt(i);
            if(ch!=' '){
                temp+=ch;
            }
            else if(temp!=""){
                if(!s.equals("")){
                    s = temp + " " + s;
                }
                else{
                    s+=temp;
                }
                temp="";
            }
            i++;
        }
        if(temp!=""){
            if(!s.equals("")){
                s = temp + " " + s;
            }
            else{
                s+=temp;
            }
        }
        return s;
    }
}