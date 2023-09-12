package Adapter.ThirdPartyBanks;

public class ICICIBankAPI {

    public float checkBalance(String AccountNumber){
        return 100.0f;
    }

    public char addBankAccount(BankAccountDetails bankAccountDetails){
        return 'Y';
    }

    public char makePayment(BankAccountDetails fromUser,BankAccountDetails toUser,double Amount){
        return 'Y';
    }
}

//both YES bank and ICICI bank API are completely different
