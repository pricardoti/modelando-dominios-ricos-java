package br.com.pricardoti.payment.domain.valueobjects;

public class Email {

    private final String address;

    public Email(String address) {
        this.address = address;
    }

    public String getAddress() {
        return address;
    }
}
