package market.model;

public class User {

    protected String userName, password;

    public User(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }

    public void addAddressToUserList(Address a){
        System.out.println("Method not Allowed. User shouldn't be created.");
    }

    public void setProvider(Provider provider) {
        System.out.println("Method not Allowed. User shouldn't be created.");
    }
}
