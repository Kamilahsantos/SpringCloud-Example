package com.thedevelopersconference.reports.controller;


import com.thedevelopersconference.reports.payments.PaymentClient;
import com.thedevelopersconference.reports.payments.PaymentDetailsClient;
import com.thedevelopersconference.reports.response.PaymentResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j
@RestController
public class ReportsController {

    @Autowired
    PaymentClient paymentClient;

    @Autowired
    PaymentDetailsClient paymentDetailsClient;

    @GetMapping("/reports")
    public List<PaymentResponse> getAllPayments() {
        log.info("Gerando relatório com todos os pagamentos desse usuário");
        return paymentClient.getAllPayments();


    }


    @GetMapping("/details")
    public PaymentResponse getPaymentDetails() {
        log.info("Gerando relatório com as transações detalhadas desse usuário");
        return paymentDetailsClient.getPaymentDetails();


    }


}


