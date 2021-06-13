public class BankAccountTest{
public static void main(String[]  args){
    member x =new member();
    member y =new member();
    y.SetCheckingBalance(5000);
    x.SetCheckingBalance(5000);
    y.Setwithdraw(2000);
    y.GetBankAccount();
    x.GetBankAccount();
    y.totalmany();

}
}