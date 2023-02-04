package com.dvops.maven.eclipse;

import java.io.IOException;
import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/sendFeedback")
public class SendFeedbackServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        final String username = "harizjamil7@gmail.com";
        final String password = "ivmjglmiigjtajmh";

        String name = request.getParameter("name");
        String email = request.getParameter("email");
        String subject = request.getParameter("subject");
        String message = request.getParameter("message");

        Properties props = new Properties();
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.smtp.port", "587");

        Session session = Session.getInstance(props, new EmailAuthenticator(username, password));

        try {
            Message feedbackMessage = new MimeMessage(session);
            feedbackMessage.setFrom(new InternetAddress(email));
            feedbackMessage.setRecipients(Message.RecipientType.TO, InternetAddress.parse("harizjamil7@gmail.com"));
            feedbackMessage.setSubject(subject);
            feedbackMessage.setText(name + " wrote the following message:\n\n" + message);
            Transport.send(feedbackMessage);
        } catch (MessagingException e) {
            throw new RuntimeException(e);
        }
        response.sendRedirect("http://localhost:8090/devops_project/TodoServlet/dashboardd");
    }

    private static class EmailAuthenticator extends javax.mail.Authenticator {
        private final String username;
        private final String password;

        public EmailAuthenticator(String username, String password) {
            this.username = username;
            this.password = password;
        }

        protected PasswordAuthentication getPasswordAuthentication() {
            return new PasswordAuthentication(username, password);
        }
    }
}
