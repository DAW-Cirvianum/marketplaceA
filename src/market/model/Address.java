package market.model;

public class Address {
    private String refAddress, address;

    public Address(String refAddress, String address) {
        this.refAddress = refAddress;
        this.address = address;
    }

    public Address(String address) {
        this.address = address;
        this.refAddress = "Default Provider Address";
    }
}
