import java.util.*;
public class ThreeConsecutiveOdds {
    public static void main(String[]args){
       Scanner sc=new Scanner(System.in);
        int count=0;
        int length=sc.nextInt();
        int[] arr=new int[length];
        for(int i=0;i<length;i++){
            arr[i]=sc.nextInt();
        }
       for(int i=0;i<arr.length;i++){
            if(arr[i]%2 !=0){
                count++;
            }
            else if(arr[i]%2==0){
                count=0;
            }
            if(count==3){
                System.out.println("true");
            }
       }
       System.out.println("false");
    }
}
