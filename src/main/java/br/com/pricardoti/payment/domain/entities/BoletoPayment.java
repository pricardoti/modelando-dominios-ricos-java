package br.com.pricardoti.payment.domain.entities;

import java.time.LocalDate;
import java.util.UUID;

public class BoletoPayment extends Payment {

    private final Long boletoNumber;
    private final String barCode;

    private BoletoPayment(
            LocalDate paidDate,
            LocalDate expireDate,
            Double total,
            Double paidtotal,
            String payer,
            String document,
            String address,
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