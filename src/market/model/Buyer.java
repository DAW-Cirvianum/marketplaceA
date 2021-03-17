package market.model;

public class Buyer extends User{
    private Address[] listAddress = new Address[100];
    private String nameBuyer;
    private String mailBuyer;
    private int counterAddress;

    public Buyer(String userName, String password, String nameBuyer, String mailBuyer) {
        super(userName, password);
        this.nameBuyer = nameBuyer;
        this.mailBuyer = mailBuyer;
        this.counterAddress=0;
    }

    @Override
    public void addAddressToUserList(Address a){
        this.listAddress[this.counterAddress] = a;
        this.counterAddress++;
    }

}
