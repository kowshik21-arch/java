import java.util.Scanner;
public class shipping {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int cart=sc.nextInt();
        int premium=sc.nextInt();
        if(cart>999 || premium==1){
            System.out.println("free shipping");
        }
        else{
            System.out.println("shipping charge is added");
        }
    }
}
