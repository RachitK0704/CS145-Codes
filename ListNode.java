public class ListNode {
    private String firstName;
    private String lastName;
    private String address;
    private String city;
    private String mobile;
    
    public ListNode(String firstName, String lastName, String address, String city, String mobile) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.city = city;
        this.mobile = mobile;
    }
    public String toString() {
        return "Full Name: '" + firstName + " " + lastName + '\'' +
                ", Address: '" + address + '\'' +
                ", City: '" + city + '\'' +
                ", Mobile: '" + mobile + '\'';
    }
    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }
    public String getMobile() {
        return mobile;
    }
    public void setMobile(String mobile) {
        this.mobile = mobile;
    }
}