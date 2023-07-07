@SuppressWarnings(value = { "All" })
//noinspection
public class OfficeHours {
    public static void main(String[] args) {
        System.out.println("Lets debug!");

        // boolean isSafe = null; Primitive datatypes cannot be set to null 
        int num = 12;
        // num = false; You cannot assign a boolean value to a variable declared as int
        num = 30;

        double pi = 3.14;
        int age = 30;

        int max = Integer.MAX_VALUE;
        int maxPlusOne = max + 100;

        System.out.println(maxPlusOne);

        double agePlusPI = (pi + age);

        if (num > 10) {
            System.out.println("We have a number here");
        } 
        String hello = "Hello World";
        System.out.println(hello);
        doSomething();
    }

    public static void doSomething() {
        System.out.println("Its doing it!");
    }

}
