import java.util.Arrays;

class Solution {

    //给你一个按 非递减顺序 排序的整数数组 nums，返回 每个数字的平方 组成的新数组，要求也按 非递减顺序 排序。
    //输入：nums = [-4,-1,0,3,10]
    //输出：[0,1,9,16,100]
    //解释：平方后，数组变为 [16,1,0,9,100]
    //排序后，数组变为 [0,1,9,16,100]
    public static int[] sortedSquares(int[] nums) {
        int[] ret = new int[nums.length];
        int left = 0;
        int right = nums.length - 1;
        int i = right;
        while (left <= right){
            if((nums[left] * nums[left]) > (nums[right] * nums[right])){
                ret[i] = nums[left] * nums[left];
                left++;
            }
            else {
                ret[i] = nums[right] * nums[right];
                right--;
            }
            i--;
        }
        return ret;
    }

    //给定一个字符串 S，返回 “反转后的” 字符串，其中不是字母的字符都保留在原地，而所有字母的位置发生反转。

    //输入："ab-cd"
    //输出："dc-ba"

    //输入："a-bC-dEf-ghIj"
    //输出："j-Ih-gfE-dCba"
    public static String reverseOnlyLetters(String S) {
        char[] chars = S.toCharArray();
        int left = 0;
        int right = chars.length - 1;
        boolean bl = false;
        boolean br = false;
        while (left < right){
            bl = chars[left] >= 'A' && chars[left] <= 'Z'
                    || chars[left] >= 'a' && chars[left] <= 'z';
            br = chars[right] >= 'A' && chars[right] <= 'Z'
                    || chars[right] >= 'a' && chars[right] <= 'z';
            if(!bl){
                left++;
            }
            if(!br){
                right--;
            }
            if(br && bl){
                char tmp = chars[left];
                chars[left] = chars[right];
                chars[right] = tmp;
                left++;
                right--;
            }
        }
        return new String(chars);
    }

    //给定一个非负整数数组 A，返回一个数组，在该数组中， A 的所有偶数元素之后跟着所有奇数元素。
    //你可以返回满足此条件的任何数组作为答案。

    //输入：[3,1,2,4]
    //输出：[2,4,3,1]
    //输出 [4,2,3,1]，[2,4,1,3] 和 [4,2,1,3] 也会被接受。
    public static int[] sortArrayByParity(int[] A) {
        int left = 0;
        int right = A.length - 1;
        while (left < right){
            if(A[left] % 2 == 0){
                left++;
            }
            if(A[right] % 2 ==1){
                right--;
            }
            if(A[left] % 2 == 1 && A[right] % 2 == 0 && left < right){
                int tmp = A[left];
                A[left] = A[right];
                A[right] = tmp;
                left++;
                right--;
            }
        }
        return A;
    }

    //给定一个整数类型的数组 nums，请编写一个能够返回数组 “中心索引” 的方法。
    //我们是这样定义数组 中心索引 的：数组中心索引的左侧所有元素相加的和等于右侧所有元素相加的和。
    //如果数组不存在中心索引，那么我们应该返回 -1。如果数组有多个中心索引，那么我们应该返回最靠近左边的那一个。

    //输入：
    //nums = [1, 7, 3, 6, 5, 6]
    //输出：3
    //索引 3 (nums[3] = 6) 的左侧数之和 (1 + 7 + 3 = 11)，与右侧数之和 (5 + 6 = 11) 相等。
    //同时, 3 也是第一个符合要求的中心索引。

    public static int pivotIndex(int[] nums) {
        if(nums.length == 0){
            return -1;
        }
        if(nums.length == 1){
            return 0;
        }
        int left = 0;
        int right = 0;
        for(int i = 1;i < nums.length;i++){
            right += nums[i];
        }
        if(left == right){
            return 0;
        }
        int ret = 1;
        while (ret < nums.length){
            left += nums[ret - 1];
            right -= nums[ret];
            if(left == right){
                return ret;
            }
            ret++;
        }
        return -1;
    }


    //给定一个由 整数 组成的 非空 数组所表示的非负整数，在该数的基础上加一。
    //最高位数字存放在数组的首位， 数组中每个元素只存储单个数字。
    //你可以假设除了整数 0 之外，这个整数不会以零开头。
    //输入：digits = [1,2,3]
    //输出：[1,2,4]
    //解释：输入数组表示数字 123。
    public static int[] plusOne(int[] digits) {
        int right = digits.length - 1;
        //digits[right] += 1;
        int carry = 1;
        for(;right >= 0;right--){
            if(right == 0 && digits[right] == 10){
                digits[right] = 0;
            }
            digits[right] += carry;
            carry = digits[right] / 10;
            digits[right] %= 10;
        }
        return digits;
    }

    public static void main(String[] args) {
//        int[] nums = {-10,-7,-5,0,3,5,6,12,34};
//        System.out.println(Arrays.toString(sortedSquares(nums)));
//        String string = "a-bC-dEf-ghIj";
//        System.out.println(reverseOnlyLetters(string));
        int[] A = {1,9,9};
        System.out.println(Arrays.toString(plusOne(A)));
    }
}