package Work;

import java.util.Arrays;

public class Test {

    //给定一个仅包含大小写字母和空格 ' ' 的字符串 s，返回其最后一个单词的长度。
    // 如果字符串从左向右滚动显示，那么最后一个单词就是最后出现的单词。
    //如果不存在最后一个单词，请返回 0 。
    public static int lengthOfLastWord(String s){
        String[] strings = s.split(" ");
        if(strings.length == 0){
            return 0;
        }
        return strings[strings.length - 1].length();
    }

    //给你两个有序整数数组 nums1 和 nums2，请你将 nums2 合并到 nums1 中，
    // 使 nums1 成为一个有序数组。
    //初始化 nums1 和 nums2 的元素数量分别为 m 和 n 。
    // 你可以假设 nums1 有足够的空间（空间大小等于 m + n）来保存 nums2 中的元素。
    //输入：nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
    //输出：[1,2,2,3,5,6]
    public static void merge(int[] nums1, int m, int[] nums2, int n){
        int[] ret = new int[m + n];
        int n1 = 0;
        int n2 = 0;
        int i = 0;
        for(i = 0;i < ret.length;i++){
            if(nums1[n1] < nums2[n2]){
                ret[i] = nums1[n1];
                n1++;
            }
            else{
                ret[i] = nums2[n2];
                n2++;
            }
            if(n1 > m){
                ret[i] = nums2[n2];
                n2++;
            }
            if(n2 > n){
                ret[i] = nums1[n1];
                n1++;
            }
        }
        for(i = 0;i < ret.length;i++){
            nums1[i] = ret[i];
        }
        System.out.print(Arrays.toString(nums1));
    }


    public static void main(String[] args) {
        //System.out.println(lengthOfLastWord("     "));
        int[] nums1 = {1,2,3,0,0,0};
        int m = 3;
        int[] nums2 = {2,5,6};
        int n = 3;
        merge(nums1,m,nums2,n);
    }

}
