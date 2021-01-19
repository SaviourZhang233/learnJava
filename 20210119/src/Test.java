public class Test {


    //给定一个赎金信 (ransom) 字符串和一个杂志(magazine)字符串，
    // 判断第一个字符串 ransom 能不能由第二个字符串 magazines 里面的字符构成。
    // 如果可以构成，返回 true ；否则返回 false
    //(题目说明：为了不暴露赎金信字迹，要从杂志上搜索各个需要的字母，
    // 组成单词来表达意思。杂志字符串中的每个字符只能在赎金信字符串中使用一次。)
    //你可以假设两个字符串均只含有小写字母。
    //canConstruct("a", "b") -> false
    //canConstruct("aa", "ab") -> false
    //canConstruct("aa", "aab") -> true
    public static boolean canConstruct(String ransomNote, String magazine){
        int p1 = 0;
        int p2 = 0;
        int p3 = 0;
        char[] r = ransomNote.toCharArray();
        char[] m = magazine.toCharArray();
        for(;p1 < m.length - r.length + 1;p1++){
            p2 = p1;
            p3 = 0;
            while (p3 < r.length && m[p2] == r[p3]){
                p2 ++;
                p3 ++;
            }
            if(p3 == r.length){
                return true;
            }
        }
        return false;
    }

    //判断一个整数是否是回文数。回文数是指正序（从左向右）和倒序（从右向左）读都是一样的整数。
    //你能不将整数转为字符串来解决这个问题吗？
    public static boolean isPalindrome(int x){
        if(x < 0){
            return false;
        }
        String str = x + "";
        char[] chars = str.toCharArray();
        int left = 0;
        int right = chars.length - 1;
        while (left < right){
            if(chars[left] != chars[right]){
                return false;
            }
            left ++;
            right --;
        }
        return true;
//

//        String str1 = str.substring(str.length() / 2);

    }

    public static void hello() {
        System.out.println("hello");
    }

    public static void main(String[] args) {
//        int i = 7;
//        do {
//            System.out.println(--i);
//            --i;
//        } while (i != 0);
//        System.out.println(i);
        //System.out.println(canConstruct("aa", "aab"));
        //System.out.println(canConstruct("aa", "ab"));
//        System.out.println(isPalindrome(12344321));
//        System.out.println(isPalindrome(-123321));
//        System.out.println(isPalindrome(12321));
//        Test test=null;
//        test.hello();
//        String s;
//        System.out.println("s="+s);
    }
}
