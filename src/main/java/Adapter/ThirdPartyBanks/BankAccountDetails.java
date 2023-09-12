package Adapter.ThirdPartyBanks;

public class BankAccountDetails {

    private String customerName;
    private String accountNumber;
    private String IFSCcode;

    public BankAccountDetails(String customerName, String accountNumber, String IFSCcode) {
        this.customerName = customerName;
        this.accountNumber = accountNumber;
        this.IFSCcode = IFSCcode;
    }
}
