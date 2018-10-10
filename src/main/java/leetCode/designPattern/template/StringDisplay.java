package leetCode.designPattern.template;

public class StringDisplay implements AbstractDisplay {

    private String name;
    private int width;

    public StringDisplay(String name) {
        this.name = name;
        this.width = name.getBytes().length;
    }

    @Override
    public void open() {
        printLine();
    }


    @Override
    public void print() {
        System.out.println("|" + name + "|");
    }

    @Override
    public void close() {
        printLine();
    }

    private void printLine() {
        System.out.print("+");
        for (int i = 0; i < width; i++) {
            System.out.print("-");
        }
        System.out.println("+");
    }


}
