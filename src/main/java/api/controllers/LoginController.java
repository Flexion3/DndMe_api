package api.controllers;

import api.inputs.RegisterInput;
import api.common.responses.SuccesResponse;
import api.services.MailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
public class LoginController {
    @Autowired
    MailService mailService;

    @PostMapping("/register")
    public ResponseEntity<Object> register(@RequestBody RegisterInput registerInput){
        mailService.prepareAndSend(registerInput.getEmail(), "Good job, you.", "Your registration was a succes. You are great." );
        return new SuccesResponse("send");
    }
}
