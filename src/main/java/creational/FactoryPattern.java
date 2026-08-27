package creational;

import model.*;

import static util.GlobalConstants.*;

/*Here we just expose a method to CREATE, SERVE the object as well as use dynamic polymorphism so that we
 make subclass instatiation dynamic, such that there is compile time hiding of exact subclass type of the object. */
public class FactoryPattern {

    public static void main(String[] args) {
        System.out.println(getNotificationModel("EMAIL").getClass());// prints the subtype
    }

    public static Notification getNotificationModel(String type) {
        switch (type.toUpperCase()) {
            case EMAIL_NOTIFICATION:
                return new EmailNotification();
            case SMS_NOTIFICATION:
                return new SmsNotification();
            case WHATSAPP_NOTIFICATION:
                return new WhatsappNotification();
            default:
                return new DefaultNotification();
        }


    }
}
