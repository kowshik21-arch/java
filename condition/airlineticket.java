import java.util.Scanner;
public class airlineticket {
public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    String booking=sc.next();
    int days=sc.nextInt();
    double percentage=sc.nextDouble();
    String type=sc.next();
    System.out.println("Booking class " +booking);
    System.out.println("Days until depature " +days);
    System.out.println("seat availability : "+percentage);
    System.out.println("route type : "+type);
    double amount=0;
    if(booking.endsWith("economy")){
        if(type.equals("domestic")){
            amount=200;
        }
        else if(type.equals("int-short")){
            amount=500;
        }
        else if(type.equals("int-long")){
            amount=800;
        }
    }
    if(booking.endsWith("business")){
        if(type.equals("domestic")){
            amount=600;
        }
        else if(type.equals("int-short")){
            amount=1500;
        }
        else if(type.equals("int-long")){
            amount=2500;
        }
    }
    if(booking.endsWith("first")){
        if(type.equals("domestic")){
            amount=1000;
        }
        else if(type.equals("int-short")){
            amount=3000;
        }
        else if(type.equals("int-long")){
            amount=5000;
        }
    }
    System.out.println("base price : "+amount);
    double demand=0;
    if(percentage<30 && days<14){
        demand=1.8;
        System.out.println("pricing category : high demand");
    }
    else if(percentage<50 && days<30){
        demand=1.5;
        System.out.println("pricing category : high demand");
    }
    else if(percentage<60 && days>30 && days>60){
        demand=1.0;
        System.out.println("pricing category : moderate");
    }
    else if(percentage<60 && days>=60){
        demand=0.9;
        System.out.println("pricing category : low demand");
    }
    System.out.println("demand multiplier : "+demand+"x");
    double finalamount=amount*demand;
    System.out.println("final ticket pricing : "+finalamount);
    }
}
