package br.com.pricardoti.payment.domain.entities;

import java.util.ArrayList;
import java.util.List;

import static java.util.Collections.unmodifiableList;

public class Student {

    private final String firstName;
    private final String lastName;
    private final String document;
    private final String email;
    private final List<Subscription> subscriptions = new ArrayList<>();

    private String address;

    public Student(
            String firstName,
            String lastName,
            String document,
            String email
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

    public String getDocument() {
        return document;
    }

    public String getEmail() {
        return email;
    }

    public String getAddress() {
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
