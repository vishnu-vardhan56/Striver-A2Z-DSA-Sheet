# Check if strings are rotations of each other or not
## Easy
<div class="problems_problem_content__Xm_eO"><p><span style="font-size:18px">Given two strings&nbsp;s1&nbsp;and&nbsp;s2. The task is to check&nbsp;if s2 is a rotated version of the string s1. The characters in the strings are in lowercase.</span></p>

<p>&nbsp;</p>

<p><span style="font-size:18px"><strong>Example 1:</strong></span></p>

<pre><span style="font-size:18px"><strong>Input:
</strong>geeksforgeeks
forgeeksgeeks
<strong>Output: 
</strong>1<strong>
Explanation: </strong>s1 is geeksforgeeks, s2 is
forgeeksgeeks. Clearly, s2 is a rotated
version of s1 as s2 can be obtained by
left-rotating s1 by 5 units.</span>
</pre>

<p>&nbsp;</p>

<p><span style="font-size:18px"><strong>Example 2:</strong></span></p>

<pre><span style="font-size:18px"><strong>Input:
</strong>mightandmagic
andmagicmigth
<strong>Output: 
</strong>0<strong>
Explanation: </strong>Here with any amount of
rotation s2 can't be obtained by s1.</span></pre>

<p>&nbsp;</p>

<p><span style="font-size:18px"><strong>Your Task:</strong><br>
The task is to complete the function&nbsp;<strong>areRotations() </strong>which checks if the two strings are rotations of each other.&nbsp;The function returns&nbsp;true&nbsp;if string 1 can be obtained by rotating string 2, else it returns&nbsp;false.</span></p>

<p>&nbsp;</p>

<p><span style="font-size:18px"><strong>Expected Time Complexity:&nbsp;</strong>O(N).<br>
<strong>Expected Space Complexity:</strong>&nbsp;O(N).<br>
<strong>Note:</strong> N = |s1|.</span></p>

<p>&nbsp;</p>

<p><span style="font-size:18px"><strong>Constraints:</strong><br>
1 &lt;= |s1|,&nbsp;|s2| &lt;= 10<sup>7</sup></span></p>
</div>