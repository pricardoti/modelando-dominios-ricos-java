package br.com.pricardoti.payment.domain.valueobjects;

import br.com.pricardoti.payment.shared.ValueObject;

public class Email implements ValueObject {

    private final String address;

    public Email(String address) {
        this.address = address;
    }

    public String getAddress() {
        return address;
    }
}
