package leetcode;

public class Name {

    private String id;

    public boolean equals(Object obj){
        if(obj instanceof Name){
            Name name = (Name)obj;
            return id.equals(name.id);
        }
        return super.equals(obj);
    }

    public int hashCode(){
        return id.hashCode();
    }
}
