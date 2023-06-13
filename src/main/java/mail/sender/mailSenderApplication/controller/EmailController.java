package mail.sender.mailSenderApplication.controller;

import mail.sender.mailSenderApplication.entity.EmailDetails;
import mail.sender.mailSenderApplication.service.impl.EmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmailController {

    @Autowired
    private EmailService emailService;
    String status;

    @PostMapping("/sendMail")
    public Object sendSimpleMail(@RequestBody EmailDetails emailDetails){
        return status = emailService.sendSimpleMail(emailDetails);
    }

    @PostMapping("sendMailWithAttachment")
    public Object sendMailWithAttachment(@RequestBody EmailDetails emailDetails){
        return status = emailService.sendMailWithAttachment(emailDetails);
    }

}
