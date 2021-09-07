package br.com.pricardoti.payment.domain.valueobjects;

import br.com.pricardoti.payment.domain.enums.DocumentTypeEnum;
import br.com.pricardoti.payment.shared.ValueObject;
import br.com.pricardoti.payment.shared.notifications.Notifiable;
import br.com.pricardoti.payment.shared.notifications.Notification;

public class Document extends Notifiable<Notification> implements ValueObject {

    private final String number;
    private final DocumentTypeEnum type;

    public Document(String number, DocumentTypeEnum type) {
        this.number = number;
        this.type = type;
    }

    public String getNumber() {
        return number;
    }

    public DocumentTypeEnum getType() {
        return type;
    }
}
