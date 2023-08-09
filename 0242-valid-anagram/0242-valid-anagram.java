class Solution {
    public boolean isAnagram(String str1, String str2) {
        if(str1.length()!=str2.length()){return false;}
        int arr[] = new int[127];
        int arr1[] = new int[127];
        for(int i=0;i<str1.length();i++){
            arr[str1.charAt(i)]++;
        }
         for(int i=0;i<str2.length();i++){
            arr1[str2.charAt(i)]++;
        }
        for(int i=0;i<str1.length();i++){
            char ch = str1.charAt(i);
            if(arr[ch]!=arr1[ch]){
                return false;
            }
        }
        return true;
    }
}