import java.util.Scanner;
public class electriciytbill {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int value=sc.nextInt();
        int appliences=sc.nextInt();
        if((value&appliences)!=0){
            System.out.println("Active");
        }
        else{
            System.out.println("Inactive");
        }
    }
}
