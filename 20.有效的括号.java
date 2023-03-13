import java.util.ArrayList;
import java.util.List;

/*
 * @lc app=leetcode.cn id=20 lang=java
 *
 * [20] 有效的括号
 */

// @lc code=start
class Solution {
    public boolean isValid(String s) {
        List<Character> left = new ArrayList<>();
        char[] charArray = s.toCharArray();
        if (charArray.length == 0)
            return false;
        for (char a : charArray) {
            int lastIndex = left.size() - 1;
            switch (a) {
                case '(':
                case '[':
                case '{':
                    left.add(a);
                    break;
                case ')':
                    if (lastIndex >= 0 && left.get(lastIndex) == '(') {
                        left.remove(lastIndex);
                    } else {
                        return false;
                    }
                    break;
                case ']':
                    if (lastIndex >= 0 && left.get(lastIndex) == '[') {
                        left.remove(lastIndex);
                    } else {
                        return false;
                    }
                    break;
                case '}':
                    if (lastIndex >= 0 && left.get(lastIndex) == '{') {
                        left.remove(lastIndex);
                    } else {
                        return false;
                    }
                    break;
                default:
                    return false;
            }
        }
        return left.size() == 0;
    }
}
// @lc code=end
