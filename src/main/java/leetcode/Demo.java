package leetcode;

import org.junit.Test;

import java.lang.reflect.Type;
import java.util.*;
import com.google.common.base.Optional;

/**
 * Created by Dave on 2016/11/13.
 */
public class Demo<T> {

    private static final Map<String, Integer> KEY_CACHE = new HashMap<>(3);

    static {
        KEY_CACHE.put("a", null);
        KEY_CACHE.put("b", Integer.valueOf(2));
        KEY_CACHE.put("c", Integer.valueOf(3));
        KEY_CACHE.put("d", Integer.valueOf(4));
    }
    @Test
    public void finalTest() {
        System.out.println(KEY_CACHE.size());
        Iterator<Map.Entry<String, Integer>> iterator = KEY_CACHE.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, Integer> ele = iterator.next();
            System.out.println(ele.getKey() + "->" + ele.getValue());
        }

        for (Map.Entry<String, Integer> ele : KEY_CACHE.entrySet()) {
            Optional<Integer> value = Optional.fromNullable(ele.getValue());
            if (value.isPresent() && Integer.valueOf(1).equals(value)) {
                KEY_CACHE.put(ele.getKey(), Integer.valueOf(2));
            }

        }

    }

    @Test
    public void paramTest() {
        String a = "abc";
        List<String> list = new ArrayList<>(4);
        setValue(list, a);
        for (String s : list) {
            System.out.println(s);
        }

        System.out.println(a);
    }

    private void setValue(List<String> list, String input) {
        input = "Chinese";
        Collections.addAll(list, "I am a Chinese man!".split(" "));
    }
    public static void main(String[] args) {
        aa : for (int i = 1;i <= 3;i ++) {
           bb : for (int j = 1; j <= 3; j ++) {
               if (i == 2 && j == 2) {
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

    @Test
    public void test() {
        Date startDate = new Date(2017, Calendar.JULY, 06);
        Date endDate = new Date(2017, Calendar.JULY, 07);
        String remitType = "";

        String whereSql = " where hoyi_transfer.is_sum = 'N' and ( ( hoyi_transfer.tran_date >= '" + startDate
                + "' and hoyi_transfer.tran_date < '" + endDate + "') " + "or ( hoyi_transfer.tran_date < '"
                + startDate
                + "' and DATEDIFF(hoyi_transfer.create_time,hoyi_transfer.tran_date) >= 0 and DATEDIFF( '"
                + startDate + "' ,hoyi_transfer.create_time) <=30 " + " and hoyi_transfer.create_time < '" + endDate
                + "') ) and hoyi_transfer.remit_type ='" + remitType
                + "' and hoyi_transfer.is_need_transfer = 'N' and hoyi_transfer.current_status ='01' and (hoyi_transfer.is_cancel = 'N' OR hoyi_transfer.is_cancel IS NULL ) "
                + "and hoyi_transfer.tran_date > '2016-11-01'";// 生成凭证是异步的，需全面考虑对以前漏掉的数据作处理

        String sql = "select sum(remit_money), sum(trade_money),shop_id, shop_code, shop_name, in_account, remit_in, 'N' as is_platform, user_code, square_type from "
                + "(select hoyi_transfer.remit_money,hoyi_transfer.trade_money,hoyi_transfer.shop_id,hoyi_transfer.shop_code,hoyi_transfer.shop_name,hoyi_transfer.in_account,hoyi_transfer.remit_in,shop.platform_id, shop.user_code, shop.square_type from "
                + "hoyi_transfer" + ",hoyi_shop shop" + whereSql
                + " and hoyi_transfer.shop_code=shop.code and shop.platform_id is null order by tran_date desc) a group by(shop_code)"
                + "union "
                + "select sum(remit_money), sum(trade_money),shop_id, shop_code, shop_name, in_account, remit_in, 'Y' as is_platform, user_code, square_type from "
                + "(select hoyi_transfer.remit_money,hoyi_transfer.trade_money,shop.id as shop_id,shop.code as shop_code,shop.name as shop_name,shop.account_no as in_account,shop.account_name as remit_in, shop.user_code, shop.square_type from "
                + "hoyi_transfer" + ",hoyi_shop,hoyi_shop shop" + whereSql
                + " and hoyi_transfer.shop_code=hoyi_shop.code and hoyi_shop.platform_id =shop.id and shop.shop_type='03' order by tran_date desc) a group by(shop_code)";
        System.out.println(whereSql);
        System.out.println(sql);
    }


}
