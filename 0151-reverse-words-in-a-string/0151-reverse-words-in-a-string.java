class Solution {
    public String reverseWords(String str) {
        str =  str.trim();
		String s[] = str.split(" ");
		String res = "";
		for(int i=s.length-1;i>=0;i--){
			 if(s[i].length()!=0){res+=s[i].trim()+" ";}
		}
		res= res.trim();
		return res;
    }
}