
public class DataStructuresTest {
    
    public static void main(String[] args) {
        System.out.println("Hello World");
        DataStructures ds = new DataStructures();

        ds.createArrayList();
        ds.createHashMap();

        // for loops

        for (int i = 0; i <= 10; i++) {
            System.out.println(i);
        }

        // while loops -> will run as long as a condition is met
        int i = 0;

        while (i < 10) {
            System.out.println("Running");
            i++;
        }
        // enhanced for loops -> Used to loop through collections

        // Collections -> fixed arrays, ArrayList, HashMap

        int[] numbers = new int[10];
        System.out.println(numbers.toString());

        numbers[3] = 99;
        System.out.println(numbers.length);

        for (int pumpernickle : numbers) {
            System.out.println("Number: " + pumpernickle);
        }
    }
}
