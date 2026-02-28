import java.util.*;
public class creditcardpurchase {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int limit=sc.nextInt();
        int amount=sc.nextInt();
        int blocked=sc.nextInt();
        if(blocked==0){
            if(amount<=limit)  {
                System.out.println("Approved");
            }
            else{
                System.out.println("Not Approved");
            }
        }
        else{
            System.out.println("Not Approved");
        }
    }
}
