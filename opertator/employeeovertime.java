import java.util.Scanner;
public class employeeovertime {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int working=sc.nextInt();
        int attanance=sc.nextInt();
        if(working>40 && attanance >90){
            System.out.println("ELIGIBLE");
        }
        else{
            System.out.println("NOT ELIGIBE");
        }
    }
}
