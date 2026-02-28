import java.util.Scanner;
public class warehousebox {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int box =sc.nextInt();
        int levels=sc.nextInt();
        int total=box<<levels;
        System.out.println(total);  
    }
}
n  