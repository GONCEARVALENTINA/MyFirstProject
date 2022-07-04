package Lesson9;

public class Outer {

    int[] nums;// ПОЛЕ КЛАССА

    Outer(int[] nums) { // КОНСТРУКТОР Outer
        this.nums = nums;
    } // создан обьект- массив

    void analyze() { // МЕТОД ЭНЭЛАЙС
        Inner in0b = new Inner();//
        System.out.println(" Minimum: " + in0b.min());
        System.out.println(" Maximum: " + in0b.max());
        System.out.println(" Averange: " + in0b.avg());
    }

    class Inner { //ВСТОЕННЫЙ КЛАСС
        int min() {                 //определние минимума
            int m = nums[0];
            for (int i = 1; i < nums.length; i++) // перебор массива
                if (nums[i] < m) m = nums[i];
            return m;
        }

        int max() {             // определение максимума
            int m = nums[0];
            for (int i = 1; i < nums.length; i++)
                if (nums[i] > m) m = nums[i];
            return m;
        }

        int avg() { // вычисление среднего значения
            int a = 0;
            for (int i = 1; i < nums.length; i++)
                a += nums[i];
            System.out.println(a);
            System.out.println(nums.length);
            return a / nums.length;

        }
    }
}





