package Adapter;

import Adapter.ThirdPartyBanks.YesBankAPI;

public class YESBankAPIAdapter implements BankAPIAdapter{
    private YesBankAPI yesBankAPI;
//same implementation can be done here similar to ICICIBankAPIAdapter class
    @Override
    public int getBalance(String AccountNumber) {
        //this will implement methods from YESBankAPI class
        return (int)yesBankAPI.Balance("123");
    }

    @Override
    public boolean addBankAccount(String userName, String AccountNumber) {
        return false;
    }

    @Override
    public boolean transferAmount(String fromUser, String toUser, int amount) {
        return false;
    }
}
