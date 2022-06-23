package L7JAVA;

public class E2
{
    public static void main(String[] args)
    {
        int[] list = {15, 26, 37, 8, 16, 22, 58, -7, -200, 12, 30};

        int min = list[0];
        for (int i = 0; i < list.length; i++)
        {
            if (list[i] < min)
                min = list[i];
        }

        System.out.println("Min is " + min);
    }
}
