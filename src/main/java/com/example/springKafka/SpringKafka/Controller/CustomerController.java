package com.example.springKafka.SpringKafka.Controller;

import com.example.springKafka.SpringKafka.Producer.CustomerProducer;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/customer")
public class CustomerController {

   private CustomerProducer customerProducer;

    public CustomerController(CustomerProducer customerProducer) {
        this.customerProducer = customerProducer;
    }

    @GetMapping("/publish")
    public ResponseEntity<String> getData(@RequestParam("message") String msg){

        customerProducer.sendMessage(msg);

        return ResponseEntity.ok("Message has been sent to the Topic");
    }
}
