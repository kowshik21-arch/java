import java.util.Scanner;
public class bankloan {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int salary =sc.nextInt();
        int credit =sc.nextInt();
        if( salary > 25000 && credit>700){
            System.out.println("load approved");
        }
        else{
            System.out.println("loan rejected");
        }
    }
}
