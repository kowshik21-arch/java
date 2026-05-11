import java.util.Scanner;
public class Eligiblevote
{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        if(a>=18){
            System.out.println("Eligible for voting");
        }
        else {
            System.out.println("Not eligible for vote");
        }
    }
}
