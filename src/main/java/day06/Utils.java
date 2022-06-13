package day06;

public class Utils {

    public static void printBox(Box b) {
        // what is this content
        Object value = b.getContent();
        
        if (value instanceof String) {
            System.out.println("This is a String");
        } else if (value instanceof Integer) {
            System.out.println("This is an Integer");
        }
    }

}
