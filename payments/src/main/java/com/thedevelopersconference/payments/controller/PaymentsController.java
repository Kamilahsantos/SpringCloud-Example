package com.thedevelopersconference.payments.controller;

import com.thedevelopersconference.payments.response.PaymentResponse;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j
@RestController
public class PaymentsController {

    @GetMapping("/payments")
    public List<PaymentResponse> getAllPayments() {
        log.info("Listando todos os pagamentos deste usuario");
        return List.of(PaymentResponse.builder()
                .paymentUUID("931a98d7-7a2d-4966-a164-8cddcbb2615f")
                .amount(6000L)
                 .taxAmount(60L)
                .build(),
                PaymentResponse.builder()
                .paymentUUID("be715e99-d81e-4aae-b16f-cd072af78a5e")
                        .amount(12000L)
                        .taxAmount(120L)
                        .build(),
                PaymentResponse.builder()
                        .paymentUUID("1a63aa4b-5b3f-4f89-9d74-789d9fda3c68")
                        .amount(10L)
                         .build(),
                PaymentResponse.builder()
                        .paymentUUID("0b08c4d7-4097-4292-8613-887b95332322")
                        .amount(300L)
                         .build());


    }

    @GetMapping("/details")
    public PaymentResponse getPaymentDetails() {
        log.info("Trazendo detalhes da transacao");
        return PaymentResponse.builder().
                paymentUUID("931a98d7-7a2d-4966-a164-8cddcbb2615f").
                amount(100L)
                .creditAccountUUID("b04f04e3-7679-48dd-9493-b717a05292e5")
                .debitAccountUUID("42cf33ad-f8b0-4d95-ae68-860798f68eea")
                .taxAmount(10L)
                .build();


    }


}
