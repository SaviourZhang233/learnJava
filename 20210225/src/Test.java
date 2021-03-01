import java.util.Arrays;

public class Test {

    public static void main(String[] args) {
        //字符串的构造方法
        //1.new String(char[] value),根据字符数组value构造
        char[] chars = {'h','e','l','l','o'};
        String str1 = new String(chars);
        System.out.println(str1);
        //2.new String(char[] value, int offset, int count),
        //根据字符数组的下标范围[offset,count)构造字符串
        String str2 = new String(chars, 0, 2);
        System.out.println(str2);

        //char charAt(int index)
        //获取指定索引位置的字符，索引位置从0开始
        char char1 = str1.charAt(0);
        System.out.println(char1);

        //char[] toCharArray()
        //将字符串变成字符数组返回
        char[] chars1 = str1.toCharArray();

        //常见操作
        //1.比较大小
        //a)比较相等 boolean equals(Object anObject)
        System.out.println(str1.equals(str2));
        //b)比较大小，比较两个字符串Unicode码的字典序
        //int compareTo(String anotherString) 返回int
        //字母从小到大的顺序为A~Z~a~z
        System.out.println("a".compareTo("z"));
        System.out.println("a".compareTo("Z"));
        System.out.println("A".compareTo("Z"));
        //c)不区分大小写的比较
        //boolean equalsIgnoreCase(String anotherString) 不分大小写比较相等
        System.out.println("hello".equalsIgnoreCase("HelLo"));
        //int compareToIgnoreCase(String str) 不分大小写比较大小

        //2.查找
        //a)查找子串是否存在 boolean contains(String str)
        System.out.println("hello".contains("llo"));
        System.out.println("hello".contains("las"));
        //b)查找子串位置，返回开始位置的索引(索引从0开始) int indexOf(String str)
        //没找到返回-1
        //如果存在两个子串则返回第一个的索引
        System.out.println("hello world".indexOf("world"));
        System.out.println("hello world".indexOf("word"));
        System.out.println("hello world world".indexOf("world"));

        //3.字符串替换
        //由于字符串是不和变的所以字符串替换的返回值是一个新串
        //a)替换所有指定内容 String replaceAll(String regex, String replacement)
        //这里的参数 regex 是 正则表达式
        String string = "hello world world";
        System.out.println(string.replaceAll("world","word"));
        System.out.println(string);
        //可见结果并不一样，原字符串并没有改变

        //b)替换首个内容replaceFirst(String regex, String replacement)

        //4.字符串切分/拆分
        //a)根据分隔符将全部拆分  String[] split(String regex)
        string = "192.168.0.1";
        String[] res = string.split("\\.");
        // "\\." 这里涉及到两次转义，正则表达式的缘故
        System.out.println(Arrays.toString(res));
        //b)根据 regex 将字符串切割成 limit 个 String[] split(String regex,int limit)
        //若 limit 小于可切割数 n ，则切割成 limit 个
        string = "a b c d e f";
        res = string.split(" ",3);
        System.out.println(Arrays.toString(res));
        //若 limit 大于等于可切割数 n ，则切割成 n 个
        res = string.split(" ",10);
        System.out.println(Arrays.toString(res));
        //字符串合并 Java中直接使用 +


        //5.字符串截取
        //a)从指定索引（从0开始）位置截取到结尾 String substring(int beginIndex)
        string = "0123456789";
        String ret = string.substring(4);
        System.out.println(ret);
        //b)截取部分内容 String substring(int beginIndex, int endIndex)
        //截取范围是[begin,end)的前闭后开区间
        ret = string.substring(4,8);
        System.out.println(ret);

        //6.其他操作
        //去掉字符串左右的空白符（回车换行制表等等） String trim()
        string = " hello\nhi\t hui\n";
        System.out.println("[" + string + "]");
        System.out.println("[" + string.trim() + "]");
        //大小写转化
        //转大写 String toUpperCase()
        string = "AbCdEfG";
        System.out.println(string.toUpperCase());
        //转小写 String toLowerCase()
        System.out.println(string.toLowerCase());
        //判断字符串是否为空，但不是null，而是长度为0
        //boolean isEmpty()
        string = "";
        System.out.println(string.isEmpty());
        //空指针异常
//        string = null;
//        System.out.println(string.isEmpty());

    }
}
