import java.util.Scanner;
public class factorycal {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int perhour=sc.nextInt();
        int hours=sc.nextInt();
        int overtime=sc.nextInt();
        int rejected=sc.nextInt();
        int finalvalue=(perhour*hours)+overtime-rejected;
        System.out.print(finalvalue);
    }
    }
