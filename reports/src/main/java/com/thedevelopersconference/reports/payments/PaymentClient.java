package com.thedevelopersconference.reports.payments;

import com.thedevelopersconference.reports.response.PaymentResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@FeignClient(name = "payments", url = "http://localhost:8080/payments")
public interface PaymentClient {
    @RequestMapping(method = RequestMethod.GET, value = "/")
    List<PaymentResponse> getAllPayments();
}
