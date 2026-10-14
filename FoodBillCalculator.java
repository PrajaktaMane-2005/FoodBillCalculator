
Task 1: Food Bill Calculator


public class FoodBillCalculator {

    public static double calculateFoodGST(double a, double b) {
        return (a + b) + (a + b) * 5 / 100;
    }

    public static double calculateBeverageGST(double c, double d) {
        return (c + d) + (c + d) * 12 / 100;
    }

    public static double calculateDessertGST(double e) {
        return e + e * 18 / 100;
    }

    public static double totalBill(double a, double b, double c,
                                   double d, double e) {
        return calculateFoodGST(a, b)
             + calculateBeverageGST(c, d)
             + calculateDessertGST(e);
    }

    public static double calculateDiscountedBill(double a, double b,
                                                  double c, double d,
                                                  double e) {
        double total = totalBill(a, b, c, d, e);
        double discount = total * 15 / 100;
        return total - discount;
    }

    public static void main(String[] args) {
        double a = 100, b = 100, c = 100, d = 100, e = 100;

        double total = totalBill(a, b, c, d, e);
        double discount = total * 15 / 100;
        double payable = calculateDiscountedBill(a, b, c, d, e);

        System.out.printf("Total after GST = %.2f%n", total);
        System.out.printf("Discount = %.2f%n", discount);
        System.out.printf("Final payable amount = %.2f%n", payable);
    }
}

