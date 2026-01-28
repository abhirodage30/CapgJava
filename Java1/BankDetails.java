class banks {
    int accNo;
    static int bankBalanc;
    int bankBalance;
    String name;
    
    banks(int accNo,int bankBalance,String name){
        this.accNo = accNo;
        this.bankBalance = bankBalance;
        this.name = name;
    }
    public static void deposit(int amount){
        bankBalanc = bankBalanc + amount;
        System.out.println("Depositted Successfully !!!");
    }
    public void withdraw(int amount){
        if(amount>bankBalanc){
            System.out.println("Insufficient Funds!!!");
        }else{
            bankBalanc -= amount;
            System.out.println("Withdrawl Successfully !!!");
        }
    }
    public void checkBsalance(){
        System.out.println(bankBalanc);
    }
     
}

class BankDetails{
    public static void main(String[] args) {
        banks b1 = new banks(6786, 50940, "MC Stan");
        banks b2 = new banks(1111, 96875, "Danish Bhai");
        // b1.deposit(5000);
        b1.checkBsalance();
        b2.withdraw(104515);
        b2.checkBsalance();

    }
}