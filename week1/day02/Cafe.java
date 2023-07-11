import java.util.HashMap;
import java.util.ArrayList;
import StringsLesson.Printable;
public class Cafe {

    public static void main(String[] args) {

        ArrayList<HashMap<String, Object>> menu = new ArrayList<HashMap<String,Object>>();
    
        HashMap<String, Object> menuItem1 = new HashMap<String,Object>();
        HashMap<String, Object> menuItem2 = new HashMap<String,Object>();
        HashMap<String, Object> menuItem3 = new HashMap<String,Object>();
        HashMap<String, Object> menuItem4 = new HashMap<String,Object>();
        HashMap<String, Object> menuItem5 = new HashMap<String,Object>();
    
    
        menuItem1.put("name", "coffee");
        menuItem1.put("price", 2.99);
        menuItem1.put("maxQuantity", 5);
        menu.add(menuItem1);
        
        menuItem2.put("name", "latte");
        menuItem2.put("price", 3.99);
        menuItem2.put("maxQuantity", 5);
        menu.add(menuItem2);
        
        menuItem3.put("name", "frappuccino");
        menuItem3.put("price", 5.99);
        menuItem3.put("maxQuantity", 5);
        menu.add(menuItem3);
        
        menuItem4.put("name", "cappuccino");
        menuItem4.put("price", 5.99);
        menuItem4.put("maxQuantity", 5);
        menu.add(menuItem4);
    
        menuItem5.put("name", "caramel macchiatto");
        menuItem5.put("price", 7.99);
        menuItem5.put("maxQuantity", 5);
        menu.add(menuItem5);
        
        for (HashMap<String, Object> item : menu) {
            printPriceList(item);
        }
    }

    public static void printPriceList(HashMap<String, Object> item) {
        System.out.println(item.get("name"));
        for (int i = 0; i < (int) item.get("maxQuantity"); i++) {
            System.out.printf("%d - %.2f%n", i+1, (double) item.get("price") * (i+1));
        }
        System.out.println("");
    }

    
    
}
