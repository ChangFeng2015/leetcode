package leetCode.function;

/**
 * @ClassName Test
 * @Description TODO
 * @Author Dave
 * @Date 2019/2/20 17:28
 * @Version 1.0
 **/
public class Test {
    @org.junit.Test
    public void test() {
       PersonFactory<Person> personFactory = Person :: new;
       Person person = personFactory.create("1", "2");
        System.out.println(person.firstName + person.lastName);
    }
}
