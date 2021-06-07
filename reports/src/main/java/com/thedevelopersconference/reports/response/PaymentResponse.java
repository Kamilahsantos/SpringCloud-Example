package com.thedevelopersconference.reports.response;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class PaymentResponse {
    private String paymentUUID;
    private Long amount;
    private String debitAccountUUID;
    private String creditAccountUUID;
    private Long taxAmount;

}
