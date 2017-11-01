package leetcode.algorithm;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 *Given a string s, find the longest palindromic substring in s.
 *You may assume that the maximum length of s is 1000.
 *
 * @author Dave
 * @since 1.0
 */
public class LongestPalindromic {
    public String longestPalindromicSubstring(String input){
        if(isBlank(input)){
            return "";
        }
        char[] charSquence = input.toCharArray();
        List<Character> charSquenceCopy = new LinkedList<>();
        int substringLen = 0;
        StringBuilder longSubstring = new StringBuilder();

        //2.PalindromicSubstring
        if (charSquence.length == 1){
            return input;
        }

        for (int i = 0, len = charSquence.length; i < len; i ++){
            char o = charSquence[i];
            if (charSquenceCopy.contains(o)){
                charSquenceCopy.add(o);
                int index = charSquenceCopy.indexOf(o);
                charSquenceCopy = charSquenceCopy.subList(index, charSquenceCopy.size());
                if (substringLen < charSquenceCopy.size()){
                    substringLen = charSquenceCopy.size();
                    for (char e : charSquenceCopy){
                        longSubstring.append(e);
                    }
                }
                charSquenceCopy.remove(0);
            } else {
                charSquenceCopy.add(o);
            }
        }
        return longSubstring.toString();
    }

    /**
     * check the string is empty
     *
     * @param input
     * @return
     */
    public static boolean isBlank(String input){
        return (input == null || "".equals(input)) ? true : false;
    }

    @Test
    public void longestPalindromicSubstringTest(){
        String input = "aaaa";
        String result = longestPalindromicSubstring(input);
        Assert.assertArrayEquals("Success", "aaa".toCharArray(), result.toCharArray());
    }
}
