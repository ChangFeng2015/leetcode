package leetcode;

public class PhoneNumber {

    private final short areaCode;

    private final short prefix;

    private final short lineNumber;

    public PhoneNumber(int areaCode,int prefix,int lineNumber){

        rangeCheck(areaCode,999,"area code");
        rangeCheck(prefix,999,"prefix");
        rangeCheck(lineNumber,9999,"line number");

        this.areaCode = (short) areaCode;
        this.prefix = (short) prefix;
        this.lineNumber = (short) lineNumber;
    }

    private static void rangeCheck(int arg,int max,String name){
        if(arg < 0 || arg > max){
            throw new IllegalArgumentException(name + ": " + arg);
        }
    }

    @Override
    public int hashCode(){
        return 31*(int)(areaCode + prefix + lineNumber);
    }
}
