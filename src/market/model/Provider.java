package market.model;

public class Provider {

    private String idProvider, name;
    private Address address;
    private Product[] listProducts = new Product[1000];

    public Provider(String idProvider, String name, Address address) {
        this.idProvider = idProvider;
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }
}
