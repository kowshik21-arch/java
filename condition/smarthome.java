import java.util.Scanner;
public class smarthome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String timeOfDay = sc.nextLine();
        double powerConsumption = sc.nextDouble();
        double renewablePercentage = sc.nextDouble();
        sc.nextLine();
        String rateTier = sc.nextLine();
        double baseRate = 0;
        double multiplier = 1;
        double renewableCredit;
        double totalCost;
        double potentialSavings = 0;
        String recommendation = "";
        if(rateTier.equalsIgnoreCase("Basic")) {
            baseRate = 0.18;
        }
        else if(rateTier.equalsIgnoreCase("Time-of-Use")) {
            baseRate = 0.15;
        }
        else if(rateTier.equalsIgnoreCase("Premium-Green")) {
            baseRate = 0.12;
        }
        if(timeOfDay.equalsIgnoreCase("Peak")) {
            if(rateTier.equalsIgnoreCase("Time-of-Use"))
                multiplier = 1.8;
            else
                multiplier = 1.5;
        }
        else if(timeOfDay.equalsIgnoreCase("Off-Peak")) {
            if(rateTier.equalsIgnoreCase("Time-of-Use"))
                multiplier = 0.8;
            else
                multiplier = 1.0;
        }
        else if(timeOfDay.equalsIgnoreCase("Super-Off-Peak")) {
            if(rateTier.equalsIgnoreCase("Premium-Green"))
                multiplier = 0.6;
            else
                multiplier = 0.5;
        }
        renewableCredit = (powerConsumption * renewablePercentage / 100) * baseRate;
        totalCost = (powerConsumption * baseRate * multiplier) - renewableCredit;
        if(totalCost < 0)
            totalCost = 0;
        if(timeOfDay.equalsIgnoreCase("Peak")) {
            if(renewablePercentage < 20) {
                recommendation = "Shift high-power appliances to Off-Peak hours";
                potentialSavings = powerConsumption * baseRate * (multiplier - 0.8);
            }
            else if(renewablePercentage >= 70) {
                recommendation = "Great renewable usage! Minor peak reduction possible";
                potentialSavings = powerConsumption * baseRate * 0.2;
            }
        }
        else if(timeOfDay.equalsIgnoreCase("Super-Off-Peak")) {
            if(renewablePercentage >= 50) {
                recommendation = "Excellent! Maximize appliance use during this period";
                potentialSavings = 0;
            }
        }
        else if(timeOfDay.equalsIgnoreCase("Off-Peak")) {

            if(rateTier.equalsIgnoreCase("Basic")) {
                recommendation = "Consider upgrading to Time-of-Use plan";
                potentialSavings = 0.75;
            }
            else if(rateTier.equalsIgnoreCase("Time-of-Use")) {
                recommendation = "Good timing! Consider increasing renewable capacity";
                potentialSavings = 0;
            }

        }
        System.out.println("Time of Day: " + timeOfDay);
        System.out.println("Power Consumption: " + powerConsumption + " kWh");
        System.out.println("Renewable Energy: " + renewablePercentage + "%");
        System.out.println("Rate Tier: " + rateTier);
        System.out.printf("Base Rate: $%.2f/kWh\n", baseRate);
        System.out.println("Rate Multiplier: " + multiplier + "x");
        System.out.printf("Renewable Credit: $%.2f\n", renewableCredit);
        System.out.printf("Total Cost: $%.2f\n", totalCost);
        System.out.println("Optimization Recommendation: " + recommendation);
        System.out.printf("Potential Savings: $%.2f\n", potentialSavings);
        sc.close();
    }
}