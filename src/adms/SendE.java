package adms;

import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;


public class SendE {
	public String r="fail";
	public String sendEm(String username,String password,String remail,String u, String otp,String course)
	{
		Properties props = new Properties();
		props.put("mail.smtp.auth", "true");
		props.put("mail.smtp.starttls.enable", "true");
		props.put("mail.smtp.host", "smtp.gmail.com");
		props.put("mail.smtp.port", "587");

		Session session = Session.getInstance(props,
		  new javax.mail.Authenticator() {
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication(username, password);
			}
		  });

		try {

			Message message = new MimeMessage(session);
			message.setFrom(new InternetAddress(username));
			message.setRecipients(Message.RecipientType.TO,
				InternetAddress.parse(remail));
			message.setSubject("TGI: Admission Registration for "+course);
			message.setText("Dear "+u
				+ ",\n\nCogratulations!\nYour Registration is Completed..\nYour OTP is "+otp+"\nPlease complete enquiry form of Course:"+course+"\nThank You!\n\nTrident Group of Instituition\nBhubneswar\nOdisha");

			Transport.send(message);
            r="success";
		} catch (MessagingException e) {
			throw new RuntimeException(e);
		}


		return r;
	}

}
