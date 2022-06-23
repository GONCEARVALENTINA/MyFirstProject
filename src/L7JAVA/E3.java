package L7JAVA;
import java.util.Arrays;
import java.util.Comparator;

public class E3 {
    public static void main(String[] args) {
        String s = "Today is the happiest day of my life";
        String longest = Arrays.stream(s.split(" "))
                .max(Comparator.comparingInt(String::length))
                .orElse(null);
        System.out.println("The longest word in the string is: " + longest);


    }
}
