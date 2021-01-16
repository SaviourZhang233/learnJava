import java.util.Arrays;

public class work {
    //有一组数据，只有一个数字是出现一次，其他是两次，请找出这个数字。
    public static int lookingForSingleDog(int[] a){
        int ret = 0;
        for(int i = 0;i < a.length;i++){
            ret ^= a[i];
        }
        return ret;
    }

    //求斐波那契数列的第n项。(迭代实现)
    public static int fibonacci(int a){
        int[] ret = new int[100];
        ret[1] = 1;
        ret[2] = 1;
        if (a > 2) {
            for (int i = 3; i <= a; i++) {
                ret[i] = ret[i - 1] + ret[i - 2];
            }
        }
        return ret[a];
    }

    //求1！+2！+3！+4！+........+n!的和
    public static int sumOfFactorials(int n){
        int ret = 0;
        int tmp = 1;
        for(int i = 1;i <= n;i++){
            tmp *= i;
            ret += tmp;
        }
        return ret;
    }

    //求 N 的阶乘 。
    public static int factorials(int n){
        int ret = 1;
        for(int i = 1;i <= n;i++){
            ret *= i;
        }
        return ret;
    }

    //调整数组顺序使得奇数位于偶数之前。调整之后，不关心大小顺序。
    public static int[] func1(int[] a){
        int left = 0;
        int right = a.length - 1;
        while(left <= right){
            while(a[left] % 2 == 1){
                left++;
            }
            while(a[right] % 2 == 0){
                right--;
            }
            if(left >= right){
                break;
            }
            int tmp = a[left];
            a[left] = a[right];
            a[right] = tmp;
        }
        return a;
    }

    //创建方法求两个数的最大值max2，随后再写一个求3个数的最大值的函数max3。
    //
    //​ 要求：在max3这个函数中，调用max2函数，来实现3个数的最大值计算
    public static int max2(int a,int b){
        return a>b?a:b;
    }

    public static int max3(int a,int b,int c){
        int ret = max2(a,b);
        return max2(ret,c);
    }

    //在同一个类中定义多个方法：
    // 要求不仅可以求两个整数的最大值，
    // 还可以求两个小数的最大值，
    // 以及两个小数和一个整数的大小关系
    public static int max(int a,int b){
        return a>b?a:b;
    }
    public static double max(double a,double b){
        return a>b?a:b;
    }
    public static Object max(double a,double b,int c){
        double ret = a>b?a:b;
        return ret>c?ret:c;
    }

    //在同一个类中,分别定义求两个整数的方法
    // 和 三个小数之和的方法。
    public static int add(int a,int b){
        return a+b;
    }
    public static double add(double a,double b,double c){
        return a+b+c;
    }

    //实现一个方法 avg, 以数组为参数, 求数组中所有元素的平均值(注意方法的返回值类型).
    public static double avg(int[] a){
        int ret = 0;
        for(int i = 0;i < a.length;i++){
            ret += a[i];
        }
        return ret/a.length;
    }

    //实现一个方法 sum, 以数组为参数, 求数组所有元素之和.
    public static int sum(int[] a){
        int ret = 0;
        for(int i = 0;i < a.length;i++){
            ret += a[i];
        }
        return ret;
    }

    //实现一个方法 transform, 以数组为参数, 循环将数组中的每个元素 乘以 2 ,
    // 并设置到对应的数组元素上. 例如 原数组为 {1, 2, 3}, 修改之后为 {2, 4, 6}
    public static int[] transform(int[] a){
        for(int i = 0;i < a.length;i++){
            a[i] *= 2;
        }
        return a;
    }

    //实现一个方法 printArray, 以数组为参数, 循环访问数组中的每个元素, 打印每个元素的值
    public static void printArray(int[] a){
        for(int x : a){
            System.out.print(x+" ");
        }
    }

    //创建一个 int 类型的数组, 元素个数为 100, 并把每个元素依次设置为 1 - 100
    public static int[] func2(){
        int[] a = new int[100];
        for(int i = 0;i < a.length;i++){
            a[i] = i+1;
        }
        return a;
    }

    //给定一个整型数组, 实现冒泡排序(升序排序)
    public static int[] bubbleSort(int[] a){
        for(int i = a.length - 1;i > 0;i--){
            for(int j = 0;j < i;j++){
                if(a[j] > a[j+1]){
                    int tmp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = tmp;
                }
            }
        }
        return a;
    }

    //给定一个整型数组, 判定数组是否有序（递增）
    public static boolean isIncremental(int[] a){
        for(int i = 1;i < a.length;i++){
            if(a[i] < a[i-1]){
                return false;
            }
        }
        return true;
    }

    //给定一个有序整型数组, 实现二分查找
    public static int binarySearch(int[] a,int b){//找到返回数组下标，找不到返回-1
        int left = 0;
        int right = a.length - 1;
        int mid = (left + right) / 2;
        while(left <= right){
            mid = (left + right) / 2;
            if(a[mid] < b){
                left = mid + 1;
            }
            else if(a[mid] > b) {
                right = mid - 1;
            }
            else if(a[mid] == b){
                return mid;
            }
        }
        return -1;
    }

    //实现一个方法 copyOf, 对一个整型数组进行拷贝, 得到一个新的数组.
    public static int[] cpyOf(int[] src){
        int[] ret = new int[src.length];
        for(int i = 0;i < src.length;i++){
            ret[i] = src[i];
        }
        return ret;
    }

    //实现一个方法 toString, 把一个整型数组转换成字符串.
    // 例如数组 {1, 2, 3} , 返回的字符串为 "[1, 2, 3]", 注意 逗号 的位置和数量.
    public static String toString(int[] a){
        String ret = "[";
        for(int i = 0;i < a.length;i++){
            if(i != a.length - 1){
                ret = ret + a[i] + ",";
            }
            else{
                ret = ret + a[i] + "]";
            }
        }
        return ret;
    }

    public static void main(String[] args) {
        //int[] a = new int[]{1,1,2,2,3,3,4,4,5,6,6};
        //System.out.println(lookingForSingleDog(a));
        //System.out.println(fibonacci(10));
        //System.out.println(factorials(6));
        //int[] a = new int[]{1,2,3,4,5,6,7,8,9};
        //System.out.println(Arrays.toString(func1(a)));
        //System.out.println(max3(4,6,34));
        //System.out.println(max(3.14,62.34,4));
        //int[] a = new int[]{1,2,3,4,5};
        //System.out.println(Arrays.toString(transform(a)));
        //printArray(a);
        //int[] a = func2();
        //printArray(a);
        int[] a = {12,456,741,41,15,78,14,30};
        //System.out.println(Arrays.toString(bubbleSort(a)));
        //int[] b = {1,2,3,4,4,5,6,7};
        //int[] b = bubbleSort(a);
        //System.out.println(Arrays.toString(b));
        //System.out.println(isIncremental(a));
        //System.out.println(isIncremental(b));
        //System.out.println(binarySearch(b,41));
        //.out.println(binarySearch(b,42));
        //int[] b = cpyOf(a);
        //System.out.println(Arrays.toString(a));
        System.out.println(toString(a));
    }
}
