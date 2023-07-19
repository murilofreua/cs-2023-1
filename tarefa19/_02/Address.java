package main.java.org.example._02;

public class Address {
    
    private String city;
    private String street;
    private String house;
    private String quarter;
    private String country;

    public String getFullAddress() {
        
        StringBuilder result = new StringBuilder();

        return result
                .append(this.country + ", ")
                .append(this.city + ", ")
                .append(this.street + ", ")
                .append(this.house + ", ")
                .append(this.quarter).toString();
    }
}
