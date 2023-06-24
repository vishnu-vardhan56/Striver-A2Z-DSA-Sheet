class Solution:
    def longestPalindrome(self, s: str) -> str:
        sub = ""
        l = []
        max1 = ""
        for i in range(len(s)):
            for j in range(len(s),i,-1):
                sub = s[i:j]
                if sub==sub[::-1]:
                    if len(max1)<len(sub) : max1 = sub
        return max1