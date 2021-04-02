package br.com.pricardoti.payment.domain.enums;

public enum DocumentTypeEnum {

    CPF(1),
    CNPJ(2);

    private Integer codigo;

    DocumentTypeEnum(Integer codigo) {
        this.codigo = codigo;
    }

    public Integer getCodigo() {
        return codigo;
    }
}
