package visitor;
import java.util.HashMap;
import java.util.Map;

public class Pair {
    public String type;
    public String value;

    public Pair(String type, String value) {
        this.type = type;
        this.value = value;
    }
    public Pair() {}
    public void set(String a,String b) {
        this.type = a;
        this.value = b;
    }
}