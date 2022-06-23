package L7JAVA;
import java.util.Arrays;
public class E1 {
    public static void main(String[] args) {

        int[] inp = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int n = inp.length;

        int[] a = new int[(n + 1)/2 + (n + 1)/4]; //50% + 25% = 75%

        System.arraycopy(inp, 0, a, 0, a.length);
        System.out.println(Arrays.toString(a));

    }
}
