package leetCode.aha;


import org.apache.commons.collections.ArrayStack;

import java.util.List;

public class Enum {

    /**
     * [][][] + [][][] = [][][] every [] input 1-9,no repeat
     * @return
     */
    public List getResult() {
        ArrayStack result = new ArrayStack();
        for (int a = 1; a < 10; a ++) {
            for (int b = 1; b < 10; b ++) {
                for (int c = 1; c < 10; c ++) {
                    for (int d = 1; d < 10; d ++) {
                        for (int e = 1; e < 10; e ++) {
                            for (int f = 1; f < 10; f ++) {
                                for (int g = 1; g < 10; g ++) {
                                    for (int h = 1; h < 10; h ++) {
                                        for (int i = 1; i < 10; i ++) {
                                            if (a != b && a != c && a != d && a != e && a != f && a != g && a != h && a != i
                                                    && b != c && b != d && b != e && b != f && b != g && b != h && b != i
                                                    && c != d && c != e && c != f && c != g && c != h && c != i
                                                    && d != e && d != f && d != g && d != h && d != i
                                                    && e != f && e != g && e != h && e != i
                                                    && f != g && f != h && f != i
                                                    && g != h && g != i
                                                    && h != i
                                                    && a * 100 + b * 10 + c + d * 100 + e * 10 + f == g * 100 + h * 10 + i) {
                                                ArrayStack equation = new ArrayStack();
                                                equation.push(i);
                                                equation.push(h);
                                                equation.push(g);

                                                equation.push(f);
                                                equation.push(e);
                                                equation.push(d);

                                                equation.push(c);
                                                equation.push(b);
                                                equation.push(a);

                                                result.push(equation);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return result;
    }

    public void test() {
        List result = getResult();

    }
}
