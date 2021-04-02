package br.com.pricardoti.payment.domain.entities;

import br.com.pricardoti.payment.domain.valueobjects.Address;
import br.com.pricardoti.payment.domain.valueobjects.Document;

import java.time.LocalDate;

public class BoletoPayment extends Payment {

    private final Long boletoNumber;
    private final String barCode;

    private BoletoPayment(
            LocalDate paidDate,
            LocalDate expireDate,
            Double total,
            Double paidtotal,
            String payer,
            Document document,
            Address address,
            Long boletoNumber,
            String barCode
    ) {
        super(paidDate, expireDate, total, paidtotal, payer, document, address);
        this.barCode = barCode;
        this.boletoNumber = boletoNumber;
    }

    public Long getBoletoNumber() {
        return boletoNumber;
    }

    public String getBarCode() {
        return barCode;
    }

}