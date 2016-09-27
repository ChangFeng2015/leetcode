package leetCode;

/**
 * Given an array of integers, return indices of the two numbers such that they add up to a specific target.
 * Created by dave on 16-9-27.
 */
public class TwoSum {
    public static void main(String[] args){
        int[] a= {34,56,2,1};
        int target = 3;
        for(int i = 0; i < a.length; i ++){
            for(int j = i + 1; j < a.length; j ++){
                int sum = a[i] + a[j];
                if(sum == target){
                    System.out.println("a[" + i + "]+" + "a[" + j + "] = " + target);
                }
            }
        }
    }
}
