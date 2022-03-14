/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacrud.tech;

import java.util.Properties;
import java.util.Date;
import javax.mail.Session; 
import javax.mail.PasswordAuthentication;
import javax.mail.Message; 
import javax.mail.MessagingException;
import javax.mail.Transport; 
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage; 
import javax.activation.DataHandler;
/**
 *
 * @author g.viney
 */
public class GestionSMTP {
    
    String user;
    String password;
    Session session;
    MimeMessage message;
    String mailTo;
    String mailObj;
    String mailMsg;
    
    private void initCon(){
    // Paramétrer l'objet "session"
    Properties props = new Properties();
    props.put("mail.transport.protocol", "smtp");
    props.put("mail.smtp.host", "mail.st2msi.net"); // hébergeur smtp
    props.put("mail.stmp.port", "465"); // port smtp
    props.put("mail.smtp.auth", "true");
    props.put("mail.smtp.socketFactory.port", "465"); //SSL Port
    props.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory"); //SSL Factory Class
    this.session = Session.getDefaultInstance(props, new javax.mail.Authenticator() {
    protected PasswordAuthentication getPasswordAuthentication() {
    return new PasswordAuthentication(user, password);
    }
     });
    }
    
    public void closeSMTPCon(){
        this.session = null; 
    }
    
    
     public void sendMsg() throws Exception { // exception traité par l'appelant
        this.message = new MimeMessage(session);
        this.message.setFrom(new InternetAddress(user));
        this.message.addRecipient(Message.RecipientType.TO, new InternetAddress(mailTo.strip()));
        this.message.addHeader("Content-type", "text/HTML; charset=UTF-8");
        this.message.addHeader("format", "flowed");
        this.message.addHeader("Content-Transfer-Encoding", "8bit");
        this.message.setHeader("X-Mailer", "st2msi.net/JavaMail version 1.6.2");
        this.message.setSentDate(new Date());
        this.message.setSubject(mailObj.strip(), "UTF-8");
        message.setText(mailMsg, "UTF-8");
        //send the message
        session.setDebug(true); // passer à false en production
        Transport.send(message);
    }
     
     public GestionSMTP(){
         this.user = "guillaume.viney@st2msi.net";
         this.password = "7tT.lKUP=3BN";
         initCon();
     }

    public String getMailTo() {
        return mailTo;
    }

    public void setMailTo(String mailTo) {
        this.mailTo = mailTo;
    }

    public String getMailObj() {
        return mailObj;
    }

    public void setMailObj(String mailObj) {
        this.mailObj = mailObj;
    }

    public String getMailMsg() {
        return mailMsg;
    }

    public void setMailMsg(String mailMsg) {
        this.mailMsg = mailMsg;
    }

    
     
     
    
}
