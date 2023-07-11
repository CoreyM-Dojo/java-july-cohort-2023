import java.util.ArrayList;
import java.util.HashMap;

public class DataStructures {
    
    public void createArrayList() {
        ArrayList<String> names = new ArrayList<>();
        
        names.add("Shaun");
        names.add("Rindy");
        names.add("Tejan");
        names.add("Adrian");
        names.add("Brad");
        names.add("Tiersa");
        
        String tejan = names.get(2);
        names.remove(4);
        

        System.out.println(tejan);

        System.out.println(names);
    }

    public void createHashMap() {
        HashMap<String, String> motorcycle = new HashMap<>(); 

        motorcycle.put("model", "KTM392");
        motorcycle.put("color", "Blue-Orange");
        motorcycle.put("topSpeed", "115");

        System.out.println(motorcycle);

        for (String key : motorcycle.keySet()) {
            System.out.println(key + ": " + motorcycle.get(key));
        }
    }
}
