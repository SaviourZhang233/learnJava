import java.util.Arrays;

public class Solution {


    //给定一个整数数组，判断是否存在重复元素。
    //如果存在一值在数组中出现至少两次，函数返回 true 。如果数组中每个元素都不相同，则返回 false 。
    //输入: [1,2,3,1]
    //输出: true
    //输入: [1,2,3,4]
    //输出: false
    public static boolean containsDuplicate(int[] nums) {

        Arrays.sort(nums);
        for(int i = 0;i < nums.length - 1;i++){
            if(nums[i] == nums[i + 1]){
                return true;
            }
        }
        return false;
    }

    //你的朋友正在使用键盘输入他的名字 name。偶尔，
    // 在键入字符 c 时，按键可能会被长按，而字符可能被输入 1 次或多次,
    //你将会检查键盘输入的字符 typed。
    // 如果它对应的可能是你的朋友的名字（其中一些字符可能被长按），那么就返回 True。
    //输入：name = "alex", typed = "aaleex"
    //输出：true
    //解释：'alex' 中的 'a' 和 'e' 被长按。
    //输入：name = "saeed", typed = "ssaaedd"
    //输出：false
    //解释：'e' 一定需要被键入两次，但在 typed 的输出中不是这样。
    public static boolean isLongPressedName(String name, String typed) {
        char[] nChars = name.toCharArray();
        char[] tChars = typed.toCharArray();
        int pn = 1;
        int pt = 1;
        if(nChars[0] != tChars[0]){
            return false;
        }
        while (pn < nChars.length){
            if(tChars[pt] == nChars[pn]){
                pt++;
                pn++;
            }
            else if(tChars[pt] == nChars[pn - 1]){
                pt++;
            }
            else{
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
//        int[] ints1 = {1,2,3,4};
//        int[] ints2 = {1,2,3,1};
//        System.out.println(containsDuplicate(ints1));
//        System.out.println(containsDuplicate(ints2));
        System.out.println(isLongPressedName("alex","aaleex"));
        System.out.println(isLongPressedName("saeed", "ssaaedd"));
        System.out.println(isLongPressedName("abcd","sabcd"));
    }
}
