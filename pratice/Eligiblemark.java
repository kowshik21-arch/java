import java.util.Scanner;
public class Eligiblemark {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a = sc.nextInt();
        if(a>40){
            System.out.println("Pass");
        }
        else{
            System.out.println("Fail");
        }
    }
}