package leetcode;

/**
 * @author Dave
 * @create 2017-11-20 21:54
 **/

public class Test {

    private static final Integer PAGE_SIZE = Integer.valueOf(100);

    public static void main(String[] args) {
        Integer count = 450;
        Integer page = count % PAGE_SIZE == 0 ? count / PAGE_SIZE : count / PAGE_SIZE + 1;
        Integer startIndex = Integer.valueOf(0);

        while (page > 0) {
            startIndex = ((--page) > 0) ? page * PAGE_SIZE : Integer.valueOf(0);
            System.out.println(startIndex + " -- -- " + PAGE_SIZE * (page + 1));
        }
    }

}
