package br.com.pricardoti.payment.domain.entities;

import br.com.pricardoti.payment.domain.valueobjects.Address;
import br.com.pricardoti.payment.domain.valueobjects.Document;
import br.com.pricardoti.payment.domain.valueobjects.Email;

import java.util.ArrayList;
import java.util.List;

import static java.util.Collections.unmodifiableList;

public class Student {

    private final String firstName;
    private final String lastName;
    private final Document document;
    private final Email email;
    private final List<Subscription> subscriptions = new ArrayList<>();

    private Address address;

    public Student(
            String firstName,
            String lastName,
            Document document,
            Email email
    ) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.document = document;
        this.email = email;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Document getDocument() {
        return document;
    }

    public Email getEmail() {
        return email;
    }

    public Address getAddress() {
        return address;
    }

    public List<Subscription> getSubscriptions() {
        return unmodifiableList(subscriptions);
    }

    public void addSubscription(Subscription subscription) {
        subscriptions.forEach(Subscription::deactivated);
        subscriptions.add(subscription);
    }
}
