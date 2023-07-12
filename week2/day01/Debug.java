import java.util.ArrayList;
import java.util.Random;
public class Debug {
    
    Random random = new Random();

    public void greet() {
        System.out.println("Greetings!");
    }

    public String greet(String message) {
        return "Greetings again!";
    }

    public int greet(int num) {
        return num;
    }

    public ArrayList<Integer> generateNumsList() {
        ArrayList<Integer> nums  = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            int randNum = random.nextInt(100);
            nums.add(randNum);
        }

        return nums;
    }

    // This method will return the value at the index of the passed in list
    public int get(String[] nums, int idx) {

        try {
            return Integer.parseInt(nums[idx]); 
        } catch (NumberFormatException e) {
            System.out.println(String.format("The value at index %d was not a number", idx));
            return -1;
        }
    } 

}