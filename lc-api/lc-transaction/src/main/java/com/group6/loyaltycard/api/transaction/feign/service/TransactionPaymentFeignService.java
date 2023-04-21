package com.group6.loyaltycard.api.transaction.feign.service;

import com.group6.loyaltycard.api.transaction.feign.service.fallback.TransactionFeignServiceFallbackImpl;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@FeignClient(value = "lc-payment", fallback = TransactionFeignServiceFallbackImpl.class)
public interface TransactionPaymentFeignService {

    /**
     *
     * @param name
     * @return
     */
    @GetMapping("/test/{name}")
    String helloPayment(@PathVariable(name = "name") String name);

    @PostMapping("/addPayment")
    String addPaymentTransaction(@RequestBody String json);
}