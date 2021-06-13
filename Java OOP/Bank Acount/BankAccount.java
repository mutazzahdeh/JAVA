import java.util.Random;
public class BankAccount{
    private String accountNumber="";
    private double checkingBalance=0;
    private double savingBalance=0;
    private static int number=0;
    private static double  totalAmount=0;
    public BankAccount(){
      random();
      this.number++; 
    }

public void random(){
    Random ran = new Random();
    for(int i=0;i<9;i++){
    this.accountNumber+=String.valueOf(ran.nextInt(9));
   

    }
     System.out.println(this.accountNumber);
}
public void GetBankAccount(){
    System.out.println(this.checkingBalance);
}
public void GetSavingBalanc(){
    System.out.println(this.savingBalance);
}
public void SetCheckingBalance(double amount){
    this.checkingBalance+=amount;
    this.savingBalance+=amount;
    this.totalAmount+=amount;

}

public void Setwithdraw(double amount){
     if (amount>this.savingBalance)
     System.out.println("no enough Balance");
     else{
    this.checkingBalance-=amount;
    this.savingBalance-=amount;
    this.totalAmount-=amount;
     }
}
public void totalmany(){
    System.out.println(this.totalAmount);
}
}