package leetCode;

import java.util.Hashtable;

/**
 * Given an array of integers, return indices of the two numbers such that they add up to a specific target.
 * Created by dave on 16-9-27.
 */
public class TwoSum {
    public static void main(String[] args){
        int[] a= {34,56,2,1};
        int target = 3;
        TwoSum example = new TwoSum();
        example.twoSum(a, target);
    }
    public int[] twoSum(int[] nums, int target){
        int[] result = new int[2];
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                int sum = nums[i] + nums[j];
                if(sum == target){
                    result[0] = i + 1;
                    result[1] = j + 1;
                }
            }

        }
        return result;
    }
    public int[] Solution(int[] nums, int target){
        int[] a = new int[2];
        Hashtable<Integer, Integer> numbers = new Hashtable<Integer, Integer>();
        for(int i = 0; i < nums.length; i ++){
            if(!numbers.contains(nums[i])){
                numbers.put(nums[i], i);
            }
            Integer n = numbers.get(target - nums[i]);
            if(n != null && n < i){
                a[0] = n + 1;
                a[1] = i + 1;
                return a;
            }
        }
        return a;
    }
}
