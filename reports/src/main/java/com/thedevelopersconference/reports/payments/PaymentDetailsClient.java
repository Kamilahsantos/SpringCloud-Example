package com.thedevelopersconference.reports.payments;


import com.thedevelopersconference.reports.response.PaymentResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name = "details", url = "http://localhost:8080/details")
public interface PaymentDetailsClient {
    @RequestMapping(method = RequestMethod.GET, value = "/")
    PaymentResponse getPaymentDetails();
}

