package calculator;

public class Main {
    public static void main(String[] args) {
        Finance finance = new Finance();
        Shop shop = new Shop(finance);
        shop.printProductPrices();
        shop.printFinancialReport();
    }
}