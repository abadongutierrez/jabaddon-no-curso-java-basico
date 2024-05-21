
void main() {
    // create an object of type Address
    Address address = new Address();
    address.street = "123 Main St";
    address.city = "Miami";
    address.state = "FL";
    address.zip = "33101";

    // call the print method
    address.print();
}

class Address {
    // state
    String street;
    String city;
    String state;
    String zip;

    // behavior
    void print() {
        System.out.println(street);
        System.out.println(city + ", " + state + " " + zip);
    }
}
