package market.model;

public class Seller extends User{

    private float rating;
    Provider provider;

    public Seller(String userName, String password) {
        super(userName, password);
    }

    @Override
    public void setProvider(Provider provider) {
        this.provider = provider;
    }
}
