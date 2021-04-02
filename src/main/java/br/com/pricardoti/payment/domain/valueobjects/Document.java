package br.com.pricardoti.payment.domain.valueobjects;

import br.com.pricardoti.payment.domain.enums.DocumentTypeEnum;

public class Document {

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
