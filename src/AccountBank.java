public class AccountBank extends Person{
    public String AccountNumber;
    public double Amount;
    public String Username;
    public String Password;

    public AccountBank( String name, int age, String address,String AccountNumber,double Amount,String Username,String Password){
        super(name, age,address);
        this.AccountNumber = AccountNumber;
        this.Amount=Amount;
        this.Username=Username;
        this.Password=Password;
    }
    public void print(){
        super.Print();
        System.out.println("AccountNumber: "+this.AccountNumber);
        System.out.println("Amount: "+this.Amount);
        System.out.println("Username: "+this.Username);
        System.out.println("Password: "+this.Password);
    }
}
