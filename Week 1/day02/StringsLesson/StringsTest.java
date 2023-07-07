
public class StringsTest {
    public static void main(String[] args) {
        Strings stringClass = new Strings();
        stringClass.hello();

        // String concatenation

        String firstName = "Adrian";
        String lastName = "Matthis";
        String favColor = "Blue";
        int seven = 7;
        boolean isHungry = true;

        String fullName = firstName + " " + lastName;

        System.out.println(fullName);

        // String interpolation
        String message = String.format("Hi, my name is %s %s. My favorite color is %s. I have %d goats who, its %b that they are always hungry.", firstName, lastName, favColor, seven, isHungry );

        System.out.println(message);

        String strOne = new String("Help");
        String strTwo = "Help";

        Boolean isEqual = strOne == strTwo;

        System.out.println(isEqual);

        double newDbl = seven;
        int newInt = (int) newDbl;

        double secondDbl = (double) seven;



    }
}
