import java.util.Scanner;
public class resturent{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int totalbill=sc.nextInt();
        double service=sc.nextDouble();
        double gst=sc.nextDouble();
        int numofpeople=sc.nextInt();
        double finalservice=(totalbill*service)/100;
        double finalbill=totalbill+finalservice;
        double finalgst=(finalbill*gst)/100;
        finalbill=finalgst+finalbill;
        finalbill=finalbill/numofpeople;
        System.out.print(finalbill);
    }
}