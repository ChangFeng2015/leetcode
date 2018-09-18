//package leetCode;
//
//import java.util.Arrays;
//import java.util.List;
//import java.util.StringJoiner;
//import java.util.stream.Collectors;
//
///**
// * Created by Dave on 2016/11/2.
// */
//public class StringJoinerDemo
//{
//    public static void main(String[] args)
//    {
//        StringJoiner sj = new StringJoiner(":","[","]");
//        sj.add("dave").add("George").add("Fred");
//        System.out.println(sj.toString());
//
//        List<Integer> numbers = Arrays.asList(1,2,3,4);
//        String commaSeparatedNumbers = numbers.stream().map(i -> i.toString()).collect(Collectors.joining(","));
//        System.out.println(commaSeparatedNumbers);
//        System.out.println(sj.toString().substring(0,1));
//    }
//}
