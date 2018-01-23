package leetcode.xml2bean;

import com.thoughtworks.xstream.XStream;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class Demo1 {
    public List<Province> getProinvceList() {
        Province p1 = new Province();
        p1.setName("北京");
        p1.addCity(new City("东城区", "DongChengQu"));
        p1.addCity(new City("昌平区", "ChangPingQu"));
        Province p2 = new Province();
        p2.setName("辽宁");
        p2.addCity(new City("沈阳", "shenYang"));
        p2.addCity(new City("葫芦岛", "huLuDao"));
        List<Province> provinceList = new ArrayList<Province>();
        provinceList.add(p1);
        provinceList.add(p2);
        return provinceList;
    }

    @Test
    public void fun1() {
        List<Province> proList = getProinvceList();
                 /*
          * 创建XStream对象
           * 调用toXML把集合转换成xml字符串
           */
        XStream xstream = new XStream();
        String s = xstream.toXML(proList);
        System.out.println(s);
    }
}
