public class Test {

    String string;
    //实现方法 split, 能够指定分割符将字符串拆分成字符串数组(不必支持正则表达式)
    public String[] mySplit(String regex){
        int index1 = 0;
        String[] ret = new String[5];
        int i = 0;
        while(index1 < string.length()){
            int index2 = string.indexOf(regex,index1);
            if(index2 == -1){
                break;
            }
            ret[i] = string.substring(index1,index2);
            index1 = index2 + regex.length();
            i++;
        }
        return ret;
    }

    //实现方法 replace, 能够替换字符串中的某个部分
    public String myReplace(char searchChar, char newChar){
        char[] chars = string.toCharArray();
        for(int i = 0;i < chars.length;i++){
            if(chars[i] == searchChar){
                chars[i] = newChar;
            }
        }
        String ret = new String(chars);
        return ret;
    }

    //实现方法 indexOf, 能够找出字符串子串存在的位置
    public int myIndexOf(String str){
        char[] originalChars = string.toCharArray();
        char[] subChars = str.toCharArray();
        int p1 = 0;
        int p2 = 0;
        int p3 = 0;
        for(;p1 < originalChars.length;p1++){
            p3 = p1;
            for(;p2 < subChars.length;p2++,p3++){
                if(originalChars[p3] != subChars[p2]){
                    break;
                }
            }
            if(p2 == subChars.length){
                break;
            }
        }
        if(p1 == originalChars.length){
            return -1;
        }
        return p1;
    }

    //实现方法 contains, 能够判定字符串中是否包含子串
    public boolean myContains(String str){
        return !(this.myIndexOf(str) == -1);
    }

    public static void main(String[] args) {
        //String str = "abcdabcdacbd";
//        String[] strings = str.split("da");
//        for (String string:strings) {
//            System.out.println(string);
//        }
//        System.out.println(str.length());
//        System.out.println(str.substring(0,12));
        //int a = str.indexOf("e");
        //System.out.println(a);
        Test test = new Test();
        test.string = "abcdabcd";
//        String[] strings = test.mySplit("cd");
//        for (String string:strings) {
//            System.out.println(string);
//        }
        //System.out.println(test.myReplace('a','o'));
        //System.out.println(test.myIndexOf("cda"));
        System.out.println(test.myContains("cda"));
        System.out.println(test.myContains("afg"));
    }
}
