package Adapter;

public class Phonepay {
  // private YesBankAPI yesBankAPI; -> tightly coupled
    private BankAPIAdapter bankAPIAdapter;  //instead Phonepay will be dependent on bankApiAdapter

    public void getBalance(){
        //yesBankAPI.Balance("123");//this is for yesbankApi
        //in case of ICICI bank API we have to change the whole code
    }

  public Phonepay() {
    bankAPIAdapter=new YESBankAPIAdapter();//only this changes needs to be done now
    bankAPIAdapter=new ICICIBankAPIAdapter();
  }

  public void addBankAccount(){

    }
    public void transferAmount(){

    }

}

/*
if we tightly coupled phonepay class with the yesbankapi / icicibank API
classes we have to do the lot of changes in the code
which will obviously not feasible
*/

/*Structure / Flow of Adapter Design Pattern now is
        PhonePay -> BankAPIAdapter -> ICICI/YES BankAPIADAPTER -> ICICI/YES BankAPI (ThirdPartyApplication)
        */
