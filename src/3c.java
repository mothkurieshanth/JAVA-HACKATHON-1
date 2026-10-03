import java.util.Scanner;
class Main2 {
    static double calculateTotalWaste(double point1Waste, double point2Waste) {
        return point1Waste + point2Waste;
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter waste at point 1: ");

        double a = sc.nextDouble();
        System.out.print("Enter waste at point 2: ");

        double b = sc.nextDouble();
        double total = calculateTotalWaste(a, b);
        System.out.println("Total waste collected: " + total);
    }
}
