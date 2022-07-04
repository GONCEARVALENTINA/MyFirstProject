package Lesson9;

public class Outer {

    int nums[];// ПОЛЕ КЛАССА

    Outer(int[] nums) { // КОНСТРУКТОР Outer
        this.nums = nums;
    }

    void analyze() { // МЕТОД
        Inner in0b = new Inner();
        System.out.println(" Minimum: " + in0b.min());
        System.out.println(" Maximum: " + in0b.max());
        System.out.println(" Averange: " + in0b.avg());
    }

    class Inner { //ВСТОЕННЫЙ КЛАСС
        int min() {
            int m = nums[0];
            for (int i = 1; i < nums.length; i++)
                if (nums[i] < m) m = nums[i];
            return m;
        }

        int max() {
            int m = nums[0];
            for (int i = 1; i < nums.length; i++)
                if (nums[i] > m) m = nums[i];
            return m;
        }

        int avg() {
            int a = 0;
            for (int i = 1; i < nums.length; i++)
                a += nums[i];
            return a / nums.length;

        }
    }
}





