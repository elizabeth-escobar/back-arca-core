package com.arka.back_arka_core.controller;


import com.arka.back_arka_core.request.ClientRequest;
import com.arka.back_arka_core.response.ClientResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/client")

public class ClientController {

    @PostMapping("/create")
    public ResponseEntity<ClientResponse> create(@RequestBody ClientRequest clientRequest){
        return ResponseEntity.ok(body: null);

    }
}
