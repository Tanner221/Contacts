public class contact {
    private String firstName;
    private String lastName;
    private double phoneNumber;

    public contact() {
    }
    public contact(String firstName, String lastName, double phoneNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
    }
    public contact(contact c){
        this.firstName = c.firstName;
        this.lastName = c.lastName;
        this.phoneNumber = c.phoneNumber;
    }
    public String getFirstName(){
        return this.firstName;
    }
    public String getLastName(){
        return this.lastName;
    }
    public void display(){
        String phone = String.format("%.0f", phoneNumber);
        System.out.println("Name: " + getFirstName() + " " + getLastName());
        System.out.println("Phone Number: " + phone + "\n");
    }
}
