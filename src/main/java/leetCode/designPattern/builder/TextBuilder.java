package leetCode.designPattern.builder;

/**
 * @ClassName TextBuilder
 * @Description TODO
 * @Author Dave
 * @Date 2018/11/12 16:43
 * @Version 1.0
 **/
public class TextBuilder extends Builder {

    private StringBuffer buffer = new StringBuffer();

    @Override
    public void makeTitle(String title) {
        buffer.append("=================\n");
        buffer.append("[" + title + "]\n");
        buffer.append("\n");
    }

    @Override
    public void makeString(String str) {
        buffer.append(" " + str + "\n");
        buffer.append("\n");
    }

    @Override
    public void makeItems(String[] items) {
        for (int i = 0; i < items.length; i ++) {
            buffer.append(" " + items[i] + "\n");
        }
        buffer.append("\n");
    }

    @Override
    public void close(){
        buffer.append("===========");

    }

    public String getResult() {
        return buffer.toString();
    }
}
