package io.pragra.learning.billingservice.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/billing")
public class CellulerBilling {

    @GetMapping("/monthly")
    public String genMonthlyInvoice(){
        return "Your Bill is $125";
    }
}
