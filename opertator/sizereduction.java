import java.util.Scanner;
public class sizereduction {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int filesize=sc.nextInt();
        int compressioncycles=sc.nextInt();
        int finalvalue=filesize>>compressioncycles;
        System.out.println(finalvalue);
    }
}
