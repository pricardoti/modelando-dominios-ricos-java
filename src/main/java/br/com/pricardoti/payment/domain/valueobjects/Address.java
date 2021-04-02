package br.com.pricardoti.payment.domain.valueobjects;

public class Address {

    private final String street;
    private final String number;
    private final String neighborhood;
    private final String city;
    private final String state;
    private final String country;
    private final String zipCode;

    public Address(
            String street,
            String number,
            String neighborhood,
            String city,
            String state,
            String country,
            String zipCode
    ) {
        this.street = street;
        this.number = number;
        this.neighborhood = neighborhood;
        this.city = city;
        this.state = state;
        this.country = country;
        this.zipCode = zipCode;
    }

    public String getStreet() {
        return street;
    }

    public String getNumber() {
        return number;
    }

    public String getNeighborhood() {
        return neighborhood;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public String getCountry() {
        return country;
    }

    public String getZipCode() {
        return zipCode;
    }
}
