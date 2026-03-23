import java.util.Scanner;
public class loop2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String name;
        int score;
        String status;
        int count1 = 0; 
        int count2 = 0;
        int max = 0;
        int total = 0; 
        for (int i = 0; i < n; i++) {
            name = sc.next();
            score = sc.nextInt();
            char grade;
            if (score >= 85 && score <= 100) {
                grade = 'A';
            } else if (score >= 70 && score <= 84) {
                grade = 'B';
            } else if (score >= 60 && score <= 69) {
                grade = 'C';
            } else if (score >= 50 && score <= 59) {
                grade = 'D';
            } else {
                grade = 'F';
            }
            if (score >= 60) {
                status = "Pass";
                count1++;
            } else {
                status = "Fail";
                count2++;
            }
            if (score > max) {
                max = score;
            }
            total += score;
            System.out.println("Student: " + name);
            System.out.println("Score: " + score);
            System.out.println("Grade: " + grade);
            System.out.println("Status: " + status);
        }
        double average = (double) total / n;
        System.out.println("Highest Score: " + max);
        System.out.println("Average Score: " + average);
        System.out.println("Pass Count: " + count1);
        System.out.println("Fail Count: " + count2);
    }
}