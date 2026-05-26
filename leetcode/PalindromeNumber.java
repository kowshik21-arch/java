import java.util.*;
class Solution {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int copy = x;
        int rev = 0;
        if(x < 0){
            System.out.println("false");
        }
    for(;x != 0;x = x/10){
        rev = rev * 10 + x % 10;
    }
    if(copy == rev){
        System.out.println("true");
    }
    else{
        System.out.println("false");
    }
}
}