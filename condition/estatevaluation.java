import java.util.Scanner;
public class estatevaluation {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        String location=sc.next();
        int footage=sc.nextInt();
        int age=sc.nextInt();
        int score=sc.nextInt();
        System.out.print("Location Tier : "+location);
        System.out.println("Square footage : "+footage+"sq ft");
        System.out.println("Property Age : "+age+"year");
        System.out.println("Amenity Score : "+score);
        int amount=0;
        if(location.equals("prime")){
            amount=400;
        }
        else if(location.equals("urban")){
            amount=300;
        }
        else if(location.equals("suburban")){
            amount=180;
        }
        else if(location.equals("rural")){
            amount=100;
        }
        System.out.println("Base price per sq ft : "+amount);
        int percentage=0;
        if(age>0 && age<=5){
            percentage=0;
        }
        if(age>=6 && age<=15){
            if(age>=6 && age<=10){
                percentage=5;
            }
            else{
                percentage=10;
            }
        }
        else if(age>=16 && age<=30){
            if(age>=16 && age<=20){
                percentage=15;
            }
            else{
                percentage=20;
            }
        }
        else if(age>=31){
            percentage=25;
        }
        System.out.println("Age adjustment : "+percentage+"%");
        int bonus=0;
        if(score>=80 && score<=100){
            bonus=10;
        }
        else if(score>=60 && score<80){
            bonus=5;
        }
        else if(score>=40 && score<60){
            bonus=2;
        }
        else if(score<40){
            bonus=0;
        }
        double Amenitybonus=amount*bonus/100;
        double basevalue=amount*footage;
        double Amenityvalue=basevalue*(1+percentage/100);
        double finalvalue=Amenityvalue+Amenitybonus;
        System.out.println("Estimated property value : "+finalvalue);
        if(location.equals("prime" )||location.equals("urban") && age<15){
            System.out.println("marketing category : hot");
        }
        else if(location.equals("suburban")||location.equals("rural")&&age>30){
            System.out.println("marketing category : slow");
        }
    }
}
