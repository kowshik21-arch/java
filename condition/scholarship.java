import java.util.Scanner;
public class scholarship {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        double gpa=sc.nextDouble();
        double familylncome=sc.nextDouble();
        int score=sc.nextInt();
        String type=sc.next();
        System.out.println("GPA : "+gpa);
        System.out.println("family income : "+familylncome);
        System.out.println("extracurricularscore : "+score);
        System.out.println("Scholership Type : "+type);
        String category=null;
        double amount=0;
        if(gpa>=2.5){
            System.out.println("Eligibility : Eligibile");
            if(type.equals("merit")){
            if(gpa>=3.8 && score>=80){
                category="full";
                amount=25000;
            }
            else if(gpa>=3.5 && score>=70){
                category="partial";
                amount=15000;
            }
            else if(gpa>3.0 && score>=60){
                category="minimum";
                amount=8000;
            }
            }
            else if(type.equals("need-based")){
                if(familylncome<=30000 && gpa>=3.5){
                    category="full";
                    amount=30000;
                }
                else if(familylncome<=50000 && gpa>=3.0){
                    category="partial";
                    amount=18000;
                }
                else if(familylncome<=70000 && gpa>=2.8){
                    category="minimal";
                    amount=10000;
                }
            }
            else if(type.equals("sports")){
                if(score>=85 && gpa>=3.0){
                    category="full";
                    amount=22000;
                }
                else if(score>=75 && gpa>=2.8){
                    category="partial";
                    amount=20000;
                }
                else if(score>=65 && gpa>=2.5){
                    category="minimal";
                    amount=12000;
                }
            }
            System.out.println("award amount : "+amount);
        System.out.println("award category : "+category);
        }
        else{
            System.out.println("Eligibility : noteligibility");
        }
    }
}