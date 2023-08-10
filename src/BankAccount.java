public class BankAccount {
    private int accountNumber;
    private String accountName;
    private int balance;
    private Date openingDate;

    public BankAccount(){
    }

    public BankAccount(int accountNumber,String accountName,int balance,int day,int month,int year){
        this.accountNumber = accountNumber;
        this.accountName = accountName;
        this.balance = balance;
        this.openingDate = new Date(day,month,year);
    }

    public void display(){
        System.out.println("accountNumber = " + accountNumber);
        System.out.println("accountName = " + accountName);
        System.out.println("balance = " + balance);
        System.out.println("openingDate = " + openingDate.getDay() + " " + openingDate.getMonth() + " " + openingDate.getYear());
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public Date getOpeningDate() {
        return openingDate;
    }

    public void setOpeningDate(Date openingDate) {
        this.openingDate = openingDate;
    }
}
