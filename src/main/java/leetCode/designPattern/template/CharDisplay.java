package leetCode.designPattern.template;

public class CharDisplay implements AbstractDisplay {

    private char ch;

    public CharDisplay(char a) {
        this.ch = a;
    }
    @Override
    public void open() {
        System.out.print("<<");
    }

    @Override
    public void print() {
        System.out.print(ch);
    }

    @Override
    public void close() {
        System.out.println(">>");
    }

}
