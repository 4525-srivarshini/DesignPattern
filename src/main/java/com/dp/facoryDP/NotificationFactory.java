package com.dp.facoryDP;

public class NotificationFactory {
    public static Notification createNotification(String channel){
        {
            if (channel == null || channel.isEmpty())
                return null;
            switch (channel) {
                case "SMS":
                    return new SMSNotification();
                case "EMAIL":
                    return new EmailNotification();
                default:
                    throw new IllegalArgumentException("Unknown channel "+channel);
            }
        }
    }
    public static void main(String[] args)
    {
        Notification notification = createNotification("SMS");
        notification.notifyUser();
    }
}
