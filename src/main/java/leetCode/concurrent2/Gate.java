package leetCode.concurrent2;

/**
 * @ClassName Gate
 * @Description TODO
 * @Author Dave
 * @Date 2018/11/16 17:54
 * @Version 1.0
 **/
public class Gate {

    private int counter = 0;
    private String name = "Nobody";
    private String address = "Nowhere";

    public void pass(String name, String address) {
        this.counter++;
        this.name = name;
        this.address = address;
        check();
    }

    public String toString() {
        return "NO." + counter + ":" + name + ", " + address;
    }

    private void check() {
        if (name.charAt(0) != address.charAt(0)) {
            System.out.println("******* broken ******" + toString());
        }
    }

}
