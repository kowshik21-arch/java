import java.util.Scanner;
public class systemlogin {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int name=sc.nextInt();
        int password=sc.nextInt();
        int locked=sc.nextInt();
        if(name==1 && password==1 && locked==0){
            System.out.println("login sccess");
        }
        else{
            System.out.println("Login failed");
        }
    }
}
