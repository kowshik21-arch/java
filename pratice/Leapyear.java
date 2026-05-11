import java.util.Scanner;
public class Leapyear {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        if(a%4==0 && a%100!=0 || a%400==0){
            System.out.println("Leap year");
        }
        else{
            System.out.println("Not Leap year");
        }
    }
    public int add(int a, int b)
    {
        return a + b;
    }
}
