
public class Intro {
    public static void main(String[] args) {

        System.out.println("Hello World");

        Integer number = null; // Only Wrapper Classes/Object Data Types can be null
        int num = 10;
        double dbl = 10.0;
        // long lng = 9873458912375981768689698674897264; // A reallllly long number
        char a = 'a';

        String color = "Red";

        /*
        - Every primitive data type has a Wrapper Class
         * Integer 
         * Boolean
         * Double
         * Character
         * Long
         * 
        */
        
        System.out.println("I'm making a change!");
        
        
        boolean isHungry = false;
        boolean isThirsty = true;

        if (isHungry || isThirsty) {
            System.out.println("I'm hungry!");
        } else if (isThirsty) {
            System.out.println("I'm thirsty");
        } else {
            System.out.println("I'm good");
        }

        boolean isGreaterThan5 = num > 5 ? true : num > 10 ? true :  false; // This is a ternary

        switch (color) {
            case "Red" :
                color = "Orange";
                break;
            case "Orange":
                color = "Yellow";
                break;
            case "Yellow":
                color = "Blue";
                break;
            case "Blue":
                color = "Indigo";
                break;
            case "Indigo":
                color = "Violet";
                break;
            case "Violet":
                color = "Red";
                break;
        }

    }
}