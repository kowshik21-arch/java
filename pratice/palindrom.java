public class palindrom {
    public static void main(String[]args){
        String s="racecar";
        String rev="";
        for(int i=s.length()-1;i>=0;i--){
            char c=s.charAt(i);
            rev+=c;
        }
        System.out.println(rev);
        if(s.equals(rev)){
            System.out.println("Palindrom");
        }
        else{
            System.out.println("Not palindrom");
        }
        Leapyear lp = new Leapyear();
        System.out.println(lp.add(5, 8));
    }
}
