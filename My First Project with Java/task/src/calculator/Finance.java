package calculator;

import java.util.Scanner;

public class Finance {
    static int income = 0;
    static int staffExpenses = 0;
    static int otherExpenses = 0;

    final Scanner scanner = new Scanner(System.in);

    void calculateIncome() {
        for (Product product : Product.values()) {
            income += product.getPrice();
        }
    }

    void printIncome() {
        System.out.println("Income: $" + income);
    }

    void getExpensesFromUser() {
        System.out.println("Staff expenses:");
        staffExpenses = scanner.nextInt();
        System.out.println("Other expenses:");
        otherExpenses = scanner.nextInt();
    }

    void printNetIncome() {
        getExpensesFromUser();
        System.out.println("Net income: $" + (income - staffExpenses - otherExpenses));
    }
}
