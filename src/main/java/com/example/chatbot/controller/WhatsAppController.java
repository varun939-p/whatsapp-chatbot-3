package com.example.chatbot.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/whatsapp")
public class WhatsAppController {

    @GetMapping
    public String hello() {
        return "Chatbot backend is live!";
    }

    @PostMapping("/send")
    public ResponseEntity<String> sendMessage(@RequestBody String message) {
        System.out.println("Received: " + message);
        return ResponseEntity.ok("Message sent: " + message);
    }
}
