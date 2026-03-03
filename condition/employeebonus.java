import java.util.Scanner;
public class employeebonus{
    public static void main(String[]args){
        Scanner s=new Scanner(System.in);
        int rate=s.nextInt();
        int service=s.nextInt();
        String department=s.next();
        double salary=s.nextDouble();
        int bounus=0;
        if (rate>=3) {
            if(department.equals("Critical")){
                if(rate==5 && service<=5){
                    bounus=25;
                }
                else if(rate==4 && service<=10){
                    bounus=22;
                }
                else if(rate==4){
                    bounus=15;
                }
                else if(rate==3){
                    bounus=10;
                }
                else{
                    bounus=0;
                }
            }
            else if(department.equals("Non-Critical")){
                if(rate==5){
                    bounus=18;
                }
                else if(rate==4){
                    bounus=12;
                }
                else if(rate==3){
                    bounus=3;
                }
                else{
                    bounus=0;
                }
            }
        }
        double bounusalary=salary*(bounus/100.0);
        System.out.println("performence rating: "+rate);
        System.out.println("year of service: "+service);
        System.out.println("Depatment: "+department);
        System.out.println("bonus percentage: "+bounus+"%");
        System.out.println("bonus amount: $"+bounusalary);
        if(bounus>0){
            System.out.println("status : elligible");
        }
        else{
            System.out.println("status : not eligible");
        }
    }
}