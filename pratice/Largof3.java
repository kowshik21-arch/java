import java.util.Scanner;
public class Largof3{
    public static void main(String[]arg){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        if(a>b && a>c){
            System.out.println("Max value :"+a);
        }
        else if(b>a && b>c){
            System.out.println("Max value :"+b);
        }
        else{
            System.out.println("Max value :"+c);
        }

    }
} 

