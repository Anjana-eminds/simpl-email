package mail.sender.mailSenderApplication.service.impl;

import mail.sender.mailSenderApplication.entity.EmailDetails;

public interface EmailService {

    String sendSimpleMail(EmailDetails emailDetails);

    String sendMailWithAttachment(EmailDetails emailDetails);
}
