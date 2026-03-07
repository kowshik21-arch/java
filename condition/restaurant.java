import java.util.Scanner;
public class restaurant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String orderType = sc.nextLine();
        String loyaltyStatus = sc.nextLine();
        double orderValue = sc.nextDouble();
        sc.nextLine();
        String timeSlot = sc.nextLine();
        double baseDiscount = 0;
        double timeAdjustment = 0;
        double serviceFee = 0;
        double totalDiscount;
        double discountedValue;
        double finalAmount;
        String priority = "";
        int prepTime = 0;
        if(loyaltyStatus.equalsIgnoreCase("Gold"))
            baseDiscount = 15;
        else if(loyaltyStatus.equalsIgnoreCase("Silver"))
            baseDiscount = 10;
        else if(loyaltyStatus.equalsIgnoreCase("Bronze"))
            baseDiscount = 5;
        else
            baseDiscount = 0;
        if(timeSlot.equalsIgnoreCase("Late-Night"))
            timeAdjustment = -5;
        else
            timeAdjustment = 0;
        totalDiscount = baseDiscount - timeAdjustment;
        if(orderType.equalsIgnoreCase("Delivery"))
            serviceFee = orderValue * 0.10;
        else if(orderType.equalsIgnoreCase("Takeout"))
            serviceFee = orderValue * 0.03;
        else
            serviceFee = 0;
        discountedValue = orderValue * (1 - totalDiscount / 100);
        finalAmount = discountedValue + serviceFee;
        if(timeSlot.equalsIgnoreCase("Peak")) {
            if(orderType.equalsIgnoreCase("Delivery"))
                priority = "High";
            else
                priority = "Medium";
        }
        else if(timeSlot.equalsIgnoreCase("Regular")) {
            priority = "Medium";
        }
        else {
            priority = "Low";
        }
        if(priority.equals("High")) {
            if(orderType.equalsIgnoreCase("Delivery"))
                prepTime = 25;
            else
                prepTime = 30;
        }
        else if(priority.equals("Medium")) {
            if(orderValue > 150)
                prepTime = 25;
            else
                prepTime = 20;
        }
        else {
            prepTime = 15;
        }
        System.out.println("Order Type: " + orderType);
        System.out.println("Loyalty Status: " + loyaltyStatus);
        System.out.println("Order Value: $" + orderValue);
        System.out.println("Time Slot: " + timeSlot);
        System.out.println("Base Discount: " + (int)baseDiscount + "%");
        System.out.println("Time-Based Adjustment: " + (int)timeAdjustment + "%");
        System.out.printf("Service Fee: $%.1f\n", serviceFee);
        System.out.printf("Final Amount: $%.2f\n", finalAmount);
        System.out.println("Kitchen Priority: " + priority);
        System.out.println("Estimated Prep Time: " + prepTime + " minutes");
        sc.close();
    }
}