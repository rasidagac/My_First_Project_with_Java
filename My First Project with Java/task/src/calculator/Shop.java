package calculator;

public class Shop {
    private final Finance finance;

    public Shop(Finance finance) {
        this.finance = finance;
    }

    void printProductPrices() {
        System.out.println("Earned amount:");
        for (Product product : Product.values()) {
            System.out.println(product.toTitleCase() + ": $" + product.getPrice());
        }
        System.out.println();
    }

    void printFinancialReport() {
        finance.calculateIncome();
        finance.printIncome();
        finance.printNetIncome();
    }
}
