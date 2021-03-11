import java.lang.reflect.Array;
import java.util.Arrays;

public class Test {

    // 给定整型数组, 把所有的偶数放到数组前面, 把所有奇数放到数组后面.
    public static int[] func1(int[] ints) {
        int left = 0;
        int right = ints.length - 1;
        while (left < right) {
            while (left < right && ints[left] % 2 == 0) {
                left++;
            }
            while (left < right && ints[right] % 2 == 1) {
                right--;
            }
            int tmp = ints[left];
            ints[left] = ints[right];
            ints[right] = tmp;
            left++;
            right--;
        }
        return ints;
    }

    // 给定两个整型数组, 交换两个数组的内容.
    public static void func2(int[] ints1, int[] ints2) {
        int length1 = ints1.length;
        int length2 = ints2.length;
        if(length1 == length2) {
            for(int i = 0; i < length1; i++) {
                int tmp = ints1[i];
                ints1[i] = ints2[i];
                ints2[i] = tmp;
            }
            System.out.println(" 交换成功 ");
            System.out.println(" 交换后的ints1为 " + Arrays.toString(ints1));
            System.out.println(" 交换后的ints2为 " + Arrays.toString(ints2));
            return;
        }
        System.out.println(" 交换失败 ");
            return;
    }

    public static void main(String[] args) {
        int[] ints1 = {1,3,4,5,34,32,535,6,4,123};
        int[] ints2 = {2,5,543,65,234,23,2,5,66,37};
        func2(ints1, ints2);
    }

}
