import java.util.Scanner;
public class paekingfee {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        String zone =sc.next();
        String type =sc.next();
        String memebership=sc.next();
        sc.nextLine();
        Double hours =sc.nextDouble();
        System.out.println("Loaction Zone : "+zone);
        System.out.println("Parking duration : "+hours);
        System.out.println("Vehical type : "+type);
        System.out.println("Membership Status : "+memebership);
        double rate=5.00;
        System.out.println("Base hourly Rate : $"+rate);
        int premium=0;
        if(zone.equals("Downtown")){
            premium=50;
        }
        else if(zone.equals("Business-District")){
            premium=30;
        }
        else if(zone.equals("Residential ")){
            premium=0;
        }
        else if (zone.equals("Airport ")) {
            premium=100;
        }
        System.out.println("Zone premium : "+premium);
        double rerate=0;
        if(type.equals("Motorcycle")){
            rerate=rerate-2;
        }
        else if(type. equals("Compact")){
            rerate=rerate-0;
        }
        else if(type.equals("Sedan")){
            rerate=rerate-0;
        }
        else if(type.equals("SUV")){
            rerate=rerate+3;
        }
        else if(type.equals("Oversized")){
            rerate=rerate+5;
        }
        System.out.println("Vehicle Size Surcharge : "+rerate);
        double rawfee=rate*(1+premium/100)+(rerate*hours);
        double discount=0;
        if(memebership.equals("None")){
            discount=0;
        }
        else if(memb)
    }
}
    
        
        



