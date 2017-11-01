package leetcode.guava;

import com.google.common.base.Splitter;

import java.util.Map;

public class SplitterTest {
    public static void main(String[] args){
        String s = "jobUseFor=11;taskGroupKey=02;delay=1";
        Map<String,String> jobParam = Splitter.on(";").withKeyValueSeparator("=").split(s.trim());
        System.out.println(jobParam);
    }
}
