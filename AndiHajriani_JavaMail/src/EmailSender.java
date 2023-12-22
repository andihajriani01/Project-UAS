import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.Properties;
import java.security.Security;
import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;

public class EmailSender {

    public static void main(String[] args) {
        final String username = "andihajriani30@gmail.com";
        final String password = "Admin01";

        // Set properties
        Properties properties = new Properties();
        properties.put("mail.smtp.auth", "true");
        properties.put("mail.smtp.starttls.enable", "true");
        properties.put("mail.smtp.host", "smtp.gmail.com");
        properties.put("mail.smtp.port", "587");

        try {
            // Set up the SSL context to use TLS
            SSLContext sslContext = SSLContext.getInstance("TLS");
            sslContext.init(null, new TrustManager[]{new X509TrustManager() {
                public void checkClientTrusted(java.security.cert.X509Certificate[] chain, String authType) {
                }

                public void checkServerTrusted(java.security.cert.X509Certificate[] chain, String authType) {
                }

                public java.security.cert.X509Certificate[] getAcceptedIssuers() {
                    return new java.security.cert.X509Certificate[]{};
                }
            }}, new java.security.SecureRandom());

            // Set the SSL context to the properties
            properties.put("mail.smtp.ssl.socketFactory", sslContext.getSocketFactory());
        } catch (Exception e) {
            e.printStackTrace();
        }

        // Create session
        Session session = Session.getInstance(properties, new Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(username, password);
            }
        });

        try {
            // Create a default MimeMessage object
            Message message = new MimeMessage(session);
            // Set From: header field of the header
            message.setFrom(new InternetAddress(username));
            // Set To: header field of the header
            message.setRecipients(Message.RecipientType.TO, InternetAddress.parse("recipient_email@example.com"));
            // Set Subject: header field
            message.setSubject("Testing Email");
            // Now set the actual message
            message.setText("Hello, this is a test email!");
            // Send message
            Transport.send(message);
            System.out.println("Email sent successfully.");
        } catch (MessagingException e) {
            e.printStackTrace();
        }
    }
}
