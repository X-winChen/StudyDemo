package String;

import java.util.StringJoiner;

/**
 * @Author: Chenxy
 * @Date: 6/3/2024  下午6:35
 * @Version 1.0
 */
public class StringJoinerDemo {
    public static void main(String[] args) {
        // 创建对象
        StringJoiner stringJoiner = new StringJoiner("***","{","}");

        stringJoiner.add("aaa").add("BBB").add("ccc");

        System.out.print(stringJoiner.toString());
        String a="abc";
        String b="abc";
        String c="a";
        String d=c+"bc";
        System.out.println(a==b);
        System.out.println(a==d);
    }
}
