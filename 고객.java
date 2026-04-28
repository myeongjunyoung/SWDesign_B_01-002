public class Customer {
    private String id;         고객 id
    private String password;   암호
    private String name;       성명

    public Customer(String id, String password, String name) {
        this.id = id;
        this.password = password;
        this.name = name;
    }

    public String getId() { return id; }
    public String getPassword() { return password; }
    public String getName() { return name; }
}