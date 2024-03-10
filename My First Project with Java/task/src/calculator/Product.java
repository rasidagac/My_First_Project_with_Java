package calculator;

public enum Product {
    BUBBLEGUM(202),
    TOFFEE(118),
    ICE_CREAM(2250),
    MILK_CHOCOLATE(1680),
    DOUGHNUT(1075),
    PANCAKE(80);

    private final int price;

    Product(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public String toTitleCase() {
        return name().charAt(0) + name().substring(1).toLowerCase().replace("_", " ");
    }
}
