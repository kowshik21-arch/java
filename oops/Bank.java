public class Bank {
    private int acccountNumber;
    private String name;
    private double balance = 0;

    public Bank(int acno, String name)
    {
        this.acccountNumber = acno;
        this.name = name;
    }



    public int getAccountNumber(){
        return this.acccountNumber;
    }
    public void setAccountNumber(int acno){
        this.acccountNumber = acno;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setBalance(double balance){
        this.balance = balance;
    }

    public void getDetails(){
        System.out.println("Account number: "+this.acccountNumber);
        System.out.println("Name: "+ this.name);
    }


    public void withdraw(int amount){
        if(amount > this.balance)
        {
            System.out.println("Your balance is to low");
            return;
        }
        balance -= amount;
        System.out.println("The amount "+amount +" Rs. was withdrawn successfully");
        
    }
    
    public void deposit(int amount)
    {
        balance += amount;
        System.out.println("The amount "+amount+" Rs. was successfully credited");
    }
    
    public void getBalance(){
        System.out.println("This is your balance: "+this.balance);
    }
    
}