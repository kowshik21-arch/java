import java.util.Scanner;
public class fuelcost {
    public static void main(){
        Scanner sc=new Scanner(System.in);
        int diatance=sc.nextInt();
        int mileage=sc.nextInt();
        int fuelprice=sc.nextInt();
        int tollcharge=sc.nextInt();
        double petrol=diatance/mileage;
        double fee=petrol*fuelprice;
        double finalfee=fee+tollcharge;
        System.out.print(finalfee);
    }
    }