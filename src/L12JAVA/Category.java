package L12JAVA;

public class Category {
    public static void main(String[] args) {


        String[] products = new String[]{"Хлеб", "Яблоки", "Молоко"};
        int[] prices = new int[]{100, 200, 300};
        int[] basket = {0, 1, 2};

        int totalAmount = 0;
        for (int i = 0; i < basket.length; i++) {
            if (basket[1] > 0) {
                int amount = prices[i] * basket[i];
                System.out.println(String.format("Товар: %s, на стоимость: %s, на сумму: %s", products[i], prices[i], amount));
                totalAmount += amount;
            }

        }

        System.out.println("Сумма итого:" + totalAmount);
    }


}




