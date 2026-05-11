import java.util.Scanner;
public class maxminarray {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        int max=0;
        int min=0;
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]>arr[i+1]){
                max=arr[i];
            }
        }
         for(int i=0;i<arr.length;i++){
            if(arr[i]<arr[i+1]){
                min=arr[i];
            }
        }
        System.out.println(min);
        System.out.println(max);
    }
}
