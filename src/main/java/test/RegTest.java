package test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegTest {
    public static void main(String[] args) {
        String path = "url0123:98941a";
        String re ="([a-z]+)(\\d+)(:[a-z0-9]+)";
        String re1 ="([a-z])";

        Pattern p = Pattern.compile("([a-z]+)(\\d+)(:[a-z0-9]+)");
        Matcher m = p.matcher(path);
//        m.find();
//        System.out.println(m.group());
//        System.out.println(path.matches("([a-z]+)([0-9]+)(:\\w+)"));

//        while(m.find())
//        {
//
//            System.out.println(m.group());
//            System.out.println(m.start()+"...."+m.end());
//            // start()  字符的开始下标（包含）
//            //end()  字符的结束下标（不包含）
//        }

        System.out.println(m.find());


    }

}
