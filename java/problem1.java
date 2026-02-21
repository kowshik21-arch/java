import java.util.Scanner;
public class sample{
    public static void main(String [] args){
        Scanner scan=new Scanner(System.in);
        int a=scan.nextInt();
        int b=scan.nextInt();
        int c=scan.nextInt();
        int d=scan.nextInt();
        int e=scan.nextInt();
        int f=d+e;
        int g=a+b+c;
        int total=g-f;
        System.out.print(total);
}
}