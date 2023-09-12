package Adapter.ThirdPartyBanks;

public class YesBankAPI {
    public float Balance(String CustomerId){
        return 100.0f;
    }

    public void updateBankAccountDetails(String userName,String AccountNumber){
        //if Something goes wrong might throw exception
    }

    public int TransferMoney(String fromUser,String toUser,int Amount){
        return 1;
    }
}


//both YES bank and ICICI bank API are completely different
