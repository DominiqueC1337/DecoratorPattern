package org.example.excercises.TaskThree; // DO NOT COPY THIS FOR ONLINE IDE USE

// https://www.online-java.com/
// https://www.jdoodle.com/online-java-compiler
public class Main {
    public static void main(String[] args) {
        Notifier notifier = new Notifier();
        SmsService smsService = new SmsService();
        FacebookService facebookService  = new FacebookService();
        SmsAndFacebookService smsAndFacebookService = new SmsAndFacebookService();




        System.out.println(notifier.sendMessage("message1", "email1"));
        System.out.println(smsService.messageSendtoSMS("message1", "email1", "1234"));
        System.out.println(smsAndFacebookService.messageSendtoSMSandFacebook("message1", "email1", "1234", "facebook"));
    }
}

class Notifier{
    public String sendMessage(String message, String email){
        return message + " sent to " + email;
    }
}

class SmsService extends Notifier{
    public String messageSendtoSMS(String message, String email, String number){
        return super.sendMessage(message, email) + "\n" + message + " sent to " + number;
    }
}

class FacebookService extends Notifier{
    public String messageSendtoFacebook(String message, String email, String facebookID){
        return super.sendMessage(message, email) + "\n" + message + " sent to " + facebookID;
    }

}

class SmsAndFacebookService extends Notifier{
    public String messageSendtoSMSandFacebook(String message, String email, String number, String facebookID){
        return super.sendMessage(message, email) + "\n" + message + " sent to " + number +"\n" + message + " sent to " + facebookID;
    }

}