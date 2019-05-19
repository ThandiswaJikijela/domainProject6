package com.thandiswa.controller;

import com.thandiswa.domain.Payment;
import com.thandiswa.service.Impl.PaymentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping("Payment")
public class PaymentController {
    @Autowired
    @Qualifier("ServicePaymentImpl")
    private PaymentServiceImpl service;

    @PostMapping("/create")
    @ResponseBody
    public Payment create (Payment payment){
        return service.create(payment);
    }

    @PostMapping("/update")
    @ResponseBody
    public Payment update (Payment payment){
        return  service.update(payment);
    }

    @GetMapping("/delete/{memberId}")
    @ResponseBody
    public void delete(@PathVariable String memberId){
        service.delete(memberId);
    }

    @GetMapping("/read/{memberId}")
    @ResponseBody
    public Payment read(@PathVariable String memberId){
        return service.read(memberId);
    }

    @GetMapping("/getAll")
    @ResponseBody
    public Set<Payment> getAll(){
        return service.getAll();
    }
}
