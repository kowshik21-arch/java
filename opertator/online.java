import java.util.Scanner;
public class online {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=a+b/2;
        if( a>=50 && b>=50){
            if(c<60){
                System.out.print("Fail");
            }
            else{
                System.out.println("Pass");
            }
        }
        else{
            System.out.println("Fail");
        }

    }
}
