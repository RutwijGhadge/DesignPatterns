package Adapter;

import Adapter.ThirdPartyBanks.BankAccountDetails;
import Adapter.ThirdPartyBanks.ICICIBankAPI;

public class ICICIBankAPIAdapter implements BankAPIAdapter{
    //now this ICICIBankAPIAdapter will talk with the ICICIBankAPI
    private ICICIBankAPI iciciBankAPI; //object of 3rd party so that we can call methods of 3rd partyss

    @Override
    public int getBalance(String AccountNumber) {
        float balance=iciciBankAPI.checkBalance("123");
        return (int)balance;
    }

    @Override
    public boolean addBankAccount(String userName, String AccountNumber) {
        BankAccountDetails bankAccountDetails=new BankAccountDetails("Rutu","1234","ICICI");
        char res=iciciBankAPI.addBankAccount(bankAccountDetails);
        if(res=='Y')
            return true;
        return false;
    }

    @Override
    public boolean transferAmount(String fromUser, String toUser, int amount) {
        BankAccountDetails fromUser1=new BankAccountDetails("Rutu","1234","ICICI");
        BankAccountDetails toUser1=new BankAccountDetails("Ashish","784","ICICI");

        char res=iciciBankAPI.makePayment(fromUser1,toUser1,100);
        if(res=='Y')
            return true;
        return false;

    }
}
