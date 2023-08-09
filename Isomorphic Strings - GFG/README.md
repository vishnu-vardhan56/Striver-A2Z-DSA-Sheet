# Isomorphic Strings
## Easy
<div class="problems_problem_content__Xm_eO"><p><span style="font-size:18px">Given two strings '<strong>str1</strong>' and '<strong>str2</strong>', check if these two&nbsp;strings are isomorphic to each other.<br>
Two strings str1 and str2 are called isomorphic if there is a one to one mapping possible for every character of str1 to every character of str2 while <strong>preserving the order</strong>.<br>
Note:&nbsp;All occurrences of every character in str1 should map to the same character in str2</span></p>

<p><span style="font-size:18px"><strong>Example 1:</strong></span></p>

<pre><span style="font-size:18px"><strong>Input:
</strong>str1 = aab
str2 = xxy
<strong>Output: </strong>1<strong>
Explanation: </strong>There are two different
charactersin aab and xxy, i.e a and b
with frequency 2and 1 respectively.</span>
</pre>

<p><span style="font-size:18px"><strong>Example 2:</strong></span></p>

<pre><span style="font-size:18px"><strong>Input:
</strong>str1 = aab
str2 = xyz
<strong>Output: </strong>0<strong>
Explanation: </strong>There are two different
charactersin aab but there are three
different charactersin xyz. So there
won't be one to one mapping between
str1 and str2.</span></pre>

<p><span style="font-size:18px"><strong>Your Task:</strong><br>
You don't need to read input or print anything.Your task is to complete the function <strong>areIsomorphic</strong>()&nbsp;which takes the string <strong>str1</strong>&nbsp;and string <strong>str2</strong>&nbsp;as input parameter&nbsp;and</span>&nbsp;<span style="font-size:18px">&nbsp;check&nbsp;if two strings are isomorphic. The function returns <strong>true </strong>if strings are isomorphic else it returns <strong>false</strong>.</span></p>

<p><span style="font-size:18px"><strong>Expected Time Complexity:&nbsp;</strong>O(|str1|+|str2|).<br>
<strong>Expected Auxiliary Space:&nbsp;</strong>O(Number of different characters).<br>
<strong>Note:</strong>&nbsp;|s| represents the length of string s.</span></p>

<p><span style="font-size:18px"><strong>Constraints:</strong><br>
1 &lt;= |str1|, |str2|&nbsp;&lt;= 2*10<sup>4</sup></span></p>
</div>