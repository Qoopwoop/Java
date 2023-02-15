public class Main
{
public static void main(String args[])
{
SBI sbi = new SBI();
sbi.credit(1000.00,500.00);
sbi.debit(20000.00,1750.00);
sbi.generatepassbook();
sbi.printpassbook();
}
}
