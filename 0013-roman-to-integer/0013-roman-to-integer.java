class Solution {
    public int romanToInt(String s) {
        int arr[] = new int[91];
        arr['M'] = 1000;
        arr['D'] = 500;
        arr['C'] = 100;
        arr['L'] = 50;
        arr['X'] = 10;
        arr['V'] = 5;
        arr['I'] = 1;
        int res=0;
        for(int i=0;i<s.length();i++){
            if(i<s.length()-1 && arr[s.charAt(i)]<arr[s.charAt(i+1)]){
                res-=arr[s.charAt(i)];
            }
            else{ res+=arr[s.charAt(i)];}
        }
        return res;
    }
}