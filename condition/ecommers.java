import java.util.Scanner;
public class ecommers {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        String tier=sc.next();
        double cartvalue=sc.nextDouble();
        String category=sc.next();
        String membership=sc.next();
        System.out.println("loality tier : "+tier);
        System.out.println("Cart value : "+cartvalue);
        System.out.println("product category : "+category);
        System.out.println("membership : "+membership);
        int discount=0;
        if(tier.equals("bronze")){
            discount=5;
        }
        else if(tier.equals("silver")){
            discount=8;
        }
        else if(tier.equals("gold")){
            discount=12;
        }
        else if(tier.equals("platinum")){
            discount=15;
        }
        System.out.println("base discount : "+discount+"%");
        int additionaldiscount=0;
        if(cartvalue>=500 && cartvalue<1000){
            additionaldiscount=additionaldiscount+3;
        }
        else if(cartvalue>=1000 && cartvalue<2000){
           additionaldiscount=additionaldiscount+5;
        }
        else if(cartvalue>=2000){
            additionaldiscount=additionaldiscount+7;
        }
        if(category.equals("electronics") && membership.equals("prime")){
            additionaldiscount=additionaldiscount+5;
        }
        else if(category.equals("fashion")){
            additionaldiscount=additionaldiscount+3;
        }
        else if(category.equals("books") && membership.equals("prime")){
            additionaldiscount=additionaldiscount+5;
        }
        else if(category.equals("groceries") && cartvalue>300){
            additionaldiscount=additionaldiscount+2;
        }
        System.out.println("additional discount : "+additionaldiscount+"%");
        int totaldiscount=discount+additionaldiscount;
        System.out.println("totaldiscount : "+totaldiscount+"%");
        double finalprice=cartvalue*(1-totaldiscount/100);
        System.out.println("finalprice : "+finalprice);
        double savings=cartvalue-finalprice;
        System.out.print("Savings : "+savings);
    }
}