package com.jkproductions.kafka.springkafkaproducer.resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by
 *
 * @author jaikishorgohil
 */

@RestController
@RequestMapping("kafka")
public class UserResource {
    @GetMapping("/publish/{message}")
    public String post(@PathVariable("message") final String message) {
        return "Published Successfully";
    }
}
