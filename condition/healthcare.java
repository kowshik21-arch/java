import java.util.Scanner;
public class healthcare {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int age=sc.nextInt();
        String status=sc.next();
        String condition=sc.next();
        String tier=sc.next();
        System.out.println("Age : "+age);
        System.out.println("Smoking Status : "+status);
        System.out.println("perexisting condition : "+condition);
        System.out.println("coveeage tier"+tier);
        double Basicpremium=0;
        if(age>=18 && age<=30){
            if(tier.equals("basic")){
                Basicpremium=200;
            }
            else if(tier .equals("standard")){
                 Basicpremium=300;
            }
            else if(tier .equals("premium")){
                Basicpremium=500;
            }
        }
        else if(age>=31 && age<=50){
             if(tier.equals("basic")){
                Basicpremium=250;
            }
            else if(tier .equals("standard")){
                Basicpremium=350;
            }
            else if(tier .equals("premium")){
                Basicpremium=600;
            }
        }
        else if(age>=51 && age<=65){
             if(tier.equals("basic")){
                Basicpremium=350;
            }
            else if(tier .equals("standard")){
                Basicpremium=450;
            }
            else if(tier .equals("premium")){
                Basicpremium=700;
            }
        }
        else if(age>=66){
             if(tier.equals("basic")){
                Basicpremium=400;
            }
            else if(tier .equals("standard")){
                Basicpremium=550;
            }
            else if(tier .equals("premium")){
                Basicpremium=800;
            }
        }
        double value=0;
        if(status.equals("somker")){
            value=Basicpremium+(Basicpremium*40/100);
        }
        else if(tier.equals("premium")){
            value=Basicpremium+(Basicpremium*30/100);
        }
        else if(status.equals("somker") && tier.equals("premium")){
             value=Basicpremium+(Basicpremium*70/100);
        }
        double addion=Basicpremium+value;
        System.out.println("Basic premium : "+Basicpremium);
        System.out.println("risk surcharge : "+value);
        System.out.println("total monthly premium : "+addion);
    }
}
