package leetcode;

import java.util.*;

/**
 * Given a string, find the length of the longest substring without repeating characters.
 *
 * Created by Dave on 2016/11/10.
 */
public class LongestSubstring {
    private static int solutionOne(String s){
        int j = 0;
        List<Integer> list = new ArrayList<Integer>();
        for(int i = 0; i < s.length(); i ++){
            Character cursor = s.charAt(i);
            String target = s.substring(i+1,s.length());
            int index = target.indexOf(cursor);
            if(index != -1){
                list.add(index + 1);
            }
        }

        if(list == null && list.size() == 0){
            j = s.length();
        }else{
            Integer[] array = (Integer[]) list.toArray(new Integer[list.size()]);
            //快速排序
//            quickSort(array,0,list.size());
//            j = array[list.size()-1];
            Arrays.sort(array);
            j = array[array.length - 1];
        }

        return j;
    }

    private static void quickSort(Integer[] array, int low, int hi){
        if(low > hi){
            return;
        }
        int index = partition(array,low,hi);
        quickSort(array,low,index - 1);
        quickSort(array,index+1,hi);
    }

    private void swap(Integer[] a, int i, int j){
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    private static int partition(Integer[] array, int low, int hi){
        int key = array[low];
        while(low < hi){
            while(array[hi] > key && hi > low){
                hi --;
            }

            array[low] = array[hi];

            while(array[low]<=key && hi>low){
                low ++;
            }
            array[hi] = key;
        }
        return hi;
    }

    private static boolean uniqueQuene(String s, int start, int end){
        Set<Character> set = new HashSet<Character>();
        for (int i = start; i < end; i ++){
            Character ch = s.charAt(i);
            if(set.contains(ch)){
                return false;
            }
            set.add(ch);
        }
        return true;
    }

    /**
     * Brute Force
     * @param s
     * @return
     */
    private static int solutionTwo(String s){
        int ans = 0;
        for(int i = 0; i < s.length(); i ++){
            for(int j = i + 1; j <= s.length(); j ++){
                if(uniqueQuene(s, i, j))
                    ans = Math.max(ans, j-i);

            }
        }
        return ans;
    }

    /**
     * sliding window
     * @param s
     * @return
     */
    private static int solutionThree(String s){
        int n = s.length();
        Set<Character> set = new HashSet<Character>();
        int i =0 ,j = 0,ans = 0;
        while ((i < n) && (j < n)){
            if(!set.contains(s.charAt(j))){
                set.add(s.charAt(j++));
                ans = Math.max(ans, j-i);
            }else{
                set.remove(i++);
            }
        }
        return ans;
    }

    /**
     * Sliding window Optimized
     * @param s
     * @return
     */
    private static int solutionFour(String s){
        int n = s.length();
        int i = 0;
        int j;
        int ans = 0;
        Map<Character,Integer> map = new HashMap<Character,Integer>();

        for(j = 0;j < n; j ++){
            if(map.containsKey(s.charAt(j))){
                i = Math.max(map.get(s.charAt(j)),i);
            }
            ans = Math.max(ans,j - i + 1);
            map.put(s.charAt(j),j + 1);
        }
        return ans;
    }


    public static void main(String[] args){
        String s = "bcdbb";
        System.out.println(solutionTwo(s));
        System.out.println(solutionThree(s));

        System.out.println(solutionFour(s));
    }
}
