package br.com.pricardoti.payment.valueobjects;

import br.com.pricardoti.payment.domain.enums.DocumentTypeEnum;
import br.com.pricardoti.payment.domain.valueobjects.Document;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

@DisplayName("Document Tests")
public class DocumentTest {

    // TODO: adicionar mais casos de testes variados para dados inválidos
    // para CNPJ e CPF.

    @Nested
    @DisplayName("Document CNPJ")
    class DocumentCNPJTest {
        @Test
        @DisplayName("CNPJ inválido")
        void shouldReturnErrorWhenCNPJIsInvalid() {
            final Document document = new Document("12312312312312", DocumentTypeEnum.CNPJ);
            assertFalse(document.isInValid(), "O documento não está inválido.");
        }

        @Test
        @DisplayName("CNPJ válido")
        void shouldReturnErrorWhenCNPJIsValid() {
            final Document document = new Document("20886400023", DocumentTypeEnum.CNPJ);
            assertTrue(document.isValid(), "O documento não está válido.");
        }
    }

    @Nested
    @DisplayName("Document CPF")
    class DocumentCPFTest {
        @Test
        @DisplayName("CPF inválido")
        void shouldReturnErrorWhenCNPJIsInvalid() {
            final Document document = new Document("12312312312", DocumentTypeEnum.CPF);
            assertFalse(document.isInValid(), "O documento não está inválido.");
        }

        @Test
        @DisplayName("CPF válido")
        void shouldReturnErrorWhenCNPJIsValid() {
            final Document document = new Document("20886400023", DocumentTypeEnum.CPF);
            assertTrue(document.isValid(), "O documento não está válido.");
        }
    }

}
