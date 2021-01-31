import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        char[] chars = str.toCharArray();
        String ret = "";
        for(int i = 0;i < str.length();i++){
            if(ret.contains(chars[i] + "") == false){
                ret += chars[i];
            }
        }
        System.out.println(ret);
    }
}
