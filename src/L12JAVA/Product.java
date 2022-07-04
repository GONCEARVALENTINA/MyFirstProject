package L12JAVA;

class Product {
    protected static int totalPrice = 0;
    protected static int totalQuantity = 0;
    private final String name;
    private final int price;
    private final int rating;

    Product(String name, int price, int rating) {
        this.name = name;
        this.price = price;
        this.rating = rating;
    }

    public void getResult(int quantity) {
        totalQuantity += quantity;
        totalPrice += (price * quantity);
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public int getRating() {
        return rating;
    }
}
