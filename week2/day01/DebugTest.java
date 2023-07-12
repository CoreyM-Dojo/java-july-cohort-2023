import java.util.ArrayList;
import java.util.HashMap;
public class DebugTest {
    public static void main(String[] args) {
        Debug debugger = new Debug();

        String[] numStrings = {"11", "Bird", "222", "7845785", "false"};

        debugger.greet();
        debugger.greet("Hello");
        ArrayList<Integer> nums = debugger.generateNumsList();
        HashMap<String,String> strings = new HashMap<>();
        System.out.println(debugger.get(numStrings, 0));
    }
}
