package leetCode.designPattern.prototype.framework;

import java.util.HashMap;
import java.util.Objects;

/**
 * @ClassName Manager
 * @Description TODO
 * @Author Dave
 * @Date 2018/11/12 15:04
 * @Version 1.0
 **/
public class Manager {

    private HashMap<String, Product> showCases = new HashMap<>(10);

    public void register(String name, Product product) {
        if (!Objects.isNull(product)) {
            showCases.put(name, product);
        }
    }

    public Product create(String name) {
        return showCases.get(name);
    }
}
