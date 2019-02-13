package leetCode.designPattern.singleton;

/**
 * @ClassName Triple
 * @Description TODO
 * @Author Dave
 * @Date 2018/10/10 17:57
 * @Version 1.0
 **/
public enum Triple {
    /**
     * 1
     */
    ONE,
    /**
     * 2
     */
    TWO,
    /**
     * 3
     */
    THREE;

    public static Triple getInstance(int index) {
        switch (index) {
            case 1:
                return ONE;
            case 2:
                return TWO;
            default:
                return THREE;
        }
    }
}
