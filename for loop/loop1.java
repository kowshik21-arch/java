import java.util.Scanner;
public class loop1 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        double totalapayroll=0;
        for(int i=0;i<n;i++){
            String name=sc.next();
            double salary=sc.nextDouble();
            int rating=sc.nextInt();
            int percentage=0;
            if(rating==5){
                percentage=15;
            }
            else if(rating==4){
                percentage=10;
            }
            else if(rating==3){
                percentage=5;
            }
            else if(rating==2){
                percentage=2;
            }
            else if (rating==1) {
                percentage=0;
            }
            System.out.println("Employee:"+name);
            System.out.println("Base salary"+salary);
            System.out.println("Performence rating"+rating);
            System.out.println("Increment :"+percentage+"%");
            double finalsalary=salary*(1+percentage/100);
            System.out.println("finalsalary :"+finalsalary);
            totalapayroll=totalapayroll+finalsalary;
        }
        double average=totalapayroll/n;
        System.out.print("total employee proceed :"+n);
        System.out.println("average salary :$"+String.format("%2.f"+average) );
    }
}
