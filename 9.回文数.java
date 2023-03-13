/*
 * @lc app=leetcode.cn id=9 lang=java
 *
 * [9] 回文数
 */

// @lc code=start
class Solution {
    public boolean isPalindrome(int x) {
        String str = String.valueOf(x);
        for (int i = 0; i < str.length(); i++) {
            char a = str.charAt(i);
            char b = str.charAt(str.length() - 1 - i);
            if (a != b) {
                return false;
            }
        }
        return true;
    }
}
// @lc code=end
