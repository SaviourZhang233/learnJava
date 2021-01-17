import java.util.Arrays;

public class Test {

    //实现函数 ToLowerCase() ，该函数接收一个字符串参数 str ，
    //并将该字符串中的大写字母转换成小写字母，
    //后返回新的字符串
    public static String toLowerCase(String str){
        char[] a = str.toCharArray();
        for(int i = 0;i < a.length;i++){
            if(a[i] >= 'A' && a[i] <= 'Z'){
                a[i] =(char)(a[i] - ('A' - 'a'));
            }
        }
        String ret = String.copyValueOf(a);
        return ret;
    }

    //给定一个数组，将数组中的元素向右移动 k 个位置，其中 k 是非负数
    public static void rotate(int[] nums, int k){
        int k1 = k % nums.length;
        int[] tmp1 = Arrays.copyOfRange(nums,nums.length - k1,nums.length);
        int[] tmp2 = Arrays.copyOfRange(nums,0,nums.length - k1);
        System.arraycopy(tmp1,0,nums,0,tmp1.length);
        System.arraycopy(tmp2,0,nums,tmp1.length,tmp2.length);
    }


    public static void main(String[] args) {
        //System.out.println(toLowerCase("1234ABcdA"));
        int[] nums = {1,2,3,4,5,6,7};
        rotate(nums,3);

    }
}
