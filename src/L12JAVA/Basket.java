package L12JAVA;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Basket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Product apple = new Product("Apple", 10, 4);
        Product orange = new Product("Orange", 15, 5);
        Product banana = new Product("Banana", 20, 3);

        List<Product> productList = new ArrayList<>();
        productList.add(apple);
        productList.add(orange);
        productList.add(banana);


        System.out.println("Выберете продукт: ");
        for (int i = 1; i < productList.size() + 1; i++) {
            System.out.println(i + ". " + productList.get(i - 1).getName() + " - " + productList.get(i - 1).getPrice() + " лей., " + " rating: " + productList.get(i - 1).getRating());
        }
        while (true) {
            System.out.println("Введите номер продукта: ");
            String input = scanner.nextLine();
            if (input.equals("End") || input.equals("end")) {
                break;
            }
            int index = Integer.parseInt(input);

            System.out.println("Введите количество: ");
            String inputQuantity = scanner.nextLine();
            try {
                int quantity = Integer.parseInt(inputQuantity);
                productList.get(index - 1).getResult(quantity);
            } catch (IndexOutOfBoundsException e) {
                System.out.println("Товара с таким кодом не существует");
            }
        }

        System.out.println("Общее количетво фруктов: " + Product.totalQuantity + " Цена: " + Product.totalPrice);

    }

}

