import java.util.Scanner;
public class atmwidhdraw {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int balance=sc.nextInt();
        int widthdraw=sc.nextInt();
        int limit=sc.nextInt();
        if(widthdraw<=balance && widthdraw<=limit){
            System.out.println("APPROVED");
        }
        else{
            System.out.println("DECLINE");
        }
    }
}
