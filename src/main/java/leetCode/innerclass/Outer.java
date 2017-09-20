package leetCode.innerclass;

/**
 * Created by Dave on 2017/9/20.
 */
public class Outer {
    class Inner{
        private String label;
        Inner(String label){
            this.label = label;
        }
        void readLabel(String msg){
            System.out.println(msg);
        }
    }
    Inner getInner(String label){
        return new Inner(label);
    }

    public static void main(String[] args){
        Outer o = new Outer();
        Outer.Inner p = o.getInner("abc");
        p.readLabel(p.label);
    }
}
