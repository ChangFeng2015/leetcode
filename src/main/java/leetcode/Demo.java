package leetcode;

import org.junit.Test;

import java.util.*;

/**
 * Created by Dave on 2016/11/13.
 */
public class Demo {

    public static void main(String[] args) {
        aa:for(int i = 1;i <= 3;i ++){
           bb:for (int j = 1;j <= 3;j ++ ){
               if(i == 2 && j == 2){
                   break bb;
               }
               System.out.println(i + " " + j);
           }
        }

        Elvis elvis_1 = Elvis.getInstance();
        Elvis elvis_2 = Elvis.getInstance();

        if (elvis_1.equals(elvis_2)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }

        NutritionFacts nutritionFacts_1 = new NutritionFacts.Builder(240,8).calories(100).sodium(35).carbohydrate(27).build();
        NutritionFacts nutritionFacts_2 = new NutritionFacts.Builder(2,56).calories(29).sodium(34).carbohydrate(67).build();

        if (nutritionFacts_1.equals(nutritionFacts_2)) {
            System.out.println("true");
        }else {
            System.out.println("false");
        }

    }

    @Test
    public void interatorTest() {
        List<Integer> list = new ArrayList<>(4);
        list.add(2);
        list.add(5);
        list.add(78);
        list.add(89);
        list.add(99);

        List<Integer> subList = list.subList(1, 2);
        Iterator<Integer> subIterator = subList.iterator();
        while (subIterator.hasNext()) {
            Integer ele = subIterator.next();
            if (Objects.equals(5, ele)) {
                subIterator.remove();
            }
        }

        System.out.println("-------------- start ---------------");
        for (Integer obj : subList) {
            System.out.println(obj);
        }
        System.out.println("-------------- end ---------------");

        System.out.println("-------------- start ---------------");
        for (Integer obj : list) {
            System.out.println(obj);
        }
        System.out.println("-------------- end ---------------");


//        Iterator<Integer> iterator = list.iterator();
//        while (iterator.hasNext()) {
//            Integer ele = iterator.next();
//            if (Objects.equals(5, ele)) {
//                iterator.remove();
//            }
//        }
    }
}
