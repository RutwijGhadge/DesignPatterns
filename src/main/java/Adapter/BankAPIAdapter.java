package Adapter;

public interface BankAPIAdapter {
    int getBalance(String AccountNumber);
    boolean addBankAccount(String userName,String AccountNumber);
    boolean transferAmount(String fromUser,String toUser,int amount);
}
