package leetCode.function;

@FunctionalInterface
public interface Displayable {
    void display();
    default int add(int a,int b){
        return a + b;
    }
}
