package leetcode;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

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

    //Brute force
    private int[] SolutionOne(int[] nums, int target){
        for(int i = 0; i < nums.length; i ++){
            for(int j = i + 1; j < nums.length; j ++){
                if(nums[j] == target - nums[i]){
                    return new int[]{i, j};
                }
            }
        }
        throw new IllegalArgumentException("No two sum solution!");
    }
    //Two-pass Hash Table
    private int[] SolutionTwo(int[] nums, int target){
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int i = 0; i < nums.length; i ++){
            map.put(nums[i], i);
        }
        for(int i = 0; i < map.size(); i ++){
            Integer n = map.get(target - nums[i]);
            if(n != null){
                return new int[]{i,n};
            }
        }
        throw new IllegalArgumentException("No two sum solution!");
    }

    //One-pass hashtable
    private int[] SolutionThree(int[] nums, int target){
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int i = 0; i < nums.length; i ++){
            int n = target - nums[i];
            if(map.containsKey(n)){
                return new int[]{map.get(n), i};
            }
            map.put(nums[i], i);
        }
        throw new IllegalArgumentException("No two sum solution!");
    }
}
