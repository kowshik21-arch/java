import java.util.Scanner;
public class digitalsignal {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int value=sc.nextInt();
        int toggle=sc.nextInt();
        int togglesingnal=value^toggle;
        System.out.println(togglesingnal);
    }
}
