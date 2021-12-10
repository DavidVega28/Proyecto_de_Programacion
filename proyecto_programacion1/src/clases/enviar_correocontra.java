/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

import java.io.UnsupportedEncodingException;
import java.util.Properties;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.swing.JOptionPane;

public class enviar_correocontra {
    static final String FROM = "pruebasprograuni@gmail.com";
    static final String FROMNAME = "Envio de contraseña";
    private String TO;
    
    public enviar_correocontra(String TO) {
        this.TO = TO;
    }

    static final String SMTP_USERNAME = "pruebasprograuni@gmail.com";
    static final String SMTP_PASSWORD = "JDVRlmcq001";
    
    static final String CONFIGSET = "ConfigSet";
    
    static final String HOST = "smtp.gmail.com";
    
    static final int PORT = 587;
    
    static final String SUBJECT = "Envio de contraseña";
    
    static final String BODY = "Estimado aqui le enviamos la contraseña";
    
    public void enviarcorreo_contra() throws UnsupportedEncodingException, MessagingException {
     
        Properties props = System.getProperties();
        props.put("mail.transport.protocol", "smtp");
        props.put("mail.smtp.port", PORT); 
    	props.put("mail.smtp.starttls.enable", "true");
    	props.put("mail.smtp.auth", "true");
        
        Session session = Session.getDefaultInstance(props);
        
        MimeMessage mg = new MimeMessage(session);
        mg.setFrom(new InternetAddress(FROM, FROMNAME));
        mg.setRecipient(Message.RecipientType.TO, new InternetAddress(TO));
        mg.setSubject(SUBJECT);
        mg.setContent(BODY,"text/html");
        
        mg.setHeader("X-SES-CONFIGURATION-SET", CONFIGSET);
        
        Transport transport = session.getTransport();
        
        try {
            transport.connect(HOST,SMTP_USERNAME,SMTP_PASSWORD);
            transport.sendMessage(mg, mg.getAllRecipients());
            JOptionPane.showMessageDialog(null, "Correo con la contraseña del usuario enviado");
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Correo no enviado");
            System.out.println(e.getMessage());
        }finally{
            transport.close();
        }
        
    }
}

