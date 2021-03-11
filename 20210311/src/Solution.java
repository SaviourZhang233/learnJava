import java.util.Stack;

public class Solution {

    // 给定 S 和 T 两个字符串，当它们分别被输入到空白的文本编辑器后，判断二者是否相等，并返回结果。 # 代表退格字符。
    //
    // 注意：如果对空文本输入退格字符，文本继续为空。
    // 输入：S = "a##c", T = "#a#c"
    // 输出：true
    // 解释：S 和 T 都会变成 “c”。
    public boolean backspaceCompare(String S, String T) {
        Stack<Character> A = new Stack<>();
        Stack<Character> B = new Stack<>();
        // 处理第一个字符串
        for(int i = 0; i < S.length(); i++) {
            char c = S.charAt(i);
            if(c == '#') {
                if(A.isEmpty() == false) {
                    A.pop();
                }
                continue;
            }
            A.push(c);
        }
        // 处理第二个字符串
        for(int i = 0; i < T.length(); i++) {
            char c = T.charAt(i);
            if(c == '#') {
                if(B.isEmpty() == false) {
                    B.pop();
                }
                continue;
            }
            B.push(c);
        }
        // 比较两个栈中的元素是否一模一样
        while (A.isEmpty() == false && B.isEmpty() == false) {
            if(A.pop() != B.pop()) {
                return false;
            }
        }
        if(A.isEmpty() == true && B.isEmpty() == true) {
            return true;
        }
        return false;
    }

}
