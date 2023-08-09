class Solution {
    public boolean rotateString(String p, String q) {
        return ((p.length()==q.length()) && (p+p).contains(q));
    }
}